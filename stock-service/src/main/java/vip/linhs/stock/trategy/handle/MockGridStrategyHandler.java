package vip.linhs.stock.trategy.handle;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import vip.linhs.stock.model.vo.trade.TradeRuleVo;
import vip.linhs.stock.service.MessageService;
import vip.linhs.stock.service.TradeService;
import vip.linhs.stock.trategy.model.GridStrategyInput;
import vip.linhs.stock.trategy.model.GridStrategyResult;

/**
 * Description:
 * User: dt.chen
 * Date: 2023/2/1
 * Time: 17:14
 */
@Component("mock_gridStrategyHandler")
public class MockGridStrategyHandler extends GridStrategyHandler{
    private static final Logger logger = LoggerFactory.getLogger(MockGridStrategyHandler.class);
    @Override
    public GridStrategyInput queryInput(TradeRuleVo tradeRuleVo) {
        return null;
    }

    @Override
    public GridStrategyResult handle(GridStrategyInput input) {
        return null;
    }

    @Override
    public void handleResult(GridStrategyInput input, GridStrategyResult result) {
        tradeService.saveTradeOrderList(null);

    }

    @Autowired
    private TradeService tradeService;

    @Autowired
    private MessageService messageServicve;

}
