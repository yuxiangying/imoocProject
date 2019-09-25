package com.yxy.security.browser.support;

/**
 * @author 余想英
 * @version V1.0
 * @ClassName: SimpleResponse
 * @Description:TODO(这里用一句话描述这个类的作用)
 * @date: 2019年08月27日 9:55
 **/
public class SimpleResponse {
    private Object content;

    public SimpleResponse(Object content) {
        this.content = content;
    }

    public Object getContent() {
        return content;
    }

    public void setContent(Object content) {
        this.content = content;
    }
}
