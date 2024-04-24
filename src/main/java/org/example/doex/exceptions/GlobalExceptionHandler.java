package org.example.doex.exceptions;

import jakarta.servlet.http.HttpServletRequest;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.ControllerAdvice;

import org.slf4j.Logger;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;

@ControllerAdvice
public class GlobalExceptionHandler {
    private final static Logger logger = LoggerFactory.getLogger(GlobalExceptionHandler.class);
    @ResponseBody
    @ExceptionHandler(value = BizException.class)
    public ResultBody bizExceptionHandler(HttpServletRequest request, BizException bizException) {
        logger.error("业务异常========>" + bizException.getErrorMsg());
        return ResultBody.error(bizException.getErrorCode(),bizException.getErrorMsg());
    }

    @ResponseBody
    @ExceptionHandler(value = NullPointerException.class)
    public ResultBody bizExceptionHandler(HttpServletRequest request, NullPointerException e) {
        logger.error("空指针异常========>" + e);
        return ResultBody.error(CommonExceptionEnum.NULL_POINT);
    }

    @ResponseBody
    @ExceptionHandler(value = Exception.class)
    public ResultBody bizExceptionHandler(HttpServletRequest request, Exception e) {
        logger.error("未知异常========>" + e);
        return ResultBody.error(CommonExceptionEnum.NULL_POINT);
    }
}
