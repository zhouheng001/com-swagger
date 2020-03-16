package com.xiaominfo.swagger.controller.ranks;

import com.funplus.base.utils.meme.RequestUtils;
import com.funplus.base.utils.meme.ResponseJSON;
import com.xiaominfo.swagger.utils.HttpClientUtils;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiParam;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpServletRequest;
import java.io.IOException;

@Api(tags = "最高连击接口")
@RestController
@RequestMapping("/rest/api/ranks")
public class TopHitRest {

    @Autowired
    private HttpServletRequest request;

    @ApiOperation(value = "获取所有该活动相关排行榜单信息", httpMethod = "GET")
    @RequestMapping(value = "/tophit/rank", method = RequestMethod.GET)
    public ResponseJSON getScoresRank(
            @ApiParam(name = RequestUtils.HEADER_X_MEME_SESSION, value = "session", required = true) @RequestHeader(value = RequestUtils.HEADER_X_MEME_SESSION, required = true) String session,
            @ApiParam(name = "start", value = "排名起始位", defaultValue = "0") @RequestParam(value = "start", defaultValue = "0") int start,
            @ApiParam(name = "end", value = "排名结束位", defaultValue = "99") @RequestParam(value = "end", defaultValue = "99") int end,
            @ApiParam(name = "type", value = "榜单类型 总榜 1 粉丝榜 2", defaultValue = "1") @RequestParam(value = "type", defaultValue = "1") int type,
            @ApiParam(name = "giftId", value = "礼物Id", required = true) @RequestParam(value = "giftId") int giftId,
            @ApiParam(name = "region", value = "时区", defaultValue = "Default") @RequestParam(value = "region", defaultValue = "Default") String region,
            @ApiParam(name = "seqId", value = "活动id", required = true) @RequestParam(value = "seqId", required = true) long seqId

    ) {
        return HttpClientUtils.getResult(request);
    }

    @ApiOperation(value = "获取主播排名浮动信息用于运营位", httpMethod = "GET")
    @RequestMapping(value = "/tophit/status/{seqId}/{anchorId}", method = RequestMethod.GET)
    public ResponseJSON status(@ApiParam(name = "anchorId", value = "anchorId", required = true) @PathVariable("anchorId") long anchorId,
                               @ApiParam(name = "seqId", value = "活动id", required = true) @PathVariable(value = "seqId") long seqId,
                               @ApiParam(name = "lang", value = "语言", defaultValue = "zh-tw")
                               @RequestHeader(value = RequestUtils.HEADER_X_MEME_LANG, required = false, defaultValue = "zh-tw") String lang) {
        return HttpClientUtils.getResult(request);
    }

    @ApiOperation(value = "获取用户排名基础信息", httpMethod = "GET")
    @RequestMapping(value = "/tophit/userinfo/{uid}", method = RequestMethod.GET)
    public ResponseJSON getUserInfo(@ApiParam(name = "uid", value = "uid", required = true) @PathVariable("uid") long uid,
                                    @ApiParam(name = RequestUtils.HEADER_X_MEME_SESSION, value = "session", required = false, defaultValue = "zh-tw") @RequestHeader(value = RequestUtils.HEADER_X_MEME_SESSION, required = false) String session,
                                    @ApiParam(name = "seqId", value = "活动id", required = true) @RequestParam(value = "seqId") long seqId,
                                    @ApiParam(name = "giftId", value = "礼物Id", defaultValue = "0") @RequestParam(value = "giftId", defaultValue = "0") long giftId,
                                    @ApiParam(name = "region", value = "时区", defaultValue = "Default") @RequestParam(value = "region", defaultValue = "Default") String region)
            throws IOException {
        return HttpClientUtils.getResult(request);
    }

}