package com.hellcat.user.service.impl;

import com.hellcat.user.dao.UserRepository;
import com.hellcat.user.eneity.TblUser;
import com.hellcat.user.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import reactor.core.publisher.Flux;

import java.util.Optional;

/**
 * @author StandCN
 * @date 2018/11/30 0:07
 */
@Service
public class UserServiceImpl implements UserService {

    private final UserRepository userRepository;

    @Autowired
    public UserServiceImpl(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    @Override
    public Iterable<TblUser> listUsers() {
//        Flux<TblUser> all = userRepository.findAll();
        return null;
    }

    @Override
    public Optional<TblUser> getUserById(Long id) {
//        return userRepository.findById(id);
        return null;
    }

    @Override
    public boolean insertUser(String userName, String password) {

//        TblUser s = new TblUser();
//        s.setUsername(userName);
//        s.setPassword(password);
//        TblUser saved = userRepository.save(s);
//        return Objects.nonNull(saved.getUid());
        return false;
    }
}
