/* Copyright (c) 2022 com.github.anyzm. All rights reserved.
 *
 * This source code is licensed under Apache 2.0 License,
 * attached with Common Clause Condition 1.0, found in the LICENSES directory.
 */
package com.github.anyzm.graph.ocean.domain;

import com.github.anyzm.graph.ocean.dao.GraphValueFormatter;
import com.github.anyzm.graph.ocean.domain.impl.GraphVertexType;
import com.github.anyzm.graph.ocean.enums.GraphDataTypeEnum;
import com.github.anyzm.graph.ocean.enums.GraphKeyPolicy;

import java.util.List;
import java.util.Map;

/**
 * Description  GraphLabelBuilder is used for
 *
 * @author Anyzm
 * Date  2021/9/13 - 16:08
 * @version 1.0.0
 */
public interface GraphLabelBuilder {

    /**
     * 构造元素名
     *
     * @param graphLabelName
     * @return
     */
    public GraphLabelBuilder graphLabelName(String graphLabelName);

    /**
     * 构造元素对应的类
     *
     * @param labelClass
     * @return
     */
    public GraphLabelBuilder labelClass(Class labelClass);

    /**
     * 构造属性格式化map
     *
     * @param propertyFormatMap
     * @return
     */
    public GraphLabelBuilder propertyFormatMap(Map<String, GraphValueFormatter> propertyFormatMap);

    /**
     * 构造数据类型map
     *
     * @param dataTypeMap
     * @return
     */
    public GraphLabelBuilder dataTypeMap(Map<String, GraphDataTypeEnum> dataTypeMap);

    /**
     * 构造必要属性
     *
     * @param mustProps
     * @return
     */
    public GraphLabelBuilder mustProps(List<String> mustProps);

    /**
     * 构造属性字段map
     *
     * @param propertyFieldMap
     * @return
     */
    public GraphLabelBuilder propertyFieldMap(Map<String, String> propertyFieldMap);

    /**
     * 构造主键策略
     *
     * @param graphKeyPolicy
     * @return
     */
    public GraphLabelBuilder graphKeyPolicy(GraphKeyPolicy graphKeyPolicy);

    /**
     * 构造id是否作为字段
     *
     * @param idAsField
     * @return
     */
    public GraphLabelBuilder idAsField(boolean idAsField);

    /**
     * 构造id值格式转化器
     *
     * @param idValueFormatter
     * @return
     */
    public GraphLabelBuilder idValueFormatter(GraphValueFormatter idValueFormatter);


    /**
     * 构造起点id是否作为字段
     *
     * @param srcIdAsField
     * @return
     */
    public GraphLabelBuilder srcIdAsField(boolean srcIdAsField);

    /**
     * 构造目标id是否作为字段
     *
     * @param dstIdAsField
     * @return
     */
    public GraphLabelBuilder dstIdAsField(boolean dstIdAsField);

    /**
     * 构造起点id值格式转化器
     *
     * @param srcIdValueFormatter
     * @return
     */
    public GraphLabelBuilder srcIdValueFormatter(GraphValueFormatter srcIdValueFormatter);

    /**
     * 构造目标id值格式转化器
     *
     * @param dstIdValueFormatter
     * @return
     */
    public GraphLabelBuilder dstIdValueFormatter(GraphValueFormatter dstIdValueFormatter);

    /**
     * 构造起点顶点类型
     *
     * @param srcGraphVertexType
     * @return
     */
    public GraphLabelBuilder srcGraphVertexType(GraphVertexType srcGraphVertexType);

    /**
     * 构造目标顶点类型
     *
     * @param dstGraphVertexType
     * @return
     */
    public GraphLabelBuilder dstGraphVertexType(GraphVertexType dstGraphVertexType);

    /**
     * 构造出真实的元素
     *
     * @return
     */
    public GraphLabel build();

}
