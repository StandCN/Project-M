package com.hellcat.user.controller;


import com.hellcat.user.eneity.UserDO;
import com.hellcat.user.service.UserService;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import reactor.core.publisher.Flux;


/**
 * @author StandCN
 * 2018/7/26 0:32
 */
@RestController
public class UserTestController implements ContextPathController {


    private final UserService userService;

    public UserTestController(UserService userService) {
        this.userService = userService;
    }

    @RequestMapping(value = "all")
    public Flux<UserDO> listAllUsers() {
        return userService.listUsers();
    }

    @RequestMapping(value = "test")
    public String test() {
        return "test";
    }

}
