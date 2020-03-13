package com.xiaominfo.swagger.controller.ranks;

import com.funplus.base.utils.meme.RequestUtils;
import com.funplus.base.utils.meme.ResponseJSON;
import com.funplus.meme.base.web.aspect.NoMustSession;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiParam;
import org.springframework.web.bind.annotation.*;

/**
 * @author heng.zhou
 * @description: 礼物升级h5
 * @create 2020-02-24 6:39 下午
 */
@Api(tags = "礼物升级接口")
@RestController
@RequestMapping("/rest/api/ranks")
public class GiftUpGradeRest {


    @ApiOperation(value = "获取所有该活动相关排行榜单信息", httpMethod = "GET")
    @NoMustSession
    @RequestMapping(value = "/giftupgrade/rank", method = RequestMethod.GET)
    public ResponseJSON getScoresRank(@RequestHeader(value = RequestUtils.HEADER_X_MEME_SESSION, required = true) String session,
                                      @ApiParam(name = "start", value = "排名起始位", defaultValue = "0") @RequestParam(value = "start", defaultValue = "0") int start,
                                      @ApiParam(name = "end", value = "排名结束位", defaultValue = "99") @RequestParam(value = "end", defaultValue = "99") int end,
                                      @ApiParam(name = "week", value = "是否本周 0 上周 1 本周", defaultValue = "1") @RequestParam(value = "week", defaultValue = "1") int week,
                                      @ApiParam(name = "region", value = "时区", defaultValue = "Default") @RequestParam(value = "region", defaultValue = "Default") String region,
                                      @ApiParam(name = "seqId", value = "活动id", required = true) @RequestParam(value = "seqId", required = true) long seqId) {
        return new ResponseJSON();
    }

}
