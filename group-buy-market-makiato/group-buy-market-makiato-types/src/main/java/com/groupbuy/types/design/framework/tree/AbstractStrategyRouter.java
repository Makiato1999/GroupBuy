package com.groupbuy.types.design.framework.tree;

import lombok.Getter;
import lombok.Setter;

public abstract class AbstractStrategyRouter<T, D, R> implements StrategyMapper<T, D, R>, StrategyHandler<T, D, R> {

    @Getter
    @Setter
    protected StrategyHandler<T, D, R> defaultStrategyHandler = StrategyHandler.DEFAULT;

    public R router(T requestParameter, D dynamicContext) throws Exception {
        StrategyHandler<T, D, R> strategyHandler = get(requestParameter, dynamicContext);
        // 抽象类的特性! get暂时还没实现，但是抽象类可以调用还未实现的抽象方法

        if (null != strategyHandler) {
            return strategyHandler.apply(requestParameter, dynamicContext);
        }
        return defaultStrategyHandler.apply(requestParameter, dynamicContext);
    }
}
