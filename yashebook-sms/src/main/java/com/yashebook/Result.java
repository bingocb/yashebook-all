package com.yashebook;

import lombok.Data;

/**
 * Created by binchen on 2017/12/27.
 */
@Data
public class Result {
    /**
     * 短信平台返回状态值 0：成功 其他：错误（详见：https://cloud.tencent.com/document/product/382/3771）
     */
    private int code;

    /**
     * 短信平台返回消息 成功：OK 错误：具体错误信息
     */
    private String msg;

    /**
     * 标识本次发送id，标识一次短信下发记录
     */
    private String sid;
}
