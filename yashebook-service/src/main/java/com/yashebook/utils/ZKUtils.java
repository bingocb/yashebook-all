package com.yashebook.utils;

import org.I0Itec.zkclient.ZkClient;
import org.I0Itec.zkclient.serialize.BytesPushThroughSerializer;
import org.apache.zookeeper.CreateMode;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

/**
 * Created by binchen on 2018/1/1.
 */
public class ZKUtils {

    private static final String ZOOKEEPER_SERVER = "192.168.31.155:2181";

    @Autowired
    private ZkClient zkClient;

    //创建链接
    public ZkClient client() {
        return new ZkClient(ZOOKEEPER_SERVER, 5000, 5000, new BytesPushThroughSerializer());
    }

    /**
     * 创建节点
     * @param node_path 节点路径
     * @param var 节点数据值
     * @param mode 节点类型：0-PERSISTENT、1-EPHEMERAL、2-PERSISTENT_SEQUENTIAL、3-EPHEMERAL_SEQUENTIAL
     * @return
     */
    public String createNode(String node_path, String var, CreateMode mode) {
        return client().create(node_path, var, mode);
    }


    /**
     * 获取子节点
     * @param node_path 节点路径
     * @return
     */
    public List<String> lsNode(String node_path) {
        return client().getChildren(node_path);
    }


    /**
     * 获取节点数据
     * @param node_path 节点路径
     * @return
     */
    public Object getNode(String node_path) {
        return client().readData(node_path);
    }

    /**
     * 删除节点
     * @param node_path 节点路径
     * @return
     */
    public boolean delNode(String node_path) {
        return client().delete(node_path);
    }


    /**
     * 修改数据
     * @param node_path 节点路径
     * @param var 节点数据
     */
    public void setNode(String node_path, String var) {
        client().writeData(node_path, var);
    }


    /**
     * 节点是否存在
     * @param node_path 节点路径
     * @return
     */
    public boolean existsNode(String node_path) {
        return client().exists(node_path);
    }


}
