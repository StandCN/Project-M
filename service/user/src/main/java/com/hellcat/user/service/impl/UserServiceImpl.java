package com.hellcat.user.service.impl;

import com.hellcat.user.dao.UserRepository;
import com.hellcat.user.eneity.UserDO;
import com.hellcat.user.eneity.factory.UserFactory;
import com.hellcat.user.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

/**
 * @author StandCN
 * 2018/11/30 0:07
 */
@Service
public class UserServiceImpl implements UserService {

    private final UserRepository userRepository;

    @Autowired
    public UserServiceImpl(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    @Override
    public Flux<UserDO> listUsers() {
        return userRepository.findAll();
    }

    @Override
    public Mono<UserDO> getUserById(Long id) {
//        RateLimiter.create(1d);
        return userRepository.findById(id);
    }

    @Override
    public Mono<UserDO> insertUser(String username, String password) {
        UserDO user = UserFactory.newUser(username, password);
        return userRepository.insert(user);
    }
}
