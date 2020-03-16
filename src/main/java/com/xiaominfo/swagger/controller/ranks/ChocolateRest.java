package com.xiaominfo.swagger.controller.ranks;

import com.funplus.base.utils.meme.RequestUtils;
import com.funplus.base.utils.meme.ResponseJSON;
import com.xiaominfo.swagger.utils.HttpClientUtils;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiParam;
import org.mapstruct.Context;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpServletRequest;
import java.io.IOException;
import java.util.Map;

/**
 * Created by kai.ji on 17/12/27.
 * 巧克力
 */


@Api(tags = "巧克力模板h5接口")
@RestController
@RequestMapping(value = "/rest/api/ranks")
public class ChocolateRest {

    @Autowired
    private HttpServletRequest request;

    @ApiOperation(value = "获取所有该活动相关排行榜单信息", httpMethod = "GET")
    @RequestMapping(value = "/chocolate/rank", method = RequestMethod.GET)
    public ResponseJSON<Map<String, Object>> getScoresRank(
            @ApiParam(name = RequestUtils.HEADER_X_MEME_SESSION, value = "session", required = true) @RequestHeader(value = RequestUtils.HEADER_X_MEME_SESSION, required = true) String session,
            @ApiParam(name = "start", value = "排名起始位", defaultValue = "0") @RequestParam(value = "start", defaultValue = "0") int start,
            @ApiParam(name = "end", value = "排名结束位", defaultValue = "99") @RequestParam(value = "end", defaultValue = "99") int end,
            @ApiParam(name = "type", value = "榜单类型 日榜 0 总榜 1 粉丝榜 2", defaultValue = "0") @RequestParam(value = "type", defaultValue = "0") int type,
            @ApiParam(name = "pos", value = "计算日榜", defaultValue = "0") @RequestParam(value = "pos", defaultValue = "0") int pos,
            @ApiParam(name = "region", value = "时区", defaultValue = "Default") @RequestParam(value = "region", defaultValue = "Default") String region,
            @ApiParam(name = "seqId", value = "活动id", required = true) @RequestParam(value = "seqId", required = true) long seqId

    ) {
        return HttpClientUtils.getResult(request);
    }

    @ApiOperation(value = "获取主播排名信息", httpMethod = "GET")
    @RequestMapping(value = "/chocolate/status/{anchoruid}", method = RequestMethod.GET)
    public ResponseJSON<Map<String, Object>> status(
            @Context HttpServletRequest request,
            @ApiParam(name = "anchoruid", value = "anchoruid", required = true) @PathVariable("anchoruid") long anchorUid,
            @ApiParam(name = RequestUtils.HEADER_X_MEME_LANG, value = "语言", required = false, defaultValue = "zh-tw") @RequestHeader(value = RequestUtils.HEADER_X_MEME_LANG, required = false, defaultValue = "zh-tw") String lang
    ) {
        return HttpClientUtils.getResult(request);
    }

    @ApiOperation(value = "获取该活动榜单结果", httpMethod = "GET")
    @RequestMapping(value = "/chocolate/userinfo/{uid}", method = RequestMethod.GET)
    public ResponseJSON<Map<String, Object>> getUserInfo(
            @ApiParam(name = "uid", value = "uid", required = true) @PathVariable("uid") long uid,
            @ApiParam(name = RequestUtils.HEADER_X_MEME_SESSION, value = "session", required = true) @RequestHeader(value = RequestUtils.HEADER_X_MEME_SESSION, required = true) String session,
            @ApiParam(name = "lang", value = "语言", required = true, defaultValue = "zh-tw") @RequestHeader(value = RequestUtils.HEADER_X_MEME_LANG, required = false, defaultValue = "zh-tw") String lang,
            @ApiParam(name = "seqId", value = "活动id", defaultValue = "0") @RequestParam(value = "seqId", defaultValue = "0") long seqId,
            @ApiParam(name = "region", value = "时区", defaultValue = "Default") @RequestParam(value = "region", defaultValue = "Default") String region
    )
            throws IOException {
        return HttpClientUtils.getResult(request);
    }

}
