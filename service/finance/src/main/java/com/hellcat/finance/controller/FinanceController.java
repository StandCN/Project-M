package com.hellcat.finance.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author StandCN
 * @date 2019/1/7 22:43
 */
@RestController
@RequestMapping("api")
public class FinanceController {

    @GetMapping("test")
    public String test() {
        return "hello, test";
    }

}
