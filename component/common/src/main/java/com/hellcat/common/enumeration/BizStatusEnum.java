package com.hellcat.common.enumeration;

/**
 * @author stand
 * 2019/11/25 1:47
 */
public enum BizStatusEnum {
    ACTIVE((byte) 1),
    INACTIVE((byte) 0),
    ;

    private final byte code;


    BizStatusEnum(byte code) {
        this.code = code;
    }

    public byte getCode() {
        return code;
    }
}
