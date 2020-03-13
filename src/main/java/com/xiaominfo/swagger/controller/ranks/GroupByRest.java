package com.xiaominfo.swagger.controller.ranks;

import com.funplus.base.utils.meme.RequestUtils;
import com.funplus.base.utils.meme.ResponseJSON;
import com.funplus.meme.base.web.aspect.NoMustSession;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiParam;
import org.apache.commons.fileupload.FileUploadException;
import org.springframework.web.bind.annotation.*;

import java.io.IOException;

import static com.funplus.meme.base.web.aspect.JsonAspect.getUid;

/**
 * @author heng.zhou
 * @description: 大富翁第三阶段(极光活动)模板
 * @create 2020-02-28 3:32 下午
 */
@Api(tags = "大富翁第三阶段(极光活动)模板h5接口")
@RestController
@RequestMapping(value = "/rest/api/ranks/groupBy/")
public class GroupByRest {

    @ApiOperation(value = "获取所有该活动相关排行榜单信息接口", httpMethod = "GET")
    @NoMustSession
    @RequestMapping(value = "/rank", method = RequestMethod.GET)
    public ResponseJSON rank(
            @ApiParam(name = "start", value = "排名起始位", required = true) @RequestParam(value = "start", defaultValue = "0") int start,
            @ApiParam(name = "end", value = "排名结束位", required = true) @RequestParam(value = "end", defaultValue = "99") int end,
            @ApiParam(name = "type", value = "榜单类型 日榜 0 总榜 1 粉丝榜 2", required = true) @RequestParam(value = "type", defaultValue = "0") int type,
            @ApiParam(name = "pos", value = "计算日榜", defaultValue = "1") @RequestParam(value = "pos", defaultValue = "1") int pos,
            @ApiParam(name = "region", value = "时区", defaultValue = "Default") @RequestParam(value = "region", defaultValue = "Default") String region,
            @ApiParam(name = "seqId", value = "活动id", required = true) @RequestParam(value = "seqId") long seqId,
            @ApiParam(name = "rType", value = "主播等级是否大于40级 0 小于 1 大于", defaultValue = "0") @RequestParam(value = "rType", defaultValue = "0") int rType,
            @RequestHeader(value = RequestUtils.HEADER_X_MEME_SESSION, required = false) String session
    )
            throws IOException, FileUploadException {
        long uid = getUid(session);
        return new ResponseJSON();
    }

    @ApiOperation(value = "获取该活动用户信息接口", httpMethod = "GET")
    @RequestMapping(value = "/userinfo/{uid}", method = RequestMethod.GET)
    public ResponseJSON userinfo(@ApiParam(name = "anchorId", value = "主播id", required = true) @PathVariable("uid") long anchorId,
                                 @RequestHeader(value = RequestUtils.HEADER_X_MEME_SESSION, required = false) String session,
                                 @ApiParam(name = "seqId", value = "活动id", required = true) @RequestParam(value = "seqId", required = false, defaultValue = "0") long seqId,
                                 @ApiParam(name = "region", value = "时区", defaultValue = "Default") @RequestParam(value = "region", defaultValue = "Default") String region)
            throws IOException, FileUploadException {
        long uid = getUid(session);
        ResponseJSON response = new ResponseJSON();
        return response;
    }
}
