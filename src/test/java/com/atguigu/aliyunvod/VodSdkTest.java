package com.atguigu.aliyunvod;

import com.aliyuncs.DefaultAcsClient;
import com.aliyuncs.exceptions.ClientException;
import com.aliyuncs.vod.model.v20170321.GetVideoPlayAuthRequest;
import com.aliyuncs.vod.model.v20170321.GetVideoPlayAuthResponse;
import com.atguigu.aliyunvod.util.AliyunVodSDKUtils;
import org.junit.Test;

public class VodSdkTest {

    private static String accessKeyId = "LTAI1B5gacaF9Vvf";
    private static String accessKeySecret = "8MT2gGmC9ef1HFJ4R2QzqeL7N2tPpR";

    /**
     * 获取视频播放凭证
     * @throws ClientException
     */
    @Test
    public void testGetVideoPlayAuth() throws ClientException {
        //初始化客户端、请求对象和相应对象
        DefaultAcsClient client = AliyunVodSDKUtils.initVodClient(accessKeyId, accessKeySecret);
        GetVideoPlayAuthRequest request = new GetVideoPlayAuthRequest();
        GetVideoPlayAuthResponse response = new GetVideoPlayAuthResponse();

        try {

            //设置请求参数
            request.setVideoId("2888bbcd75bf4b8dba468feea9f6c465");
            //获取请求响应
            response = client.getAcsResponse(request);

            //输出请求结果
            //播放凭证
            System.out.print("PlayAuth = " + response.getPlayAuth() + "\n");
            //VideoMeta信息
            System.out.print("VideoMeta.Title = " + response.getVideoMeta().getTitle() + "\n");
        } catch (Exception e) {
            System.out.print("ErrorMessage = " + e.getLocalizedMessage());
        }

        System.out.print("RequestId = " + response.getRequestId() + "\n");
    }
}
