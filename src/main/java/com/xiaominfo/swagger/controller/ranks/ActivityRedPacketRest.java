package com.xiaominfo.swagger.controller.ranks;

import com.funplus.base.utils.meme.RequestUtils;
import com.funplus.base.utils.meme.ResponseJSON;
import com.funplus.meme.base.web.aspect.WebUtils;
import com.google.common.collect.Maps;
import com.xiaominfo.swagger.utils.HttpClientUtils;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.slf4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpServletRequest;
import javax.ws.rs.core.Context;
import java.io.IOException;
import java.util.Map;

import static org.slf4j.LoggerFactory.getLogger;

/**
 * Created by kai.ji on 18/5/8.
 */
@Api(tags = "生日模板",description = "生日模板")
@RestController
public class ActivityRedPacketRest {

    @Autowired
    private HttpServletRequest request;


    /**
     * 配置相关
     *
     * @return
     */
    @ApiOperation(value = "/rest/arp/config", httpMethod = "GET")
    @RequestMapping(value = "/rest/arp/config", method = RequestMethod.GET)
    public ResponseJSON config(@RequestHeader(value = "X-MeMe-Language", required = false, defaultValue = "zh-tw") String language,
                               @RequestHeader(value = RequestUtils.HEADER_X_MEME_SESSION, required = false) String session,
                               @RequestParam(value = "groupId", required = false, defaultValue = "0") long groupId,
                               @RequestParam(value = "region", defaultValue = "Default") String region) throws IOException {

        return HttpClientUtils.getResult(request);

    }

    @ApiOperation(value = "/rest/arp/grab", httpMethod = "GET")
    @RequestMapping(value = "/rest/arp/grab", method = RequestMethod.GET)
    public ResponseJSON grab(@RequestParam(value = "seqId", required = false, defaultValue = "0") long seqId,
                             @RequestParam(value = "region", required = false, defaultValue = "Default") String region,
                             @RequestParam(value = "batchId") String batchId,
                             @RequestParam(value = "streamId") long streamId,
                             @RequestHeader(value = "X-MeMe-Language", required = false, defaultValue = "zh-tw") String language,
                             @RequestHeader(value = RequestUtils.HEADER_X_MEME_DEVICEID_SM, required = false) String deviceIdSM,
                             @RequestHeader(value = RequestUtils.HEADER_X_MEME_CLIENTIP, required = false) String clientIp,
                             @RequestHeader(value = "channel", required = false, defaultValue = "0") int channel,
                             @RequestHeader(value = RequestUtils.HEADER_X_MEME_SESSION, required = false) String session,
                             @Context HttpServletRequest request) throws IOException {

        return HttpClientUtils.getResult(request);
    }


}
