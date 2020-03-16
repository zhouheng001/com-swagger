package com.xiaominfo.swagger.controller.ranks;

import com.funplus.base.utils.meme.RequestUtils;
import com.funplus.base.utils.meme.ResponseJSON;
import com.xiaominfo.swagger.utils.HttpClientUtils;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpServletRequest;
import java.io.IOException;
import java.util.Map;

/**
 * Created by kai.ji on 19/1/12.
 */

@Api(tags = "活动热度",description = "活动热度")
@RestController
@RequestMapping(value = "/rest/api/ranks/hotrank/")
public class ActivityHotRankRest {


    @ApiOperation(value = "status/{anchoruid}", httpMethod = "GET")
    @RequestMapping(value = "status/{anchoruid}", method = RequestMethod.GET)
    public ResponseJSON status(HttpServletRequest request, @PathVariable("anchoruid") long anchoruid,
                               @RequestHeader(value="X-MeMe-Language", required=false, defaultValue="zh-tw") String language,
                               @RequestParam(value="streamId", required=true) long streamId,
                               @RequestHeader(value = RequestUtils.HEADER_X_MEME_SESSION, required = false) String session) throws IOException {

        return HttpClientUtils.getResult(request);
    }
}
