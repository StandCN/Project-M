package com.hellcat.user.controller;


import com.hellcat.user.eneity.UserDO;
import com.hellcat.user.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import reactor.core.publisher.Flux;


/**
 * @author StandCN
 * 2018/7/26 0:32
 */
@RestController
public class UserTestController {


    private final UserService userService;

    public UserTestController(UserService userService) {
        this.userService = userService;
    }

    @GetMapping("all")
    public Flux<UserDO> listAllUsers() {
        return userService.listUsers();
    }

    @GetMapping("test")
    public String test() {
        return "test";
    }

}
