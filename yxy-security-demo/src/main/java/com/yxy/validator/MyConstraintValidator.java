package com.yxy.validator;

import javax.validation.ConstraintValidator;
import javax.validation.ConstraintValidatorContext;

/**
 * @author 余想英
 * @version V1.0
 * @ClassName: MyConstraintValidator
 * @Description:TODO(这里用一句话描述这个类的作用)
 * @date: 2019年08月21日 14:09
 * @Copyright: 2019 www.ti-t.cn Inc. All rights reserved.
 * 注意：本内容仅限于福建创昱达信息技术有限公司内部传阅，禁止外泄以及用于其他的商业目
 **/
public class MyConstraintValidator implements ConstraintValidator<MyConstraint,Object> {
    @Override
    public void initialize(MyConstraint constraintAnnotation) {
        System.out.println("MyConstraintValidator init");
    }

    @Override
    public boolean isValid(Object value, ConstraintValidatorContext context) {
        return false;
    }
}
