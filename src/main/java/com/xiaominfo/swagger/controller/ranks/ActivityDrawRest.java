package com.xiaominfo.swagger.controller.ranks;

import com.funplus.base.utils.meme.RequestUtils;
import com.funplus.base.utils.meme.ResponseJSON;
import com.funplus.meme.base.web.aspect.NoMustSession;
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
 * 活动
 * Created by kai.ji on 19/4/25.
 */
@Api(tags = "抽奖活动",description = "成就")
@RestController
public class ActivityDrawRest {


    /**
     * status接口
     *
     * @param request
     * @param lang
     * @return
     */
    @ApiOperation(value = "/rest/api/ranks/draw/display", httpMethod = "GET")
    @NoMustSession
    @RequestMapping(value = "/rest/api/ranks/draw/display", method = RequestMethod.GET)
    public ResponseJSON display(@Context HttpServletRequest request,
                                @RequestHeader(value = RequestUtils.HEADER_X_MEME_LANG, required = false, defaultValue = "zh-tw") String lang,
                                @RequestParam(value = "seqId", required = false, defaultValue = "0") long seqId,
                                @RequestParam(value = "region", defaultValue = "Default") String region) {
        return HttpClientUtils.getResult(request);
    }

    @ApiOperation(value = "/rest/api/ranks/draw/do", httpMethod = "GET")
    @NoMustSession
    @RequestMapping(value = "/rest/api/ranks/draw/do", method = RequestMethod.GET)
    public ResponseJSON doDraw(@Context HttpServletRequest request,
                               @RequestHeader(value = RequestUtils.HEADER_X_MEME_LANG, required = false, defaultValue = "zh-tw") String lang,
                               @RequestParam(value = "seqId", required = false, defaultValue = "0") long seqId,
                               @RequestParam(value = "region", defaultValue = "Default") String region) {
        return HttpClientUtils.getResult(request);
    }

    @ApiOperation(value = "/rest/api/ranks/draw/more", httpMethod = "GET")
    @NoMustSession
    @RequestMapping(value = "/rest/api/ranks/draw/more", method = RequestMethod.GET)
    public ResponseJSON more(@Context HttpServletRequest request,
                             @RequestHeader(value = RequestUtils.HEADER_X_MEME_LANG, required = false, defaultValue = "zh-tw") String lang,
                             @RequestParam(value = "seqId", required = false, defaultValue = "0") long seqId,
                             @RequestParam(value = "region", defaultValue = "Default") String region,
                             @RequestParam(value = "start", defaultValue = "0") int start,
                             @RequestParam(value = "end", defaultValue = "99") int end) {
        return HttpClientUtils.getResult(request);
    }

    @ApiOperation(value = "/rest/api/ranks/draw/buy", httpMethod = "GET")
    @NoMustSession
    @RequestMapping(value = "/rest/api/ranks/draw/buy", method = RequestMethod.GET)
    public ResponseJSON buy(@Context HttpServletRequest request,
                            @RequestHeader(value = RequestUtils.HEADER_X_MEME_LANG, required = false, defaultValue = "zh-tw") String lang,
                            @RequestParam(value = "seqId", required = false, defaultValue = "0") long seqId,
                            @RequestParam(value = "region", defaultValue = "Default") String region,
                            @RequestParam(value = "orderId", defaultValue = "") String orderId,
                            @RequestParam(value = "pid", defaultValue = "0") int pid) {
        return HttpClientUtils.getResult(request);
    }

    @ApiOperation(value = "/rest/api/ranks/draw/code", httpMethod = "GET")
    @NoMustSession
    @RequestMapping(value = "/rest/api/ranks/draw/code", method = RequestMethod.GET)
    public ResponseJSON code(@Context HttpServletRequest request,
                             @RequestHeader(value = RequestUtils.HEADER_X_MEME_LANG, required = false, defaultValue = "zh-tw") String lang,
                             @RequestParam(value = "seqId", required = false, defaultValue = "0") long seqId,
                             @RequestParam(value = "region", defaultValue = "Default") String region,
                             @RequestParam(value = "code", defaultValue = "") String code) {
        return HttpClientUtils.getResult(request);
    }

}
