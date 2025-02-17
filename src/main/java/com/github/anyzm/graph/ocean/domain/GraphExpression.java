/* Copyright (c) 2022 com.github.anyzm. All rights reserved.
 *
 * This source code is licensed under Apache 2.0 License,
 * attached with Common Clause Condition 1.0, found in the LICENSES directory.
 */
package com.github.anyzm.graph.ocean.domain;

/**
 * Description  GraphExpression is used for
 *
 * @author Anyzm
 * Date  2021/8/19 - 10:57
 * @version 1.0.0
 */
public interface GraphExpression {

    /**
     * 构建sql
     *
     * @return
     */
    public String buildSql();

}
