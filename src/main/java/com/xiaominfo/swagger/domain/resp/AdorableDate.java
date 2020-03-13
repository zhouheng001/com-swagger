package com.xiaominfo.swagger.domain.resp;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

/**
 * @author heng.zhou
 * @description: 萌新活动开始结束时间
 * @create 2020-02-21 3:12 下午
 */
@ApiModel
@Data
public class AdorableDate {
    @ApiModelProperty("当期活动开始时间")
    private String startTime;
    @ApiModelProperty("当期活动结束时间")
    private String endTime;
}
