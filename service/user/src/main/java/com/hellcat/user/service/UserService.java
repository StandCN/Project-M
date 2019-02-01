package com.hellcat.user.service;

//import com.hellcat.user.eneity.User;

import com.hellcat.user.eneity.TblUser;

import java.util.Optional;

/**
 * @author StandCN
 * @date 2018/11/29 23:46
 */
public interface UserService {


    Iterable<TblUser> listUsers();

    Optional<TblUser> getUserById(Long id);

    boolean insertUser(String userName, String password);

}
