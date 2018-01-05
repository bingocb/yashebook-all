package com.yashebook.rpc;

import com.yashebook.service.MainService;
import com.yashebook.utils.SpringUtils;
import lombok.extern.slf4j.Slf4j;
import org.apache.thrift.TException;
import org.apache.thrift.protocol.TBinaryProtocol;
import org.apache.thrift.server.TServer;
import org.apache.thrift.server.TThreadPoolServer;
import org.apache.thrift.transport.TFastFramedTransport;
import org.apache.thrift.transport.TServerSocket;
import org.apache.thrift.transport.TServerTransport;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.net.InetSocketAddress;

/**
 * Created by binchen on 2017/12/11.
 */
@Slf4j
public class Server extends Thread{

    /**
     * 这个服务的密码
     */
    private String licence = null;

    private String host="localhost";
    private int port = 9090;

    public Server(){}

    public Server(String licence, String host, int port){
        this.licence = licence;
        this.host = host;
        this.port = port;
    }

    class RPCServiceImpl implements RPCService.Iface {


        @Override
        public String call(String licence, String sn, String content) throws TException {
            try {
                MainService service = SpringUtils.getBean(MainService.class);
                return service.call(content);
            } catch (Exception e) {
                e.printStackTrace();
                //TODO 处理异常
                return "call is error";
            }
        }
    }

    public void run() {
        RPCService.Processor<RPCServiceImpl> processor = new RPCService.Processor<>(new RPCServiceImpl());
        TServer server = null;
        try {
            TServerTransport serverTransport = new TServerSocket(new InetSocketAddress(host, port));
            TThreadPoolServer.Args trArgs = new TThreadPoolServer.Args(serverTransport);
            trArgs.processor(processor);
            trArgs.protocolFactory(new TBinaryProtocol.Factory(true, true));
            trArgs.transportFactory(new TFastFramedTransport.Factory());
            server = new TThreadPoolServer(trArgs);
            server.serve();
        } catch (Exception e) {
            e.printStackTrace();
            if (server != null && server.isServing())
                server.stop();
            System.exit(-1);
        }
    }

    public String getLicence() {
        return licence;
    }

    public void setLicence(String licence) {
        this.licence = licence;
    }

    public String getHost() {
        return host;
    }

    public void setHost(String host) {
        this.host = host;
    }

    public int getPort() {
        return port;
    }

    public void setPort(int port) {
        this.port = port;
    }
}
