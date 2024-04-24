package org.example.doex.utils.tokenUtils;

import org.springframework.web.bind.annotation.ResponseStatus;

import static org.springframework.http.HttpStatus.UNAUTHORIZED;

// 自定义未登录异常，响应状态码设置为401 Unauthorized
@ResponseStatus(value = UNAUTHORIZED, reason = "User not logged in")
class NotLoggedInException extends RuntimeException {
    public NotLoggedInException(String message) {
        super(message);
    }
}