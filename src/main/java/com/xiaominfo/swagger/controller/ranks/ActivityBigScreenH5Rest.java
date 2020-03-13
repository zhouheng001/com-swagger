package com.xiaominfo.swagger.controller.ranks;

import com.funplus.base.utils.meme.ResponseJSON;
import com.funplus.meme.model.ActBigScreens;
import com.funplus.meme.model.ActivityModelBase;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author heng.zhou
 * @description: 大屏展示H5端
 * @create 2019-12-30 5:50 下午
 */
@Api(tags = "大屏展示H5端",description = "2020年度盛典MeMe粉红绽放(大屏榜单)")
@RestController
@RequestMapping("/rest/api/ranks")
public class ActivityBigScreenH5Rest {

    @ApiOperation(value = "获取榜单结果", httpMethod = "GET")
    @RequestMapping(value = "/h5/bigscreenlist/getsortresult", method = RequestMethod.GET)
    public ResponseJSON<ActivityModelBase<ActBigScreens>> getSortResult() {
        return new ResponseJSON();

    }

}
