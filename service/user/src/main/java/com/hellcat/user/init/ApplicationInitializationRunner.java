package com.hellcat.user.init;

import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.stereotype.Component;

/**
 * @author stand
 * 2019/11/25 2:11
 */
@Component
public class ApplicationInitializationRunner implements ApplicationRunner {

//    @Resource
//    private UserRepository userRepository;

//    @Resource
//    private UserTestController userTestController;

    public void run(String... args) throws Exception {
    }


    @Override
    public void run(ApplicationArguments args) throws Exception {

//
//        userRepository.deleteAll().thenMany(
//                Flux.just(Arrays.asList(UserFactory.newUser("t1", "p1"),
//                        UserFactory.newUser("t2", "p2"))).flatMap(userRepository::saveAll))
//                .thenMany(userRepository.findAll())
//                .subscribe(user -> System.out.println("saving " + user.toString()))
//
//        ;

    }
}
