package com.hellcat.user.dao;

import com.hellcat.user.eneity.UserDO;
import org.springframework.data.mongodb.repository.ReactiveMongoRepository;
import org.springframework.stereotype.Repository;

/**
 * @author StandCN
 * 2018/11/30 0:04
 */
@Repository
public interface UserRepository extends ReactiveMongoRepository<UserDO, Long> {


}
