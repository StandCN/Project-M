package com.hellcat.user.controller;

//import com.hellcat.user.eneity.User;

import com.hellcat.user.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

//import org.springframework.jdbc.core.JdbcTemplate;

/**
 * @author StandCN
 * @date 2018/7/26 0:32
 */
@RestController
public class UserTestController {

//    @Autowired
//    private JdbcTemplate jdbcTemplate;
//
//    @GetMapping("/{word}")
//    public String helloWord(@PathVariable("word") String word) {
//        return "Hello, " + word.toUpperCase() + "! ";
//    }
//
//    @GetMapping("/query")
//    public Map<String, Object> uuid() {
//        String sql = "select uuid()";
//        return jdbcTemplate.queryForMap(sql);
//    }

//    @Autowired
    private UserService userService;

//    @GetMapping("all")
//    public Iterable<User> listAllUsers() {
//        return userService.listUsers();
//    }

    @GetMapping("test")
    public String test() {
//        return userService.test();
        return "test";
    }

}
