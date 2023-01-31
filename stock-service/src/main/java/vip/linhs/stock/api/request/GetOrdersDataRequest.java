package vip.linhs.stock.api.request;

public class GetOrdersDataRequest extends BaseQueryRequest {

    public GetOrdersDataRequest(int userId) {
        super(userId);
    }

    @Override
    public String getMethod() {
        return BaseTradeRequest.TradeRequestMethod.GetOrdersData.value();
    }

}
