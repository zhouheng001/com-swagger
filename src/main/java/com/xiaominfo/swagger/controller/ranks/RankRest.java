package com.xiaominfo.swagger.controller.ranks;


import com.funplus.base.utils.meme.*;
import com.funplus.meme.activity.domain.RegionActivityInfo;
import com.funplus.meme.activity.service.IActivityService;
import com.funplus.meme.base.web.aspect.NoMustSession;
import com.funplus.meme.base.web.aspect.NotSession;
import com.funplus.meme.base.web.aspect.WebUtils;
import com.funplus.meme.domain.User;
import com.funplus.meme.services.IRankService;
import com.google.common.collect.Lists;
import com.google.common.collect.Maps;
import com.xiaominfo.swagger.domain.resp.UserRankInfo;
import com.xiaominfo.swagger.utils.HttpClientUtils;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.apache.commons.collections.map.HashedMap;
import org.apache.commons.collections4.CollectionUtils;
import org.apache.commons.collections4.MapUtils;
import org.apache.commons.fileupload.FileUploadException;
import org.mapstruct.Context;
import org.slf4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import javax.ws.rs.GET;
import java.io.IOException;
import java.sql.Timestamp;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.*;

import static org.slf4j.LoggerFactory.getLogger;

@Api(tags = "爱意满满h5接口",description = "爱意满满h5接口")
@RestController
public class RankRest {
    private static final Logger LOG = getLogger(RankRest.class);

    @Autowired
    private HttpServletRequest request;


    @ApiOperation(value = "/rest/rank/morningnew", httpMethod = "GET")
    @GET
    @NoMustSession
    @RequestMapping("/rest/rank/morningnew")
    public ResponseJSON rankList(
            @RequestParam(value = "start", defaultValue = "0") int start,
            @RequestParam(value = "end", defaultValue = "49") int end,
            @RequestHeader(value = RequestUtils.HEADER_X_MEME_SESSION, required = false) String session,
            @RequestParam(value = "type", defaultValue = "0") int type,
            @RequestParam(value = "country", defaultValue = "TW") String country,
            HttpServletRequest request) {
        return HttpClientUtils.getResult(request);
    }

    @ApiOperation(value = "/rest/rank/lovenew", httpMethod = "GET")
    @GET
    @NoMustSession
    @RequestMapping("/rest/rank/lovenew")
    public ResponseJSON loveList(
            @RequestParam(value = "start", defaultValue = "0") int start,
            @RequestParam(value = "end", defaultValue = "49") int end,
            @RequestHeader(value = RequestUtils.HEADER_X_MEME_SESSION, required = false) String session,
            @RequestParam(value = "type", defaultValue = "0") int type,
            @RequestParam(value = "country", defaultValue = "TW") String country,
            HttpServletRequest request) {
        return HttpClientUtils.getResult(request);
    }

    @ApiOperation(value = "/rest/rank/pkhis", httpMethod = "GET")
    @GET
    @RequestMapping("/rest/rank/pkhis")
    public ResponseJSON pkinfo(@RequestParam(value = "region", defaultValue = "Default") String region,
                               @RequestParam(value = "pkUid", defaultValue = "pkUid") String pkUid,
                               @RequestHeader(value = RequestUtils.HEADER_X_MEME_SESSION, required = false) String session) {
        return HttpClientUtils.getResult(request);

    }

    @ApiOperation(value = "/rest/rank/treasure", httpMethod = "GET")
    @GET
    @NoMustSession
    @RequestMapping("/rest/rank/treasure")
    public ResponseJSON treasureList(
            @RequestParam(value = "start", defaultValue = "0") int start,
            @RequestParam(value = "end", defaultValue = "49") int end,
            @RequestHeader(value = RequestUtils.HEADER_X_MEME_SESSION, required = false) String session,
            @RequestParam(value = "type", defaultValue = "0") int type,
            @RequestParam(value = "country", defaultValue = "TW") String country,
            HttpServletRequest request) {
        return HttpClientUtils.getResult(request);
    }


    /**
     * 收入总榜
     *
     * @param start
     * @param end
     * @param session
     * @return
     */
    @ApiOperation(value = "/rest/rank/income", httpMethod = "GET")
    @NoMustSession
    @RequestMapping(value = "/rest/rank/income", method = RequestMethod.GET)
    public ResponseJSON incomeRank(@Context HttpServletRequest request,
                                   @RequestParam(value = "start", defaultValue = "0") int start,
                                   @RequestParam(value = "end", defaultValue = "49") int end,
                                   @RequestHeader(value = RequestUtils.HEADER_X_MEME_SESSION, required = false) String session) {
        return HttpClientUtils.getResult(request);
    }

    @ApiOperation(value = "/rest/rank/income/daily", httpMethod = "GET")
    @NoMustSession
    @RequestMapping(value = "/rest/rank/income/daily", method = RequestMethod.GET)
    public ResponseJSON dailyRank(@Context HttpServletRequest request,
                                  @RequestParam(value = "start", defaultValue = "0") int start,
                                  @RequestParam(value = "end", defaultValue = "49") int end,
                                  @RequestHeader(value = RequestUtils.HEADER_X_MEME_SESSION, required = false) String session,
                                  @RequestHeader(value = RequestUtils.HEADER_X_MEME_LANG, required = false, defaultValue = "zh-tw") String lang) {
        return HttpClientUtils.getResult(request);
    }

    @ApiOperation(value = "/rest/rank/income/weekly", httpMethod = "GET")
    @NoMustSession
    @RequestMapping(value = "/rest/rank/income/weekly", method = RequestMethod.GET)
    public ResponseJSON weeklyRank(@Context HttpServletRequest request,
                                   @RequestParam(value = "start", defaultValue = "0") int start,
                                   @RequestParam(value = "end", defaultValue = "49") int end,
                                   @RequestHeader(value = RequestUtils.HEADER_X_MEME_SESSION, required = false) String session,
                                   @RequestHeader(value = RequestUtils.HEADER_X_MEME_LANG, required = false, defaultValue = "zh-tw") String lang) {
        return HttpClientUtils.getResult(request);
    }

    @ApiOperation(value = "/rest/rank/income/monthly", httpMethod = "GET")
    @RequestMapping(value = "/rest/rank/income/monthly", method = RequestMethod.GET)
    public ResponseJSON monthlyRank(@Context HttpServletRequest request,
                                    @RequestParam(value = "start", defaultValue = "0") int start,
                                    @RequestParam(value = "end", defaultValue = "49") int end,
                                    @RequestParam(value = "category", required = false, defaultValue = "monthly") String category,
                                    @RequestHeader(value = RequestUtils.HEADER_X_MEME_SESSION, required = false) String session,
                                    @RequestHeader(value = RequestUtils.HEADER_X_MEME_LANG, required = false, defaultValue = "zh-tw") String lang) {
        return HttpClientUtils.getResult(request);
    }

    @ApiOperation(value = "/rest/rank/vcurrency", httpMethod = "GET")
    @NoMustSession
    @RequestMapping(value = "/rest/rank/vcurrency", method = RequestMethod.GET)
    public ResponseJSON vCurrencyRank(@Context HttpServletRequest request,
                                      @RequestParam(value = "start", defaultValue = "0") int start,
                                      @RequestParam(value = "end", defaultValue = "49") int end,
                                      @RequestHeader(value = RequestUtils.HEADER_X_MEME_SESSION, required = false) String session,
                                      @RequestHeader(value = RequestUtils.HEADER_X_MEME_LANG, required = false, defaultValue = "zh-tw") String lang) {
        return HttpClientUtils.getResult(request);
    }

    @ApiOperation(value = "/rest/rank/vcurrency/daily", httpMethod = "GET")
    @NoMustSession
    @RequestMapping(value = "/rest/rank/vcurrency/daily", method = RequestMethod.GET)
    public ResponseJSON dailyVCurrencyRank(@Context HttpServletRequest request,
                                           @RequestParam(value = "start", defaultValue = "0") int start,
                                           @RequestParam(value = "end", defaultValue = "49") int end,
                                           @RequestHeader(value = RequestUtils.HEADER_X_MEME_SESSION, required = false) String session,
                                           @RequestHeader(value = RequestUtils.HEADER_X_MEME_LANG, required = false, defaultValue = "zh-tw") String lang) {
        return HttpClientUtils.getResult(request);
    }

    @ApiOperation(value = "/rest/rank/vcurrency/weekly", httpMethod = "GET")
    @NoMustSession
    @RequestMapping(value = "/rest/rank/vcurrency/weekly", method = RequestMethod.GET)
    public ResponseJSON weeklyCurrencyRank(@Context HttpServletRequest request,
                                           @RequestParam(value = "start", defaultValue = "0") int start,
                                           @RequestParam(value = "end", defaultValue = "49") int end,
                                           @RequestHeader(value = RequestUtils.HEADER_X_MEME_SESSION, required = false) String session,
                                           @RequestHeader(value = RequestUtils.HEADER_X_MEME_LANG, required = false, defaultValue = "zh-tw") String lang) {
        return HttpClientUtils.getResult(request);
    }

    @ApiOperation(value = "/rest/rank/vcurrency/monthly", httpMethod = "GET")
    @NoMustSession
    @RequestMapping(value = "/rest/rank/vcurrency/monthly", method = RequestMethod.GET)
    public ResponseJSON monthlyVCurrencyRank(@Context HttpServletRequest request,
                                             @RequestParam(value = "start", defaultValue = "0") int start,
                                             @RequestParam(value = "end", defaultValue = "49") int end,
                                             @RequestHeader(value = RequestUtils.HEADER_X_MEME_SESSION, required = false) String session,
                                             @RequestHeader(value = RequestUtils.HEADER_X_MEME_LANG, required = false, defaultValue = "zh-tw") String lang) {
        return HttpClientUtils.getResult(request);
    }

    @ApiOperation(value = "/rest/rank/vcurrency/lastWeek", httpMethod = "GET")
    @NoMustSession
    @RequestMapping(value = "/rest/rank/duration/lastWeek", method = RequestMethod.GET)
    public ResponseJSON lastWeekRank(@Context HttpServletRequest request,
                                     @RequestParam(value = "start", defaultValue = "0") int start,
                                     @RequestParam(value = "end", defaultValue = "49") int end,
                                     @RequestHeader(value = RequestUtils.HEADER_X_MEME_SESSION, required = false) String session,
                                     @RequestHeader(value = RequestUtils.HEADER_X_MEME_LANG, required = false, defaultValue = "zh-tw") String lang) {
        return HttpClientUtils.getResult(request);
    }

    @ApiOperation(value = "/rest/rank/duration/currentWeek", httpMethod = "GET")
    @NoMustSession
    @RequestMapping(value = "/rest/rank/duration/currentWeek", method = RequestMethod.GET)
    public ResponseJSON currentWeekRank(@Context HttpServletRequest request,
                                        @RequestParam(value = "start", defaultValue = "0") int start,
                                        @RequestParam(value = "end", defaultValue = "49") int end,
                                        @RequestHeader(value = RequestUtils.HEADER_X_MEME_SESSION, required = false) String session,
                                        @RequestHeader(value = RequestUtils.HEADER_X_MEME_LANG, required = false, defaultValue = "zh-tw") String lang) {
        return HttpClientUtils.getResult(request);
    }

    @ApiOperation(value = "/rest/rank/sendAny", httpMethod = "GET")
    @NotSession
    @RequestMapping(value = "/rest/rank/sendAny/rtm", method = RequestMethod.GET)
    public ResponseJSON sendAny(@Context HttpServletRequest request,
                                @RequestParam(value = "region", defaultValue = "Default") String region,
                                @RequestParam(value = "json") String json,
                                @RequestParam(value = "mType") int mType) {

        return HttpClientUtils.getResult(request);
    }

    @ApiOperation(value = "/rest/rank/time", httpMethod = "GET")
    @NotSession
    @RequestMapping(value = "/rest/rank/time", method = RequestMethod.GET)
    public ResponseJSON modify(@Context HttpServletRequest request,
                               @RequestParam(value = "time", defaultValue = "0") String time) {

        return HttpClientUtils.getResult(request);

    }


    /**
     * 获取主播详情
     *
     * @param uid 用户id
     * @return
     */
    @ApiOperation(value = "/rest/rank/userinfo/{uid}", httpMethod = "GET")
    @NotSession
    @RequestMapping(value = "/rest/rank/userinfo/{uid}", method = RequestMethod.GET)
    public ResponseJSON getUserInfo(@PathVariable("uid") long uid,
                                    @RequestParam(value = "sign") String sign)
            throws IOException, FileUploadException {
        return HttpClientUtils.getResult(request);
    }


    /**
     * @param region
     * @param seqId
     * @param
     * @return
     */
    @ApiOperation(value = "/rest/rank/activity/info", httpMethod = "GET")
    @NotSession
    @RequestMapping(value = "/rest/rank/activity/info", method = RequestMethod.GET)
    public ResponseJSON info(@RequestParam(value = "region") String region,
                             @RequestParam(value = "seqId", required = false) long seqId) {
        return HttpClientUtils.getResult(request);
    }


    /**
     * 统一活动的配置
     *
     * @param lang
     * @return
     * @throws IOException
     * @throws FileUploadException
     */
    @ApiOperation(value = "/rest/rank/activity/resource/{seqId}", httpMethod = "GET")
    @RequestMapping(value = "/rest/rank/activity/resource/{seqId}", method = RequestMethod.GET)
    public ResponseJSON resource(@PathVariable("seqId") long seqId,
                                 @RequestHeader(value = RequestUtils.HEADER_X_MEME_LANG, required = false, defaultValue = "zh-tw") String lang) {
        return HttpClientUtils.getResult(request);
    }

    @ApiOperation(value = "/rest/rank/fan", httpMethod = "GET")
    @NoMustSession
    @RequestMapping(value = "/rest/rank/fan", method = RequestMethod.GET)
    public ResponseJSON getRankWithFan(@RequestHeader(value = RequestUtils.HEADER_X_MEME_SESSION, required = false) String session,
                                       @RequestParam(value = "start", defaultValue = "0") int start,
                                       @RequestParam(value = "end", defaultValue = "99") int end,
                                       @RequestParam(value = "type", defaultValue = "0") int type,
                                       @RequestParam(value = "pos", defaultValue = "0") int pos,
                                       @RequestParam(value = "region", defaultValue = "Default") String region,
                                       @RequestParam(value = "seqId") long seqId,
                                       HttpServletRequest request) {
        return HttpClientUtils.getResult(request);
    }

    /**
     * 获取日榜/总榜
     *
     * @param session
     * @param start
     * @param end
     * @param type
     * @param pos
     * @param region
     * @param seqId
     * @return
     */
    @ApiOperation(value = "/rest/rank/gift", httpMethod = "GET")
    @NoMustSession
    @RequestMapping(value = "/rest/rank/gift", method = RequestMethod.GET)
    public ResponseJSON getRankWithGift(@RequestHeader(value = RequestUtils.HEADER_X_MEME_SESSION, required = false) String session,
                                        @RequestParam(value = "start", defaultValue = "0") int start,
                                        @RequestParam(value = "end", defaultValue = "99") int end,
                                        @RequestParam(value = "type", defaultValue = "0") int type,
                                        @RequestParam(value = "pos", defaultValue = "0") int pos,
                                        @RequestParam(value = "region", defaultValue = "Default") String region,
                                        @RequestParam(value = "seqId") long seqId,
                                        HttpServletRequest request) {
        return HttpClientUtils.getResult(request);
    }

    @ApiOperation(value = "/rest/rank/status/{seqId}/{anchorId}", httpMethod = "GET")
    @RequestMapping(value = "/rest/rank/status/{seqId}/{anchorId}", method = RequestMethod.GET)
    public ResponseJSON getStatus(@RequestHeader(value = RequestUtils.HEADER_X_MEME_SESSION, required = false) String session,
                                  @PathVariable("anchorId") long anchorUid,
                                  @PathVariable(value = "seqId") long seqId,
                                  @RequestHeader(value = RequestUtils.HEADER_X_MEME_LANG, required = false, defaultValue = "zh-tw") String lang) {
        return HttpClientUtils.getResult(request);
    }

    @ApiOperation(value = "/rest/api/ranks/status/{seqId}/{anchorId}", httpMethod = "GET")
    @RequestMapping(value = "/rest/api/ranks/status/{seqId}/{anchorId}", method = RequestMethod.GET)
    public ResponseJSON getApiStatus(@RequestHeader(value = RequestUtils.HEADER_X_MEME_SESSION, required = false) String session,
                                     @PathVariable("anchorId") long anchorUid,
                                     @PathVariable(value = "seqId") long seqId,
                                     @RequestHeader(value = RequestUtils.HEADER_X_MEME_LANG, required = false, defaultValue = "zh-tw") String lang) {
        return HttpClientUtils.getResult(request);
    }

    @ApiOperation(value = "/rest/rank/anchorinfo/gift", httpMethod = "GET")
    @RequestMapping(value = "/rest/rank/anchorinfo/gift", method = RequestMethod.GET)
    public ResponseJSON getAnchorInfoWithGift(@Context HttpServletRequest request,
                                              @RequestParam(value = "uid", defaultValue = "0") long uid,
                                              @RequestParam(value = "seqId", defaultValue = "0") long seqId) {

        return HttpClientUtils.getResult(request);
    }

    @ApiOperation(value = "/rest/rank/anchorinfo/fan", httpMethod = "GET")
    @NoMustSession
    @RequestMapping(value = "/rest/rank/anchorinfo/fan", method = RequestMethod.GET)
    public ResponseJSON getAnchorInfoWithFan(@Context HttpServletRequest request,
                                             @RequestParam(value = "uid", defaultValue = "0") long uid,
                                             @RequestParam(value = "seqId", defaultValue = "0") long seqId) {
        return HttpClientUtils.getResult(request);
    }

    @ApiOperation(value = "/rest/api/ranks/h5/share", httpMethod = "GET")
    @NoMustSession
    @RequestMapping(value = "/rest/api/ranks/h5/share", method = RequestMethod.GET)
    public ResponseJSON getAward(HttpServletRequest request,
                                 @RequestParam(value = "seqId", defaultValue = "0") long seqId,
                                 @RequestParam(value = "anchorId", defaultValue = "0") long anchorId,
                                 @RequestParam(value = "sign") String sign) {
        return HttpClientUtils.getResult(request);
    }

    @ApiOperation(value = "/rest/api/ranks/pkexport", httpMethod = "GET")
    @NotSession
    @RequestMapping(value = "/rest/api/ranks/pkexport", method = RequestMethod.GET)
    public ResponseJSON exportPKHis(HttpServletRequest request,
                              @RequestParam(value = "env", defaultValue = "prod", required = false) String env,
                              @RequestParam(value = "uid", defaultValue = "1588512", required = false) long uid,
                              @RequestParam(value = "sign", required = true) String sign,
                              @RequestParam(value = "pkUid", defaultValue = "pkUid", required = false) String pkUid) throws Exception {
        return HttpClientUtils.getResult(request);
    }

    @ApiOperation(value = "/rest/api/ranks/isFollow", httpMethod = "GET")
    @RequestMapping(value = "/rest/api/ranks/isFollow", method = RequestMethod.GET)
    public ResponseJSON isFollow(HttpServletRequest request,
                                 @RequestParam(value = "fuid") long fuid) {
        return HttpClientUtils.getResult(request);
    }

    @ApiOperation(value = "/rest/api/ranks/everyDay", httpMethod = "GET")
    @NoMustSession
    @RequestMapping(value = "/rest/api/ranks/everyDay", method = RequestMethod.GET)
    public ResponseJSON everyDay(HttpServletRequest request,
                                 @RequestParam(value = "seqId") long seqId,
                                 @RequestParam(value = "region") String region,
                                 @RequestParam(value = "start", defaultValue = "0") int start,
                                 @RequestParam(value = "end", defaultValue = "99") int end) {
        return HttpClientUtils.getResult(request);
    }

    @ApiOperation(value = "/rest/api/ranks/bigFansRank", httpMethod = "GET")
    @NoMustSession
    @RequestMapping(value = "/rest/api/ranks/bigFansRank", method = RequestMethod.GET)
    public ResponseJSON bigFansRank(@Context HttpServletRequest request,
                                    @RequestParam(value = "fetchCount", defaultValue = "50") int fetchCount,
                                    @RequestParam(value = "category") String category) {
        return HttpClientUtils.getResult(request);
    }

    @ApiOperation(value = "/rest/api/ranks/shankou", httpMethod = "GET")
    @NoMustSession
    @RequestMapping(value = "/rest/api/ranks/shankou", method = RequestMethod.GET)
    public ResponseJSON shankou(@Context HttpServletRequest request) {
        return HttpClientUtils.getResult(request);
    }

    @ApiOperation(value = "/rest/api/ranks/vipChannel", httpMethod = "GET")
    @NotSession
    @RequestMapping(value = "/rest/api/ranks/vipChannel", method = RequestMethod.GET)
    public ResponseJSON vipChannel(@Context HttpServletRequest request,
                                   @RequestHeader(value = RequestUtils.HEADER_X_MEME_LANG, required = false, defaultValue = "zh-tw") String lang) {
        return HttpClientUtils.getResult(request);
    }

    @ApiOperation(value = "/rest/api/ranks/luckGift", httpMethod = "GET")
    @NoMustSession
    @RequestMapping(value = "/rest/api/ranks/luckGift", method = RequestMethod.GET)
    public ResponseJSON luckGift(@Context HttpServletRequest request,
                                 @RequestHeader(value = RequestUtils.HEADER_X_MEME_LANG, required = false, defaultValue = "zh-tw") String lang,
                                 @RequestParam(value = "giftId", required = true) long giftId) {
        return HttpClientUtils.getResult(request);
    }


    @ApiOperation(value = "/rest/api/ranks/userLiveTime", httpMethod = "GET")
    @NoMustSession
    @RequestMapping(value = "/rest/api/ranks/userLiveTime", method = RequestMethod.GET)
    public ResponseJSON userLiveTime(@Context HttpServletRequest request,
                                     @RequestHeader(value = RequestUtils.HEADER_X_MEME_LANG, required = false, defaultValue = "zh-tw") String lang,
                                     @RequestParam(value = "category", required = false,defaultValue = "currentMonth") String category,
                                     @RequestParam(value = "returnType", required = false,defaultValue = "short") String returnType) {
        return HttpClientUtils.getResult(request);
    }

    @ApiOperation(value = "/rest/api/ranks/h5control", httpMethod = "GET")
    @RequestMapping(value = "/rest/api/ranks/h5control", method = RequestMethod.GET)
    public ResponseJSON h5control(@Context HttpServletRequest request,
                                  @RequestParam(value = "code", required = true) String code,
                                  @RequestHeader(value = RequestUtils.HEADER_X_MEME_LANG, required = false, defaultValue = "zh-tw") String lang) {
        return HttpClientUtils.getResult(request);
    }
}