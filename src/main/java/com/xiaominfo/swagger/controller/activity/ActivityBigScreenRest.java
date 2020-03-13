package com.xiaominfo.swagger.controller.activity;

import com.funplus.base.utils.meme.ResponseJSON;
import com.funplus.base.utils.meme.enumerations.ActivitySwitchEnum;
import com.funplus.meme.activity.model.MemeRankConfigInfo;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiParam;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * @author heng.zhou
 * @description: 2020年度盛典MeMe粉红绽放(大屏榜单)
 * @create 2019-12-29 12:46 下午
 */
@Api(tags = "2020年度盛典MeMe粉红绽放(大屏榜单)")
@RestController
@RequestMapping("/rest/api/activity")
public class ActivityBigScreenRest {

    @ApiOperation(value = "查询榜单", httpMethod = "GET")
    @RequestMapping(value = "/bigscreenlist/cms/selectlist")
    public ResponseJSON<List<MemeRankConfigInfo>> selectCmsScreenlist(@ApiParam(name = "type", value = "id",
            required = false) @RequestParam(value = "id", required = false, defaultValue = "0") long id) {
        return new ResponseJSON();

    }

    @ApiOperation(value = "新增榜单活动", httpMethod = "POST")
    @RequestMapping(value = "/bigscreenlist/cms/add", method = RequestMethod.POST)
    public ResponseJSON addCmsBigScreen(@RequestBody MemeRankConfigInfo memeRankConfigParam) {
        return new ResponseJSON();
    }

    @ApiOperation(value = "开始结束榜单活动", httpMethod = "GET")
    @RequestMapping(value = "/bigscreenlist/cms/switch", method = RequestMethod.GET)
    public ResponseJSON activitySwitchScreen(
            @ApiParam(name = "switchEnum", value = "活动开始结束按钮", required = true) @RequestParam(value = "switchEnum",
                    required = true) ActivitySwitchEnum switchEnum,
            @ApiParam(name = "id", value = "活动id", required = true) @RequestParam(value = "id",
                    required = true) long id) {
        return new ResponseJSON();
    }

    @ApiOperation(value = "删除榜单活动", httpMethod = "DELETE")
    @RequestMapping(value = "/bigscreenlist/cms/del", method = RequestMethod.DELETE)
    public ResponseJSON delCmsScreen(@ApiParam(name = "id", value = "活动id", required = true) @RequestParam(value = "id",
            required = true) long id) {
        return ResponseJSON.OK;
    }

}
