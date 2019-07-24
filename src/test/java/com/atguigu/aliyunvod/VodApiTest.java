package com.atguigu.aliyunvod;

import com.atguigu.aliyunvod.util.AliyunVodAPIUtils;
import org.junit.Test;

import java.util.HashMap;
import java.util.Map;

public class VodApiTest {
    @Test
    public void testGetVideoPlayAuth() throws Exception {
        //生成私有参数，不同API需要修改
        // 接口私有参数列表, 不同API请替换相应参数
        Map<String, String> privateParams = new HashMap<>();
        // 视频ID
        privateParams.put("VideoId","2888bbcd75bf4b8dba468feea9f6c465");
        // API名称
        privateParams.put("Action", "GetVideoPlayAuth");


        //生成公共参数，不需要修改
        Map<String, String> publicParams = AliyunVodAPIUtils.generatePublicParamters();
        //生成OpenAPI地址，不需要修改
        String URL = AliyunVodAPIUtils.generateOpenAPIURL(publicParams, privateParams);
        //发送HTTP GET 请求
        AliyunVodAPIUtils.httpGet(URL);

    }

    @Test
    public void testGetPlayInfo() throws Exception {
        //生成私有参数，不同API需要修改
        // 接口私有参数列表, 不同API请替换相应参数
        Map<String, String> privateParams = new HashMap<>();
        // 视频ID
        privateParams.put("VideoId","2888bbcd75bf4b8dba468feea9f6c465");
        // API名称
        privateParams.put("Action", "GetPlayInfo");


        privateParams.put("ResultType", "Multiple");
        //生成公共参数，不需要修改
        Map<String, String> publicParams = AliyunVodAPIUtils.generatePublicParamters();
        //生成OpenAPI地址，不需要修改
        String URL = AliyunVodAPIUtils.generateOpenAPIURL(publicParams, privateParams);
        //发送HTTP GET 请求
        AliyunVodAPIUtils.httpGet(URL);

    }
}
