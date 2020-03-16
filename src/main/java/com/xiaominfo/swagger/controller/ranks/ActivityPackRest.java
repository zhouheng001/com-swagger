package com.xiaominfo.swagger.controller.ranks;

import com.funplus.base.utils.meme.RequestUtils;
import com.funplus.base.utils.meme.ResponseJSON;
import com.funplus.meme.base.web.aspect.WebUtils;
import com.xiaominfo.swagger.utils.HttpClientUtils;
import io.swagger.annotations.Api;
import org.slf4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpServletRequest;
import java.io.IOException;
import java.util.Map;

import static org.slf4j.LoggerFactory.getLogger;

/**
 * Created by kai.ji on 18/5/8.
 */
@Api(tags = "生日模板",description = "生日模板")
@RestController
@RequestMapping(value = "/rest/api/ranks/pack")
public class ActivityPackRest {


    /**
     * 配置相关
     *
     * @return
     */
    @RequestMapping(value = "/config", method = RequestMethod.GET)
    public ResponseJSON config(HttpServletRequest request,
                               @RequestHeader(value = "X-MeMe-Language", required = false, defaultValue = "zh-tw") String language,
                               @RequestHeader(value = RequestUtils.HEADER_X_MEME_SESSION, required = false) String session,
                               @RequestParam(value = "anchorId") long anchorId,
                               @RequestParam(value = "streamId") long streamId,
                               @RequestParam(value = "depositId") String depositId) throws IOException {


        return HttpClientUtils.getResult(request);

    }


    @RequestMapping(value = "/status/{anchoruid}", method = RequestMethod.GET)
    public ResponseJSON status(HttpServletRequest request, @PathVariable("anchoruid") long anchoruid,
                               @RequestHeader(value = "X-MeMe-Language", required = false, defaultValue = "zh-tw") String language,
                               @RequestParam(value = "streamId", required = true) long streamId,
                               @RequestHeader(value = RequestUtils.HEADER_X_MEME_SESSION, required = false) String session) throws IOException {

        return HttpClientUtils.getResult(request);
    }


}
