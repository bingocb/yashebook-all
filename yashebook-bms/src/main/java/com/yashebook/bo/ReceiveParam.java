package com.yashebook.bo;

import lombok.Data;

import java.util.Map;

/**
 * Created by binchen on 2018/1/3.
 */
@Data
public class ReceiveParam {
    private String method;
    private Map<String, Object> args;
}
