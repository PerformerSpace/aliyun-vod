package com.atguigu.aliyunvod;

import com.aliyun.vod.upload.impl.UploadVideoImpl;
import com.aliyun.vod.upload.req.UploadVideoRequest;
import com.aliyun.vod.upload.resp.UploadVideoResponse;
import org.junit.Test;

public class UploadTest {

    private static String accessKeyId = "LTAI1B5gacaF9Vvf";
    private static String accessKeySecret = "8MT2gGmC9ef1HFJ4R2QzqeL7N2tPpR";

    /**
     * 视频上传：本地文件上传
     */
    @Test
    public void testUploadVideo(){

        String title = "测试标题";
        String fileName = "G:/尚硅谷课件和视频2/姚环-在线教育/共享-在线教育-v5/06.资源/课程视频/3 - How Does Project Submission Work.mp4";
        //本地文件上传
        UploadVideoRequest request = new UploadVideoRequest(accessKeyId, accessKeySecret, title, fileName);
        UploadVideoImpl uploader = new UploadVideoImpl();
        UploadVideoResponse response = uploader.uploadVideo(request);
        System.out.print("RequestId=" + response.getRequestId() + "\n");  //请求视频点播服务的请求ID

        if (response.isSuccess()) {
            System.out.print("VideoId=" + response.getVideoId() + "\n");
        } else {
            /* 如果设置回调URL无效，不影响视频上传，可以返回VideoId同时会返回错误码。其他情况上传失败时，VideoId为空，此时需要根据返回错误码分析具体错误原因 */
            System.out.print("VideoId=" + response.getVideoId() + "\n");
            System.out.print("ErrorCode=" + response.getCode() + "\n");
            System.out.print("ErrorMessage=" + response.getMessage() + "\n");
        }

    }
}
