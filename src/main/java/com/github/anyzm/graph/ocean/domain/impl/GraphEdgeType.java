/* Copyright (c) 2022 com.github.anyzm. All rights reserved.
 *
 * This source code is licensed under Apache 2.0 License,
 * attached with Common Clause Condition 1.0, found in the LICENSES directory.
 */
package com.github.anyzm.graph.ocean.domain.impl;

import com.github.anyzm.graph.ocean.dao.GraphValueFormatter;
import com.github.anyzm.graph.ocean.domain.AbstractGraphLabel;
import com.github.anyzm.graph.ocean.enums.GraphDataTypeEnum;
import lombok.Getter;
import lombok.Setter;

import java.util.List;
import java.util.Map;

/**
 * Description  GraphEdgeType is used for
 *
 * @author Anyzm
 * Date  2021/7/16 - 14:18
 * @version 1.0.0
 */
@Setter
@Getter
public class GraphEdgeType<S, T, E> extends AbstractGraphLabel {

    private String edgeName;

    /**
     * 起点顶点类型
     */
    private GraphVertexType<S> srcVertexType;
    /**
     * 终点顶点类型
     */
    private GraphVertexType<T> dstVertexType;

    private Class<E> edgeClass;

    private boolean srcIdAsField;

    private boolean dstIdAsField;

    private GraphValueFormatter srcIdValueFormatter;

    private GraphValueFormatter dstIdValueFormatter;

    protected GraphEdgeType() {
    }

    private GraphEdgeType(String edgeName, Class<E> edgeClass, List<String> mustFields, Map<String, String> propertyFieldMap,
                          Map<String, GraphValueFormatter> propertyFormatMap, Map<String, GraphDataTypeEnum> dataTypeMap,
                          GraphVertexType<S> srcVertexType, GraphVertexType<T> dstVertexType, boolean srcIdAsField, boolean dstIdAsField) {
        this.edgeName = edgeName;
        this.edgeClass = edgeClass;
        this.mustFields = mustFields;
        this.propertyFieldMap = propertyFieldMap;
        this.propertyFormatMap = propertyFormatMap;
        this.srcVertexType = srcVertexType;
        this.dstVertexType = dstVertexType;
        this.dataTypeMap = dataTypeMap;
        this.srcIdAsField = srcIdAsField;
        this.dstIdAsField = dstIdAsField;
    }

    /**
     * 方法内部决定是否需要加工
     *
     * @param vertexKey 原始的id数据
     * @return
     */
    public String getSrcIdKey(String vertexKey) {
        if (srcIdValueFormatter != null) {
            vertexKey = (String) srcIdValueFormatter.format(vertexKey);
        }
        return vertexKey;
    }

    /**
     * 方法内部决定是否需要加工
     *
     * @param vertexKey 原始的id数据
     * @return
     */
    public String getDstIdKey(String vertexKey) {
        if (dstIdValueFormatter != null) {
            vertexKey = (String) dstIdValueFormatter.format(vertexKey);
        }
        return vertexKey;
    }


    @Override
    public boolean isTag() {
        return false;
    }

    @Override
    public boolean isEdge() {
        return true;
    }

    @Override
    public String getName() {
        return this.getEdgeName();
    }


}
