package org.example.doex.exceptions;

public enum CommonExceptionEnum implements BaseInfo{
    SUCCESS(200, "成功"),
    NOT_F0UND(404, "未找到资源"),
    NULL_POINT(1000, "空指针"),
    UN_KNOW(1000, "其他未知异常"),

    ;
    private final Integer resultCode;
    private final String resultMsg;

    CommonExceptionEnum(Integer resultCode, String resultMsg) {
        this.resultMsg = resultMsg;
        this.resultCode = resultCode;
    }

    @Override
    public Integer getResultCode() {
        return this.resultCode;
    }

    @Override
    public String getResultMsg() {
        return this.resultMsg;
    }
}
