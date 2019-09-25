package com.yxy.security.core.properties;

/**
 * @author 余想英
 * @version V1.0
 * @ClassName: ImageCodeProperties
 * @Description:TODO(验证码参数配置文件)
 * @date: 2019年09月25日 15:48
 * @Copyright: 2019 www.ti-t.cn Inc. All rights reserved.
 * 注意：本内容仅限于福建创昱达信息技术有限公司内部传阅，禁止外泄以及用于其他的商业目
 **/
public class ImageCodeProperties {
    private int width = 67; //验证码图片宽
    private int height = 23;//验证码图片高
    private int length = 4;//验证码长度
    private int expireIn = 60;//验证码失效时间

    private String url="";//要验证的路径

    public int getWidth() {
        return width;
    }

    public void setWidth(int width) {
        this.width = width;
    }

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    public int getLength() {
        return length;
    }

    public void setLength(int length) {
        this.length = length;
    }

    public int getExpireIn() {
        return expireIn;
    }

    public void setExpireIn(int expireIn) {
        this.expireIn = expireIn;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }
}
