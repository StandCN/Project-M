package com.hellcat.user;

import com.hellcat.user.controller.UserTestController;
import com.hellcat.user.eneity.UserDO;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.event.annotation.BeforeTestClass;
import reactor.core.publisher.Flux;

import javax.annotation.PreDestroy;
import javax.annotation.Resource;

@SpringBootTest
class UserApplicationTests {

    @Resource
    private UserTestController userTestController;


    @BeforeTestClass
    public void setUp() throws Exception {


    }

    @PreDestroy
    public void tearDown() throws Exception {
    }

    @Test
    void contextLoads() {

    }

    @Test
    void listAll() {
        Flux<UserDO> userDOFlux = userTestController.listAllUsers();
        userDOFlux.doOnEach(userDOSignal -> System.out.print(userDOSignal.get())).blockLast();
    }


}