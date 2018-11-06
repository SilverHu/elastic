package com.elastic.util;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;

/**
 * 响应报文
 * 
 * @author hucy
 *
 */
public class ResponseResult<T extends JSON> {
    private ResponseCode responseCode;
    private T data;
    public static ResponseResult<JSONObject> success = new ResponseResult<JSONObject>(ResponseCode.SUCCESS, null);

    public ResponseCode getCode() {
        return responseCode;
    }

    public ResponseResult(ResponseCode responseCode, T data) {
        super();
        this.responseCode = responseCode;
        this.data = data;
    }

    public JSONObject toJson() {
        JSONObject json = new JSONObject();
        json.put("code", responseCode.getCode());
        json.put("msg", responseCode.getMsg());
        if (data != null) {
            json.put("data", data);
        }
        return json;
    }

    public static enum ResponseCode {
        SUCCESS(200, "success"), ERROR_400(400, ""), ERROR_500(500, "");

        private int code;
        private String msg;

        public int getCode() {
            return code;
        }

        public String getMsg() {
            return msg;
        }

        private ResponseCode(int code, String msg) {
            this.code = code;
            this.msg = msg;
        }

    }
}
