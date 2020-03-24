package com.hellcat.system.controller;

import com.hellcat.system.entity.ServerFunControlDO;
import com.hellcat.system.service.ServerFunControlService;
import org.springframework.web.bind.annotation.*;
import reactor.core.publisher.Mono;

/**
 * @author stand
 * 2020/3/23 15:22
 */
@RestController
@RequestMapping("/control/")
public class ServerFunControlController {

    private final ServerFunControlService serverFunControlService;

    public ServerFunControlController(ServerFunControlService serverFunControlService) {
        this.serverFunControlService = serverFunControlService;
    }


    @GetMapping("get")
    public Mono<Integer> getServerFunControlProperty() {
        return serverFunControlService.getServerFunControlProperty()
                .map(ServerFunControlDO::getValue);
    }

    @PostMapping("set/{value}")
    public Mono<Integer> setServerFunControlProperty(@PathVariable int value) {
        return serverFunControlService.setServerFunControlProperty(value)
                .map(ServerFunControlDO::getValue);
    }


}
