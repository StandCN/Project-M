package com.hellcat.user.dao;

import com.hellcat.user.eneity.TblUser;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

/**
 * @author StandCN
 * 2018/11/30 0:04
 */
@Repository
public interface UserRepository extends CrudRepository<TblUser, Long> {


}
