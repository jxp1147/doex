package org.example.doex.utils.tokenUtils;

import javax.servlet.http.HttpServletRequest;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.springframework.stereotype.Component;
import org.springframework.web.context.request.RequestContextHolder;
import org.springframework.web.context.request.ServletRequestAttributes;

@Aspect
@Component
public class LoginCheckAspect {

    private final UserService userService;

    public LoginCheckAspect(UserService userService) {
        this.userService = userService;
    }

    @Around("@annotation(org.example.doex.utils.tokenUtils.RequireLogin)")
    public Object checkLogin(ProceedingJoinPoint joinPoint) throws Throwable {
        // 获取当前请求的 HttpServletRequest
        ServletRequestAttributes requestAttributes = (ServletRequestAttributes) RequestContextHolder.getRequestAttributes();
        assert requestAttributes != null;
        HttpServletRequest request = (HttpServletRequest) requestAttributes.getRequest();

        // 检查用户是否已登录
        if (!userService.isUserLoggedIn(request)) {
            throw new NotLoggedInException("User must be logged in to access this resource.");
        }

        return joinPoint.proceed();
    }
}

