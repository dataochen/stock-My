package vip.linhs.stock.api.request;

public class GetCanBuyNewStockListV3Request extends BaseTradeRequest {

    public GetCanBuyNewStockListV3Request(int userId) {
        super(userId);
    }

    @Override
    public String getMethod() {
        return BaseTradeRequest.TradeRequestMethod.GetCanBuyNewStockListV3.value();
    }

    @Override
    public int responseVersion() {
        return VERSION_OBJ;
    }

}
