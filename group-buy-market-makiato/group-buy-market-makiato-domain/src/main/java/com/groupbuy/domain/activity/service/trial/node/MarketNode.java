package com.groupbuy.domain.activity.service.trial.node;

import com.groupbuy.domain.activity.model.entity.MarketProductEntity;
import com.groupbuy.domain.activity.model.entity.TrialBalanceEntity;
import com.groupbuy.domain.activity.service.trial.AbstractGroupBuyMarketSupport;
import com.groupbuy.domain.activity.service.trial.factory.DefaultActivityStrategyFactory;
import com.groupbuy.types.design.framework.tree.StrategyHandler;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import java.util.concurrent.ThreadPoolExecutor;

@Slf4j
@Service
public class MarketNode extends AbstractGroupBuyMarketSupport<MarketProductEntity, DefaultActivityStrategyFactory.DynamicContext, TrialBalanceEntity> {

    private ThreadPoolExecutor threadPoolExecutor;

    @Override
    protected void multiThread(MarketProductEntity requestParameter, DefaultActivityStrategyFactory.DynamicContext dynamicContext) {
        super.multiThread(requestParameter, dynamicContext);
    }

    @Override
    public TrialBalanceEntity doApply(MarketProductEntity requestParameter, DefaultActivityStrategyFactory.DynamicContext dynamicContext) throws Exception {
        return null;
    }

    @Override
    public StrategyHandler<MarketProductEntity, DefaultActivityStrategyFactory.DynamicContext, TrialBalanceEntity> get(MarketProductEntity requestParameter, DefaultActivityStrategyFactory.DynamicContext dynamicContext) {
        return null;
    }
}
