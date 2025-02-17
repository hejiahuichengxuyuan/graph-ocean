/* Copyright (c) 2022 com.github.anyzm. All rights reserved.
 *
 * This source code is licensed under Apache 2.0 License,
 * attached with Common Clause Condition 1.0, found in the LICENSES directory.
 */
package com.github.anyzm.graph.ocean.annotation;

import com.github.anyzm.graph.ocean.dao.GraphValueFormatter;
import com.github.anyzm.graph.ocean.enums.GraphDataTypeEnum;
import com.github.anyzm.graph.ocean.enums.GraphPropertyTypeEnum;

import java.lang.annotation.*;

/**
 * 业务说明：图的属性
 *
 * @author Anyzm
 * @date 2021/4/28
 **/
@Target(ElementType.FIELD)
@Retention(RetentionPolicy.RUNTIME)
@Documented
@Inherited
public @interface GraphProperty {

    /**
     * 属性名称
     *
     * @return
     */
    String value();

    /**
     * 数据类型
     *
     * @return
     */
    GraphDataTypeEnum dataType() default GraphDataTypeEnum.STRING;

    /**
     * 是否必需
     *
     * @return
     */
    boolean required() default false;

    /**
     * 属性类型
     *
     * @return
     */
    GraphPropertyTypeEnum propertyTypeEnum() default GraphPropertyTypeEnum.ORDINARY_PROPERTY;

    /**
     * 属性格式化
     *
     * @return
     */
    Class<? extends GraphValueFormatter> formatter() default GraphValueFormatter.class;

}
