package com.xiaominfo.swagger.domain.resp;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

import java.io.Serializable;

@ApiModel
@Data
public class DressUpRequest implements Serializable {
    private long id;
    private int type;
    /**
     * select
     * true 选择
     * false 取消
     */
    @ApiModelProperty("true 选择徽章 false 取消徽章")
    private boolean select;

}