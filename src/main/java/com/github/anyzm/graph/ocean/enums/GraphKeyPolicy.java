/* Copyright (c) 2022 com.github.anyzm. All rights reserved.
 *
 * This source code is licensed under Apache 2.0 License,
 * attached with Common Clause Condition 1.0, found in the LICENSES directory.
 */
package com.github.anyzm.graph.ocean.enums;

import lombok.Getter;

/**
 * @author Anyzm
 * @version 1.0.0
 * @Description CaseStatusEnum is used for
 * @Date 2020/1/14 - 15:06
 */
public enum GraphKeyPolicy {

    /**
     * uuid
     */
    uuid("uuid"),
    /**
     * hash id
     */
    hash("hash"),
    /**
     * 字符串id
     */
    string_key(""),

    ;

    @Getter
    private String keyWrapWord;


    GraphKeyPolicy(String keyWrapWord) {
        this.keyWrapWord = keyWrapWord;
    }

}
