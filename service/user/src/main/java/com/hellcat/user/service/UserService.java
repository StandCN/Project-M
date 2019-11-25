package com.hellcat.user.service;


import com.hellcat.user.eneity.UserDO;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

/**
 * @author StandCN
 * @date 2018/11/29 23:46
 */
public interface UserService {


    Flux<UserDO> listUsers();

    Mono<UserDO> getUserById(Long id);

    Mono<UserDO> insertUser(String username, String password);

}
