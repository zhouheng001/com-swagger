package com.xiaominfo.swagger.controller.ranks;

import com.funplus.base.utils.meme.RequestUtils;
import com.funplus.base.utils.meme.ResponseJSON;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiParam;
import org.springframework.web.bind.annotation.*;

import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

/**
 * @author heng.zhou
 * @description: 情人节
 * @create 2020-01-20 2:19 下午
 */
@Api(tags = "情人节模板h5接口")
@RestController
@RequestMapping("/rest/api/ranks")
public class ValentineDayRest {


    @ApiOperation(value = "获取所有该活动相关排行榜单信息", httpMethod = "GET")
    @RequestMapping(value = "/valentineday/rank", method = RequestMethod.GET)
    public ResponseJSON getScoresRank(@RequestHeader(value = RequestUtils.HEADER_X_MEME_SESSION, required = true) String session,
                                      @ApiParam(name = "start", value = "排名起始位", defaultValue = "0") @RequestParam(value = "start", defaultValue = "0") int start,
                                      @ApiParam(name = "end", value = "排名结束位", defaultValue = "99") @RequestParam(value = "end", defaultValue = "99") int end,
                                      @ApiParam(name = "type", value = "榜单类型 日榜 0 总榜 1 粉丝榜 2", defaultValue = "0") @RequestParam(value = "type", defaultValue = "0") int type,
                                      @ApiParam(name = "pos", value = "计算日榜", required = false) @RequestParam(value = "pos", defaultValue = "0") int pos,
                                      @ApiParam(name = "region", value = "时区", defaultValue = "Default") @RequestParam(value = "region", defaultValue = "Default") String region,
                                      @ApiParam(name = "seqId", value = "活动id", required = true) @RequestParam(value = "seqId", required = true) long seqId) {
        String uid = session.split(";")[0];
        Map<String, Object> result = new HashMap<String, Object>();
        return new ResponseJSON(result);
    }

    @ApiOperation(value = "获取主播排名浮动信息用于运营位", httpMethod = "GET")
    @RequestMapping(value = "/valentineday/status/{seqId}/{anchorId}", method = RequestMethod.GET)
    public ResponseJSON status(@ApiParam(name = "anchorId", value = "anchorId", required = true) @PathVariable("anchorId") long anchorId,
                               @ApiParam(name = "seqId", value = "活动id", required = true) @PathVariable(value = "seqId") long seqId,
                               @ApiParam(name = "lang", value = "语言", required = false, defaultValue = "zh-tw")
                               @RequestHeader(value = RequestUtils.HEADER_X_MEME_LANG, required = false, defaultValue = "zh-tw") String lang) {
        return new ResponseJSON();
    }

    @ApiOperation(value = "获取用户排名基础信息", httpMethod = "GET")
    @RequestMapping(value = "/valentineday/userinfo/{uid}", method = RequestMethod.GET)
    public ResponseJSON getUserInfo(@ApiParam(name = "uid", value = "uid", required = true) @PathVariable("uid") long uid,
                                    @RequestHeader(value = RequestUtils.HEADER_X_MEME_SESSION, required = true) String session,
                                    @ApiParam(name = "lang", value = "语言", required = false, defaultValue = "zh-tw") @RequestHeader(value = RequestUtils.HEADER_X_MEME_LANG, required = false, defaultValue = "zh-tw") String lang,
                                    @ApiParam(name = "seqId", value = "活动id", required = true) @RequestParam(value = "seqId", required = true) long seqId,
                                    @ApiParam(name = "region", value = "时区", defaultValue = "Default") @RequestParam(value = "region", defaultValue = "Default") String region,
                                    @ApiParam(name = "type", value = "榜单类型 日榜 0 总榜 1 粉丝榜 2", defaultValue = "0") @RequestParam(value = "type", defaultValue = "0") int type,
                                    @ApiParam(name = "pos", value = "计算日榜", defaultValue = "0") @RequestParam(value = "pos", defaultValue = "0") int pos)
            throws IOException {

        return new ResponseJSON();
    }

    @ApiOperation(value = "获取活动任务", httpMethod = "GET")
    @RequestMapping(value = "/valentineday/usertask/{uid}", method = RequestMethod.GET)
    public ResponseJSON getActivityTaskInfo(@ApiParam(name = "uid", value = "主播id", required = true) @PathVariable("uid") long uid,
                                            @RequestHeader(value = RequestUtils.HEADER_X_MEME_SESSION, required = true) String session,
                                            @ApiParam(name = "seqId", value = "活动id",required = true) @RequestParam(value = "seqId", required = true) long seqId,
                                            @ApiParam(name = "region", value = "时区", defaultValue = "Default") @RequestParam(value = "region", defaultValue = "Default") String region)
            throws IOException {
        return new ResponseJSON();
    }
}
