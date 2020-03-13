package com.xiaominfo.swagger.domain.resp;


import java.io.Serializable;

/**
 * Created by gongfanlei on 2/11/2017.
 */
public class FanRankInfo implements Serializable{
    public Long uid;
    public String name;
    public String nick;
    public int level;
    public long score;
    public long mission;
    public int gender;
    public int rank;
    public String cover;
    public String avatar;
    public int winner;
    public boolean online;
    public int invisible;
    public int followed;
}
