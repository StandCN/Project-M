package com.hellcat.user.eneity.factory;

import com.hellcat.common.enumeration.BizStatusEnum;
import com.hellcat.user.eneity.UserDO;

import java.time.LocalDateTime;
import java.util.UUID;

/**
 * @author stand
 * 2019/11/25 1:52
 */
public class UserFactory {

    private UserFactory() {}

    public static UserDO newUser(String username, String password) {
        UserDO user = new UserDO();

        user.setBizStatus(BizStatusEnum.ACTIVE);
        user.setCreateTime(LocalDateTime.now());

        // TODO encode
        user.setPassword(password);
        user.setUsername(username);

        // FIXME to be replaced by a cluster method
        user.setUserId(UUID.randomUUID().toString());

        return user;
    }


}
