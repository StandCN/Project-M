package com.hellcat.system.service.impl;

import com.hellcat.system.dao.ServerFunControlRepository;
import com.hellcat.system.entity.ServerFunControlDO;
import com.hellcat.system.entity.factory.ServerFunControlFactory;
import com.hellcat.system.service.ServerFunControlService;
import com.hellcat.system.util.Constant;
import org.springframework.stereotype.Service;
import reactor.core.publisher.Mono;

/**
 * @author stand
 * 2020/3/23 14:29
 */
@Service
public class ServerFunControlServiceImpl implements ServerFunControlService {

    private final ServerFunControlRepository serverFunControlRepository;

    public ServerFunControlServiceImpl(ServerFunControlRepository serverFunControlRepository) {
        this.serverFunControlRepository = serverFunControlRepository;
    }

    @Override
    public Mono<ServerFunControlDO> getServerFunControlProperty() {
        return serverFunControlRepository.findById(Constant.SERVER_FUN_CONTROL_PROPERTY_ID);
    }

    @Override
    public Mono<ServerFunControlDO> setServerFunControlProperty(int value) {
        return serverFunControlRepository.save(ServerFunControlFactory.defaultServerFunControl(value));
    }
}
