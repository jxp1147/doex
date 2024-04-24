package org.example.doex.exceptions;

public class ResultBody {
    private Integer code;
    private String message;
    private Object result;

    public ResultBody() {
    }

    public ResultBody(Integer code, String message, Object result) {
        this.code = code;
        this.message = message;
        this.result = result;
    }

    public ResultBody(BaseInfo baseInfo) {
        this.code = baseInfo.getResultCode();
        this.message = baseInfo.getResultMsg();
    }

    public Integer getCode() {
        return code;
    }

    public void setCode(Integer code) {
        this.code = code;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public Object getResult() {
        return result;
    }

    public void setResult(Object result) {
        this.result = result;
    }
    // 成功
    public static ResultBody success(Object data) {
        return new ResultBody(200, "success", data);
    }
    // 成功
    public static ResultBody success() {
        return new ResultBody(200, "success", null);
    }

    // 失败
    public static ResultBody error(BaseInfo baseInfo) {
        return new ResultBody(baseInfo.getResultCode(), baseInfo.getResultMsg(), null);
    }

    // 失败
    public static ResultBody error(Integer code, String message) {
        return new ResultBody(code, message, null);
    }

    // 失败
    public static ResultBody error(String message) {
        return new ResultBody(-1, message, null);
    }
}
