package com.xiaominfo.swagger.controller.ranks;

import com.funplus.base.utils.meme.RequestUtils;
import com.funplus.base.utils.meme.ResponseJSON;
import com.funplus.meme.base.web.aspect.WebUtils;
import com.xiaominfo.swagger.utils.HttpClientUtils;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpServletRequest;
import javax.ws.rs.core.Context;
import java.util.Map;

/**
 * Created by kai.ji on 19/4/25.
 */
@Api(tags = "成就",description = "成就")
@RestController
public class AchievementDevelopRest {



    /**
     * status接口
     * @param request
     * @param anchorUid
     * @param lang
     * @return
     */
    @ApiOperation(value = "/rest/api/ranks/achievement/status/{anchoruid}", httpMethod = "GET")
    @RequestMapping(value = "/rest/api/ranks/achievement/status/{anchoruid}", method = RequestMethod.GET)
    public ResponseJSON status(@Context HttpServletRequest request, @PathVariable("anchoruid") long anchorUid,
                               @RequestHeader(value = RequestUtils.HEADER_X_MEME_LANG, required = false, defaultValue = "zh-tw") String lang) {
        return HttpClientUtils.getResult(request);
    }

}
