package com.hellcat.system.entity;

import com.hellcat.common.enumeration.BizStatusEnum;
import lombok.Data;

import java.time.LocalDateTime;

/**
 * @author stand
 * 2020/3/23 14:12
 */
@Data
public class ServerFunControlDO {
    private String id;
    private int value;
    private BizStatusEnum bizStatus;
    private LocalDateTime createTime;
    private LocalDateTime updateTime;
}
