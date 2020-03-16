package com.xiaominfo.swagger.controller.ranks;

import com.funplus.base.utils.meme.RequestUtils;
import com.funplus.base.utils.meme.ResponseJSON;
import com.funplus.meme.base.web.aspect.NoMustSession;
import com.funplus.meme.base.web.aspect.NotSession;
import com.xiaominfo.swagger.domain.resp.AdorableDate;
import com.xiaominfo.swagger.utils.HttpClientUtils;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiParam;
import org.mapstruct.Context;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpServletRequest;
import java.io.IOException;

/**
 * @author heng.zhou
 * @description: 萌新活动
 * @create 2020-02-19 5:08 下午
 */
@Api(tags = "萌新活动h5接口",description = "萌新活动h5接口")
@RestController
@RequestMapping("/rest/api/ranks")
public class AdorableRest {

    @Autowired
    private HttpServletRequest request;

    @ApiOperation(value = "获取活动时间", httpMethod = "GET")
    @NotSession
    @RequestMapping(value = "/adorable/activityInfo", method = RequestMethod.GET)
    public ResponseJSON<AdorableDate> getActivityInfo(@ApiParam(name = "region", value = "时区", required = true) @RequestParam(value = "region", defaultValue = "Default") String region) {
        return HttpClientUtils.getResult(request);
    }

    @ApiOperation(value = "获取所有该活动相关排行榜单信息", httpMethod = "GET")
    @NoMustSession
    @RequestMapping(value = "/adorable/rank", method = RequestMethod.GET)
    public ResponseJSON getScoresRank(@RequestHeader(value = RequestUtils.HEADER_X_MEME_SESSION, required = false) String session,
                                      @ApiParam(name = "start", value = "排名起始位", defaultValue = "0") @RequestParam(value = "start", defaultValue = "0") int start,
                                      @ApiParam(name = "end", value = "排名结束位", defaultValue = "99") @RequestParam(value = "end", defaultValue = "99") int end,
                                      @ApiParam(name = "stageType", value = "活动阶段类型 0 新手上路 1 实战演练 2 排位赛 3 总榜", defaultValue = "0") @RequestParam(value = "stageType", defaultValue = "0") int stageType,
                                      @ApiParam(name = "type", value = "榜单类型 日榜 0 总榜 1 粉丝榜 2", defaultValue = "0") @RequestParam(value = "type", defaultValue = "0") int type,
                                      @ApiParam(name = "pos", value = "计算日榜 ( 日榜新手上路pos传1-7, 日榜实战演练pos传1-5， 日榜排位赛pos传1-2 ) ", defaultValue = "1") @RequestParam(value = "pos", defaultValue = "1") int pos,
                                      @ApiParam(name = "region", value = "时区", defaultValue = "Default") @RequestParam(value = "region", defaultValue = "Default") String region,
                                      HttpServletRequest request) {
        return HttpClientUtils.getResult(request);
    }


    @ApiOperation(value = "获取主播排名浮动信息用于运营位", httpMethod = "GET")
    @RequestMapping(value = "/adorable/status/{anchorId}", method = RequestMethod.GET)
    public ResponseJSON status(@ApiParam(name = "anchorId", value = "anchorId", required = true) @PathVariable("anchorId") long anchorId,
                               @ApiParam(name = "lang", value = "语言", required = false, defaultValue = "zh-tw")
                               @RequestHeader(value = RequestUtils.HEADER_X_MEME_LANG, required = false, defaultValue = "zh-tw") String lang) {
        return HttpClientUtils.getResult(request);
    }

    @ApiOperation(value = "获取用户排名基础信息", httpMethod = "GET")
    @RequestMapping(value = "/adorable/userinfo/{uid}", method = RequestMethod.GET)
    public ResponseJSON getUserInfo(@ApiParam(name = "uid", value = "uid", required = true) @PathVariable("uid") long uid,
                                    @RequestHeader(value = RequestUtils.HEADER_X_MEME_SESSION, required = false) String session,
                                    @ApiParam(name = "lang", value = "语言", defaultValue = "zh-tw") @RequestHeader(value = RequestUtils.HEADER_X_MEME_LANG, defaultValue = "zh-tw") String lang,
                                    @ApiParam(name = "stageType", value = "活动阶段类型", defaultValue = "0") @RequestParam(value = "stageType", defaultValue = "0") int stageType,
                                    @ApiParam(name = "region", value = "时区", defaultValue = "Default") @RequestParam(value = "region", defaultValue = "Default") String region,
                                    @ApiParam(name = "type", value = "榜单类型 日榜 0 总榜 1", defaultValue = "0") @RequestParam(value = "type", defaultValue = "0") int type,
                                    @Context HttpServletRequest request)
            throws IOException {
        return HttpClientUtils.getResult(request);
    }

}
