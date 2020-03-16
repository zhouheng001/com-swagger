package com.xiaominfo.swagger.controller.ranks;

import com.funplus.base.utils.meme.RequestUtils;
import com.funplus.base.utils.meme.ResponseJSON;
import com.funplus.meme.base.web.aspect.NoMustSession;
import com.funplus.meme.base.web.aspect.WebUtils;
import com.xiaominfo.swagger.domain.resp.GiftInfo;
import com.xiaominfo.swagger.utils.HttpClientUtils;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiParam;
import org.mapstruct.Context;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpServletRequest;
import java.io.IOException;

/**
 * @author heng.zhou
 * @description: 大富翁第二阶段(晶硕)模板
 * @create 2020-02-28 3:22 下午
 */
@Api(tags = "大富翁第二阶段(晶硕)模板h5接口")
@RestController
public class JingShuoRest {

    @ApiOperation(value = "获取所有该活动相关排行榜单信息接口", httpMethod = "GET")
    @NoMustSession
    @RequestMapping(value = "/rest/jingshuo/rank", method = RequestMethod.GET)
    public ResponseJSON getScoresRank(@RequestHeader(value = RequestUtils.HEADER_X_MEME_SESSION, required = false) String session,
                                      @ApiParam(name = "start", value = "排名起始位", required = true) @RequestParam(value = "start", defaultValue = "0") int start,
                                      @ApiParam(name = "end", value = "排名结束位", required = true) @RequestParam(value = "end", defaultValue = "99") int end,
                                      @ApiParam(name = "type", value = "榜单类型 日榜 0 总榜 1 粉丝榜 2 机会榜 3 命运榜 4", required = true) @RequestParam(value = "type", defaultValue = "0") int type,
                                      @ApiParam(name = "rType", value = "rType", defaultValue = "0") @RequestParam(value = "rType", defaultValue = "0") int rType,
                                      @ApiParam(name = "pos", value = "计算日榜", defaultValue = "0") @RequestParam(value = "pos", defaultValue = "0") int pos,
                                      @ApiParam(name = "region", value = "时区", defaultValue = "Default") @RequestParam(value = "region", defaultValue = "Default") String region,
                                      @ApiParam(name = "seqId", value = "活动id", required = true) @RequestParam(value = "seqId") long seqId,
                                      @Context HttpServletRequest request) {
        return HttpClientUtils.getResult(request);
    }

    @ApiOperation(value = "大富翁第二阶段抽奖接口", httpMethod = "GET")
    @RequestMapping(value = "/rest/jingshuo/luckydraw", method = RequestMethod.GET)
    public ResponseJSON<GiftInfo> luckyDraw(@RequestHeader(value = RequestUtils.HEADER_X_MEME_SESSION, required = false) String session,
                                            @ApiParam(name = "type", value = "0 机会按钮 1 命运按钮", required = true) @RequestParam(value = "type", defaultValue = "0") int type,
                                            @ApiParam(name = "region", value = "时区", defaultValue = "Default") @RequestParam(value = "region", defaultValue = "Default") String region,
                                            @ApiParam(name = "seqId", value = "活动id", required = true) @RequestParam(value = "seqId", required = false, defaultValue = "0") long seqId,
                                            @Context HttpServletRequest request) {
        return HttpClientUtils.getResult(request);
    }

    @ApiOperation(value = "获取该活动用户信息接口", httpMethod = "GET")
    @RequestMapping(value = "/rest/jingshuo/userinfo/{uid}", method = RequestMethod.GET)
    public ResponseJSON getUserInfo(@PathVariable("uid") long uid,
                                    @RequestHeader(value = RequestUtils.HEADER_X_MEME_SESSION, required = false) String session,
                                    @ApiParam(name = "type", value = "榜单类型 日榜 0 总榜 1 粉丝榜 2 机会榜 3 命运榜 4", required = true) @RequestParam(value = "type", defaultValue = "0") int type,
                                    @ApiParam(name = "seqId", value = "活动id", required = true) @RequestParam(value = "seqId", required = false, defaultValue = "0") long seqId,
                                    @ApiParam(name = "region", value = "时区", defaultValue = "Default") @RequestParam(value = "region", defaultValue = "Default") String region,
                                    @Context HttpServletRequest request)
            throws IOException {
        return HttpClientUtils.getResult(request);
    }


}
