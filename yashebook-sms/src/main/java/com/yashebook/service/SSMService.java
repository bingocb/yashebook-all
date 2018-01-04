package com.yashebook.service;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import com.github.qcloudsms.SmsSingleSender;
import com.github.qcloudsms.SmsSingleSenderResult;
import com.yashebook.Result;
import org.apache.commons.lang3.StringUtils;
import org.springframework.stereotype.Service;

import java.text.MessageFormat;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * Created by binchen on 2017/12/27.
 */
@Service
public class SSMService {

    private static final int APP_ID = 1400057236;
    private static final String APP_KEY = "29820000cb9d5ea22acf756ee335e9ff";
    private static final int SEND_TYPE = 0;
    private static final String NATION_CODE = "86";
    private static final String REGEX = "^1[3|4|5|7|8][0-9]\\\\d{4,8}$";
    private static final String MESSAGE_TEMP = "您的验证码是：{}";



    public String call(String json) {
        JSONObject jsonObj = JSON.parseObject(json);
        String phone = jsonObj.getString("ys_sms_phone");
        Result result = new Result();
        try {
            result = this.send(phone);
            System.out.print(result);
        } catch (Exception e) {
            result.setCode(2000);
            result.setMsg("系统异常，原因："+e.getMessage());
        }
        return JSON.toJSONString(result);
    }

    private Result send(String phone) throws Exception {
        Result r = new Result();
        if (checkPhone(phone)) {
            String veriCode = mobileVeriCode();
            String message = MessageFormat.format(MESSAGE_TEMP, veriCode);
            SmsSingleSender sender = new   SmsSingleSender(APP_ID, APP_KEY);
            SmsSingleSenderResult result = sender.send(SEND_TYPE, NATION_CODE, phone, message, "", "123");

            r.setCode(result.result);
            r.setMsg(result.errMsg);
            r.setSid(result.sid);
            if (1008 == result.result) {//超时，重试
                r = this.send(phone);
            }
        }
        return r;
    }


    private boolean checkPhone(String phone) throws Exception{
        if (StringUtils.isBlank(phone)) throw new Exception("Mobile phone number is null");
        if (11 != phone.length()) throw new Exception("Mobile phone number is less than 11 bits");
        Pattern p = Pattern.compile(REGEX);
        Matcher m = p.matcher(phone);
        if (!m.matches()) throw new Exception("Mobile phone number format error");
        return true;
    }

    /**
     * 生成随机短信验证码
     * @return
     */
    private String mobileVeriCode() {
        double random = Math.random();
        Integer veriCode = Double.valueOf(random * 1000000).intValue();
        if (veriCode.toString().length() != 6) {
            return this.mobileVeriCode();
        }
        return String.valueOf(veriCode);
    }
}
