package com.hellcat.system.dao;

import com.hellcat.system.entity.ServerFunControlDO;
import org.springframework.data.mongodb.repository.ReactiveMongoRepository;

/**
 * @author stand
 * 2020/3/23 14:20
 */
public interface ServerFunControlRepository extends ReactiveMongoRepository<ServerFunControlDO, String> {

}
