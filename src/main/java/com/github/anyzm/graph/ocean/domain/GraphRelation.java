/* Copyright (c) 2022 com.github.anyzm. All rights reserved.
 *
 * This source code is licensed under Apache 2.0 License,
 * attached with Common Clause Condition 1.0, found in the LICENSES directory.
 */
package com.github.anyzm.graph.ocean.domain;

import com.github.anyzm.graph.ocean.domain.impl.GraphEdgeEntity;
import com.github.anyzm.graph.ocean.domain.impl.GraphVertexType;
import java.util.List;

/**
 * @author Anyzm
 * @date 2020/5/1
 */
public interface GraphRelation<S, T, E> {
    /**
     * 获取 srcId
     *
     * @return
     */
    String getSrcId();

    /**
     * 获取 endId
     *
     * @return
     */
    String getDstId();

    /**
     * 获取 srcEdgeTag
     *
     * @return
     */
    GraphVertexType<S> getSrcVertexType();

    /**
     * 获取 endEdgeTag
     *
     * @return
     */
    GraphVertexType<E> getDstVertexType();

    /**
     * 获取关联的顶点
     *
     * @return
     */
    List<GraphVertexType> getVertices();

    /**
     * 获取关联的边
     *
     * @return
     */
    List<GraphEdgeEntity<S, T, E>> getEdges();

    /**
     * 是否不考虑方向
     *
     * @return
     */
    boolean isIgnoreDirect();

    /**
     * 设置值
     *
     * @param ignoreDirect
     */
    void setIgnoreDirect(boolean ignoreDirect);

    /**
     * 必须提供hash code
     *
     * @return
     */
    int getHashCode();

    /**
     * 判断关系是否相等
     *
     * @param o
     * @return
     */
    boolean isEquals(Object o);

    /**
     * 设置层级
     *
     * @param level
     */
    void setLevel(int level);

    /**
     * 获取层级
     *
     * @return
     */
    int getLevel();

}
