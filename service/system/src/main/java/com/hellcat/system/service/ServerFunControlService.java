package com.hellcat.system.service;

import com.hellcat.system.entity.ServerFunControlDO;
import reactor.core.publisher.Mono;

/**
 * @author stand
 * 2020/3/23 14:25
 */
public interface ServerFunControlService {

    Mono<ServerFunControlDO> getServerFunControlProperty();

    Mono<ServerFunControlDO> setServerFunControlProperty(int value);

}
