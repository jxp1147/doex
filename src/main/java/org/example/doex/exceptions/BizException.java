package org.example.doex.exceptions;

public class BizException extends RuntimeException {
    protected Integer errorCode;
    protected String errorMsg;
    public BizException() {
        super();
    }
    public BizException(BaseInfo baseInfo) {
        super(baseInfo.getResultMsg());
        this.errorCode = baseInfo.getResultCode();
        this.errorMsg = baseInfo.getResultMsg();
    }
    public BizException(BaseInfo baseInfo, Throwable throwable) {
        super(baseInfo.getResultMsg(), throwable);
        this.errorCode = baseInfo.getResultCode();
        this.errorMsg = baseInfo.getResultMsg();
    }

    public BizException(Integer errorCode, String errorMsg) {
        super(errorMsg);
        this.errorCode = errorCode;
        this.errorMsg = errorMsg;
    }

    public BizException(Integer errorCode, String errorMsg, Throwable throwable) {
        super(errorMsg, throwable);
        this.errorCode = errorCode;
        this.errorMsg = errorMsg;
    }

    public Integer getErrorCode() {
        return errorCode;
    }

    public void setErrorCode(Integer errorCode) {
        this.errorCode = errorCode;
    }

    public String getErrorMsg() {
        return errorMsg;
    }

    public void setErrorMsg(String errorMsg) {
        this.errorMsg = errorMsg;
    }
    @Override
    public synchronized Throwable fillInStackTrace() {
        return this;
    }
}
