package com.yashebook.rpc;

import org.apache.thrift.TException;
import org.apache.thrift.protocol.TBinaryProtocol;
import org.apache.thrift.protocol.TProtocol;
import org.apache.thrift.transport.TFramedTransport;
import org.apache.thrift.transport.TSocket;
import org.apache.thrift.transport.TTransport;
import org.apache.thrift.transport.TTransportException;

public class RPCServiceClient {

    private String host = null;
    private Integer port = null;
    private Integer timeout = 30000;
    private static Integer poolSize = 100;

    public RPCServiceClient() {
        super();
    }

    public RPCServiceClient(String host, Integer port) {
        super();
        this.host = host;
        this.port = port;
    }

    //增加 长连接池
    //TODO 异常情况还没有处理
    public String call(String licence,String sn, String json_args) {
        TTransport transport = null;
        try {
            transport = new TFramedTransport(new TSocket(host, port, timeout));
            // 协议要和服务端一致,使用二进制协议
            TProtocol protocol = new TBinaryProtocol(transport);
            RPCService.Client client = new RPCService.Client(protocol);
            transport.open();
            String result = client.call(licence,sn, json_args);
            return result;
        } catch (TTransportException e) {
            e.printStackTrace();
        } catch (TException e) {
            e.printStackTrace();
        } finally {
            if (null != transport) {
                transport.close();
            }
        }
        return null;
    }

    public String getHost() {
        return host;
    }

    public void setHost(String host) {
        this.host = host;
    }

    public Integer getPort() {
        return port;
    }

    public void setPort(Integer port) {
        this.port = port;
    }

    public Integer getTimeout() {
        return timeout;
    }

    public void setTimeout(Integer timeout) {
        this.timeout = timeout;
    }

}
