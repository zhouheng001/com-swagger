package com.xiaominfo.swagger.controller.activity;

import com.funplus.base.utils.meme.ResponseJSON;
import com.xiaominfo.swagger.utils.HttpClientUtils;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiParam;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletRequest;

@Api(tags = "榜单数据导出接口")
@RestController
public class RankExportRest {

    @Autowired
    private HttpServletRequest request;

    @ApiOperation(value = "获取活动任务榜单", httpMethod = "GET")
    @RequestMapping(value = "/rest/activity/rankexport/task", method = RequestMethod.GET)
    public ResponseJSON task(@ApiParam(name = "sign", value = "签名", required = true) @RequestParam(value = "sign", required = true) String sign,
                             @ApiParam(name = "actId", value = "活动id", required = true) @RequestParam(value = "actId", required = true) Long actId,
                             @ApiParam(name = "type", value = "活动类型 0 主播任务 1 粉丝任务", defaultValue = "0") @RequestParam(value = "type", defaultValue = "0") long type) {
        return HttpClientUtils.getResult(request);
    }
}