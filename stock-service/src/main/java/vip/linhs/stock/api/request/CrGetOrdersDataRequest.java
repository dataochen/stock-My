package vip.linhs.stock.api.request;

public class CrGetOrdersDataRequest extends GetOrdersDataRequest {

    public CrGetOrdersDataRequest(int userId) {
        super(userId);
    }

    @Override
    public String getMethod() {
        return BaseTradeRequest.TradeRequestMethod.CrGetOrdersData.value();
    }

}
