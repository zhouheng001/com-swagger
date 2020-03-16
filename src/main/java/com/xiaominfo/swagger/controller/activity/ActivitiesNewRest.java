package com.xiaominfo.swagger.controller.activity;

import com.funplus.base.utils.meme.ResponseJSON;
import com.xiaominfo.swagger.utils.HttpClientUtils;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiParam;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletRequest;
import java.util.HashMap;
import java.util.List;

/**
 * ActivitiesRest
 */
@Api(tags = "获取活动配置Controller")
@RestController
public class ActivitiesNewRest {

    @Autowired
    private HttpServletRequest request;

    @ApiOperation(value = "获取全量活动groupId", httpMethod = "GET")
    @RequestMapping(value = "/rest/api/activity/selectallgroupid")
    public ResponseJSON<List<HashMap<String, Object>>> selectAllGroupID(@ApiParam(name = "region", value = "时区", defaultValue = "Default")
                                                                        @RequestParam(value = "region", required = false, defaultValue = "Default") String region) {
        return HttpClientUtils.getResult(request);
    }

}
