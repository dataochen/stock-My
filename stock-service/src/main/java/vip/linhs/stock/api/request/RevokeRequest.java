package vip.linhs.stock.api.request;

public class RevokeRequest extends BaseTradeRequest {

    private String revokes;

    public RevokeRequest(int userId) {
        super(userId);
    }

    public String getRevokes() {
        return revokes;
    }

    public void setRevokes(String revokes) {
        this.revokes = revokes;
    }

    @Override
    public String getMethod() {
        return BaseTradeRequest.TradeRequestMethod.Revoke.value();
    }

    @Override
    public int responseVersion() {
        return VERSION_MSG;
    }

}
