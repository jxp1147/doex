package org.example.doex.controller;

import org.example.doex.entity.dto.UserDTO;
import org.example.doex.entity.vo.UserVO;
import org.example.doex.exceptions.ResultBody;
import org.example.doex.service.IUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.stereotype.Controller;

import javax.servlet.http.HttpServletResponse;

/**
 * <p>
 *  前端控制器
 * </p>
 *
 * @author jxp
 * @since 2024-04-22
 */
@Controller
@RequestMapping("/api/user")
public class UserController {
    private IUserService service;
    @Autowired
    public void setService(IUserService service) {
        this.service = service;
    }

    @PostMapping("/login")
    public ResultBody login(@RequestBody UserDTO user, HttpServletResponse response) {
        System.out.println("============"+user.toString());
        UserVO userRes = service.login(user.getUserName(), user.getPassword());
        if (userRes != null) {
            String jwtToken = service.generateJwtToken(userRes);
            response.setHeader("Authorization", "Bearer " + jwtToken);
            return ResultBody.success(user);
        } else {
            return ResultBody.error("用户名或密码错误");
        }
    }

}
