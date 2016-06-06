/**
 * Alipay.com Inc.
 * Copyright (c) 2004-2012 All Rights Reserved.
 */
package com.alibaba.dubbo.rpc;

import org.apache.commons.lang.builder.ToStringBuilder;
import org.apache.commons.lang.builder.ToStringStyle;

import java.io.Serializable;

/**
 * RPC Model.
 *
 * @author Linpn
 * @since 04.11.2015
 */
public abstract class RpcModel implements Serializable {

    private static final long serialVersionUID = 5046534737074452170L;

    /**
     * 重新默认的toString()，用于输出日志等
     * 注：对于有敏感字段的类，请对重写改实现，否则敏感信息也会被输出
     *
     * @see Object#toString()
     */
    public String toString() {
        return ToStringBuilder.reflectionToString(this, ToStringStyle.SHORT_PREFIX_STYLE);
    }
}
