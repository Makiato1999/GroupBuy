package com.groupbuy.types.design.framework.tree;

/**
 * 策略处理器
 */
public interface StrategyHandler<T, D, R> {

    StrategyHandler DEFAULT = (T, D) -> null;
    // 等价于public static final StrategyHandler DEFAULT = (T, D) -> null;

    R apply(T requestParameter, D dynamicContext) throws Exception;
}
