package com.platform.dts.core.biz.client;

import com.platform.dts.core.biz.model.HandleCallbackParam;
import com.platform.dts.core.biz.model.HandleProcessCallbackParam;
import com.platform.dts.core.biz.model.RegistryParam;
import com.platform.dts.core.util.JobRemotingUtil;
import com.platform.dts.core.biz.AdminBiz;
import com.platform.dts.core.biz.model.ReturnT;

import java.util.List;

/**
 * admin api test
 *
 * @author AllDataDC 2022/11/28 22:14:52
 */
public class AdminBizClient implements AdminBiz {

    public AdminBizClient() {
    }
    public AdminBizClient(String addressUrl, String accessToken) {
        this.addressUrl = addressUrl;
        this.accessToken = accessToken;

        // valid
        if (!this.addressUrl.endsWith("/")) {
            this.addressUrl = this.addressUrl + "/";
        }
    }

    private String addressUrl ;
    private String accessToken;


    @Override
    public ReturnT<String> callback(List<HandleCallbackParam> callbackParamList) {
        return JobRemotingUtil.postBody(addressUrl+"api/callback", accessToken, callbackParamList, 3);
    }

    @Override
    public ReturnT<String> processCallback(List<HandleProcessCallbackParam> callbackParamList) {
        return JobRemotingUtil.postBody(addressUrl + "api/processCallback", accessToken, callbackParamList, 3);
    }

    @Override
    public ReturnT<String> registry(RegistryParam registryParam) {
        return JobRemotingUtil.postBody(addressUrl + "api/registry", accessToken, registryParam, 3);
    }

    @Override
    public ReturnT<String> registryRemove(RegistryParam registryParam) {
        return JobRemotingUtil.postBody(addressUrl + "api/registryRemove", accessToken, registryParam, 3);
    }
}
