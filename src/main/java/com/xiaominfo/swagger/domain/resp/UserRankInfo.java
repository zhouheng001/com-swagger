package com.xiaominfo.swagger.domain.resp;


import com.google.common.collect.Lists;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

import java.util.List;
import java.util.Map;

/**
 * Created by gongfanlei on 2/11/2017.
 */
@ApiModel
@Data
public class UserRankInfo{
    public Long uid;
    public String name;
    public String nick;
    public int level;
    public long score;
    public long scoreAll;
    public long mission;
    public int gender;
    public int rank;
    public int rankAll;
    public String cover;
    public String avatar;
    public int followed;
    public boolean online;
    public List<FanRankInfo> fansRanks;
    public List<FanRankInfo> fansAllRanks;
    public List<GiftRank> giftRanks = Lists.newLinkedList();
    public List<GiftRank> giftAllRanks = Lists.newArrayList();
    public int winner;
    public int type;
    public String taskInfo;
    public int canGrabTimes;
    public String diff;
    public String diffAll;
    public int up;
    public UserRankInfo pkRankInfo;
    public int isPK = 0;
    public long giftId;
    public int userLevel;
    //1-隐身，0-正常
    public int invisible;
    public String description;
    public Map<String, Object> giftMaps;
    public Map<String, Object> taskMaps;
    //幸运积分
    @ApiModelProperty("当期活动  chancescore 机会榜 fatescore 命运榜")
    public Map<String, Object> luckyScoreMaps;
}
