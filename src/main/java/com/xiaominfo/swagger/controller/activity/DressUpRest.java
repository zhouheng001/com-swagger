package com.xiaominfo.swagger.controller.activity;

import com.funplus.base.utils.meme.RequestUtils;
import com.funplus.base.utils.meme.ResponseJSON;
import com.xiaominfo.swagger.domain.resp.DressUpRequest;
import com.xiaominfo.swagger.utils.HttpClientUtils;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiParam;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpServletRequest;
import java.util.ArrayList;
import java.util.List;

@Api(tags = "徽章/装扮相关接口")
@RestController
public class DressUpRest {

    @Autowired
    private HttpServletRequest request;

    @ApiOperation(value = "查询徽章列表", httpMethod = "GET")
    @RequestMapping(value = "/rest/api/activity/medal/list/{uid}")
    public ResponseJSON list(@ApiParam(name = "uid", value = "被访问的用户uid", required = true) @PathVariable("uid") long uid) {

        return HttpClientUtils.getResult(request);
    }

    @ApiOperation(value = "更新徽章状态", httpMethod = "POST")
    @RequestMapping(value = "/rest/api/activity/dressup/doSelect", method = RequestMethod.POST)
    public ResponseJSON doSelect(HttpServletRequest request,
                                 @RequestHeader(value = "X-MeMe-Language", required = false, defaultValue = "zh-tw") String lang,
                                 @RequestBody DressUpRequest dressUpRequest) {

        return HttpClientUtils.getResult(request);
    }

    @ApiOperation(value = "我的装扮接口文档", httpMethod = "GET")
    @RequestMapping(value = "/rest/api/activity/dressup/list")
    public ResponseJSON list(HttpServletRequest request, @RequestParam(value = "type", defaultValue = "1") int type,
                             @RequestHeader(value = "X-MeMe-Language", required = false, defaultValue = "zh-tw") String lang,
                             @RequestHeader(value = RequestUtils.HEADER_X_MEME_PLATFORM, required = true) String platform) {
        return HttpClientUtils.getResult(request);
    }

}
