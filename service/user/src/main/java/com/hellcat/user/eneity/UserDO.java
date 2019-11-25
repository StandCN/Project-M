package com.hellcat.user.eneity;


import com.hellcat.common.enumeration.BizStatusEnum;
import lombok.Data;

import java.time.LocalDateTime;

@Data
public class UserDO {

    private String userId;
    private String username;
    private String password;
    private BizStatusEnum bizStatus;
    private LocalDateTime createTime;
    private LocalDateTime updateTime;


}
