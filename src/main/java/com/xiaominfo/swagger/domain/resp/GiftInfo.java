package com.xiaominfo.swagger.domain.resp;

import com.funplus.fpnn.client.core.common.IgnoreField;
import com.funplus.fpnn.client.plugin.dbproxy.command.HintId;
import io.swagger.annotations.ApiModel;
import lombok.Data;

/**
 * Created by funplus on 2017/1/16.
 */
@ApiModel
@Data
public class GiftInfo{
    @HintId
    public long giftid;
    public int diamond;
    public String giftname;
    public long expriences;
    public long vdiamond;
    public String giftpic;
    public String giftname_i18n;
    public String attrs;
    @IgnoreField
    public String content;

    @IgnoreField
    public String contentBubble;

    @IgnoreField
    public int count;

    @IgnoreField
    public Double rate;

}
