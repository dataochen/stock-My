package vip.linhs.stock.api.request;

public class CrQueryCollateralRequest extends BaseQueryRequest {

    public CrQueryCollateralRequest(int userId) {
        super(userId);
    }

    @Override
    public String getMethod() {
        return TradeRequestMethod.CrQueryCollateral.value();
    }

}
