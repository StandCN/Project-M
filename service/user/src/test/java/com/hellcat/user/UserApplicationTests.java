package com.hellcat.user;

import com.hellcat.user.controller.UserTestController;
import com.hellcat.user.eneity.UserDO;
import de.flapdoodle.embed.mongo.MongodExecutable;
import de.flapdoodle.embed.mongo.MongodProcess;
import de.flapdoodle.embed.mongo.MongodStarter;
import de.flapdoodle.embed.mongo.config.MongodConfigBuilder;
import de.flapdoodle.embed.mongo.config.Net;
import de.flapdoodle.embed.mongo.distribution.Version;
import de.flapdoodle.embed.process.runtime.Network;
import org.aspectj.lang.annotation.Before;
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


    private static final MongodStarter starter = MongodStarter.getDefaultInstance();
    private MongodExecutable mongodExecutable;
    private MongodProcess mongod;

    @BeforeTestClass
    public void setUp() throws Exception {
        mongodExecutable = starter.prepare(new MongodConfigBuilder()
                .version(Version.Main.PRODUCTION)
                .net(new Net(27027, Network.localhostIsIPv6())).build());
        mongod = mongodExecutable.start();


    }

    @PreDestroy
    public void tearDown() throws Exception {
        mongod.stop();
        mongodExecutable.stop();
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