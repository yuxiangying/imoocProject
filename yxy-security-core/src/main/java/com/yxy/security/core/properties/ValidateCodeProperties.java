package com.yxy.security.core.properties;

/**
 * @author 余想英
 * @version V1.0
 * @ClassName: ValidateCodeProperties
 * @Description:TODO(验证码配置文件（图形验证码和手机验证码）)
 * @date: 2019年09月25日 15:58
 * @Copyright: 2019 www.ti-t.cn Inc. All rights reserved.
 * 注意：本内容仅限于福建创昱达信息技术有限公司内部传阅，禁止外泄以及用于其他的商业目
 **/
public class ValidateCodeProperties {

    private ImageCodeProperties image = new ImageCodeProperties();

    public ImageCodeProperties getImage() {
        return image;
    }

    public void setImage(ImageCodeProperties image) {
        this.image = image;
    }
}
