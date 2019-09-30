package com.yxy.security.core.validate.code.image;

import com.yxy.security.core.validate.code.impl.AbstractValidateCodeProcessor;
import org.springframework.stereotype.Component;
import org.springframework.web.context.request.ServletWebRequest;

import javax.imageio.ImageIO;
import java.awt.*;

/**
 * @author 余想英
 * @version V1.0
 * @ClassName: ImageCodeProcessor
 * @Description:TODO(图形验证码处理器)
 * @date: 2019年09月30日 10:18
 **/
@Component("imageCodeProcessor")
public class ImageCodeProcessor extends AbstractValidateCodeProcessor<ImageCode> {
    //发送图形验证码，将其写到响应中
    @Override
    protected void send(ServletWebRequest request, ImageCode imageCode) throws Exception {
        ImageIO.write(imageCode.getImage(),"JPEG",request.getResponse().getOutputStream());
    }
}
