package com.hellcat.user.init;

import com.hellcat.user.controller.UserTestController;
import com.hellcat.user.dao.UserRepository;
import com.hellcat.user.eneity.factory.UserFactory;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.stereotype.Component;
import reactor.core.publisher.Flux;

import javax.annotation.Resource;
import java.util.Arrays;

/**
 * @author stand
 * 2019/11/25 2:11
 */
@Component
public class ApplicationInitializationRunner implements ApplicationRunner {

    @Resource
    private UserRepository userRepository;

    @Resource
    private UserTestController userTestController;

    public void run(String... args) throws Exception {
    }


    @Override
    public void run(ApplicationArguments args) throws Exception {


        userRepository.deleteAll().thenMany(
                Flux.just(Arrays.asList(UserFactory.newUser("t1", "p1"),
                        UserFactory.newUser("t2", "p2"))).flatMap(userRepository::saveAll))
                .thenMany(userRepository.findAll())
                .subscribe(user -> System.out.println("saving " + user.toString()))

        ;

    }
}
