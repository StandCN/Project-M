package com.hellcat.user.init;

import com.hellcat.user.dao.UserRepository;
import com.hellcat.user.eneity.factory.UserFactory;
import de.flapdoodle.embed.mongo.MongodExecutable;
import de.flapdoodle.embed.mongo.MongodProcess;
import de.flapdoodle.embed.mongo.MongodStarter;
import de.flapdoodle.embed.mongo.config.MongodConfigBuilder;
import de.flapdoodle.embed.mongo.config.Net;
import de.flapdoodle.embed.mongo.distribution.Version;
import de.flapdoodle.embed.process.runtime.Network;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;
import reactor.core.publisher.Flux;

import javax.annotation.PreDestroy;
import javax.annotation.Resource;
import java.util.Arrays;

/**
 * @author stand
 * 2019/11/25 2:11
 */
@Component
public class ApplicationInitializationRunner implements ApplicationRunner {


//    private MongodExecutable mongodExecutable;
//    private MongodProcess mongod;

//    @Override
    public void run(String... args) throws Exception {

//        mongodExecutable = MongodStarter.getDefaultInstance()
//                .prepare(new MongodConfigBuilder()
//                        .version(Version.Main.PRODUCTION)
//                        .net(new Net(27027, Network.localhostIsIPv6()))
//                        .build());
//        mongod = mongodExecutable.start();
    }




    public void tearDown() {
//        mongod.stop();
//        mongodExecutable.stop();
    }

    @Resource
    private UserRepository userRepository;

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
