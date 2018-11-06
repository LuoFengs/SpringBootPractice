package com.example.domian;

import lombok.Data;

import java.util.Date;

@Data
public class SysLog {

    private int id;
    private String userName;
    private String operation;
    private int time;
    private String method;
    private String params;
    private String ip;
    private Date createTime;

}
