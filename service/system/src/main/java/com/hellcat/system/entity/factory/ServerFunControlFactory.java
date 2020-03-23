package com.hellcat.system.entity.factory;

import com.hellcat.common.enumeration.BizStatusEnum;
import com.hellcat.system.entity.ServerFunControlDO;
import com.hellcat.system.util.Constant;

import java.time.LocalDateTime;

/**
 * @author stand
 * 2020/3/23 15:41
 */
public class ServerFunControlFactory {

    private ServerFunControlFactory() {
    }

    public static ServerFunControlDO defaultServerFunControl(int value) {
        ServerFunControlDO r = new ServerFunControlDO();

        r.setBizStatus(BizStatusEnum.ACTIVE);
        r.setCreateTime(LocalDateTime.now());
        r.setUpdateTime(LocalDateTime.now());
        r.setId(Constant.SERVER_FUN_CONTROL_PROPERTY_ID);
        r.setValue(value);

        return r;
    }

}
