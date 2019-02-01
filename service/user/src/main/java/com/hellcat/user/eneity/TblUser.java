package com.hellcat.user.eneity;


import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
@Data
public class TblUser {

    @Id
    @GeneratedValue
    private String tblUserId;
    private String username;
    private String password;
    private java.sql.Timestamp createTime;
    private java.sql.Timestamp updateTime;


}
