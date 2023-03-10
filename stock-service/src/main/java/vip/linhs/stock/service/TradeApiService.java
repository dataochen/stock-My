package vip.linhs.stock.service;

import vip.linhs.stock.api.TradeResultVo;
import vip.linhs.stock.api.request.AuthenticationRequest;
import vip.linhs.stock.api.request.CrGetCanBuyNewStockListV3Request;
import vip.linhs.stock.api.request.CrGetConvertibleBondListV2Request;
import vip.linhs.stock.api.request.CrGetDealDataRequest;
import vip.linhs.stock.api.request.CrGetHisDealDataRequest;
import vip.linhs.stock.api.request.CrGetHisOrdersDataRequest;
import vip.linhs.stock.api.request.CrGetOrdersDataRequest;
import vip.linhs.stock.api.request.CrGetRzrqAssertsRequest;
import vip.linhs.stock.api.request.CrQueryCollateralRequest;
import vip.linhs.stock.api.request.CrRevokeRequest;
import vip.linhs.stock.api.request.CrSubmitBatTradeV2Request;
import vip.linhs.stock.api.request.CrSubmitRequest;
import vip.linhs.stock.api.request.GetAssetsRequest;
import vip.linhs.stock.api.request.GetCanBuyNewStockListV3Request;
import vip.linhs.stock.api.request.GetConvertibleBondListV2Request;
import vip.linhs.stock.api.request.GetDealDataRequest;
import vip.linhs.stock.api.request.GetHisDealDataRequest;
import vip.linhs.stock.api.request.GetHisOrdersDataRequest;
import vip.linhs.stock.api.request.GetOrdersDataRequest;
import vip.linhs.stock.api.request.GetStockListRequest;
import vip.linhs.stock.api.request.RevokeRequest;
import vip.linhs.stock.api.request.SubmitBatTradeV2Request;
import vip.linhs.stock.api.request.SubmitRequest;
import vip.linhs.stock.api.response.AuthenticationResponse;
import vip.linhs.stock.api.response.CrGetCanBuyNewStockListV3Response;
import vip.linhs.stock.api.response.CrGetConvertibleBondListV2Response;
import vip.linhs.stock.api.response.CrGetDealDataResponse;
import vip.linhs.stock.api.response.CrGetHisDealDataResponse;
import vip.linhs.stock.api.response.CrGetHisOrdersDataResponse;
import vip.linhs.stock.api.response.CrGetOrdersDataResponse;
import vip.linhs.stock.api.response.CrGetRzrqAssertsResponse;
import vip.linhs.stock.api.response.CrQueryCollateralResponse;
import vip.linhs.stock.api.response.CrRevokeResponse;
import vip.linhs.stock.api.response.CrSubmitBatTradeV2Response;
import vip.linhs.stock.api.response.CrSubmitResponse;
import vip.linhs.stock.api.response.GetAssetsResponse;
import vip.linhs.stock.api.response.GetCanBuyNewStockListV3Response;
import vip.linhs.stock.api.response.GetConvertibleBondListV2Response;
import vip.linhs.stock.api.response.GetDealDataResponse;
import vip.linhs.stock.api.response.GetHisDealDataResponse;
import vip.linhs.stock.api.response.GetHisOrdersDataResponse;
import vip.linhs.stock.api.response.GetOrdersDataResponse;
import vip.linhs.stock.api.response.GetStockListResponse;
import vip.linhs.stock.api.response.RevokeResponse;
import vip.linhs.stock.api.response.SubmitBatTradeV2Response;
import vip.linhs.stock.api.response.SubmitResponse;

public interface TradeApiService {

    /**
     * ????????????
     */
    TradeResultVo<GetAssetsResponse> getAsserts(GetAssetsRequest request);

    /**
     * ????????????
     */
    TradeResultVo<SubmitResponse> submit(SubmitRequest request);

    /**
     * ??????
     */
    TradeResultVo<RevokeResponse> revoke(RevokeRequest request);

    /**
     * ????????????
     */
    TradeResultVo<GetStockListResponse> getStockList(GetStockListRequest request);

    /**
     * ????????????
     */
    TradeResultVo<GetOrdersDataResponse> getOrdersData(GetOrdersDataRequest request);

    /**
     * ????????????
     */
    TradeResultVo<GetDealDataResponse> getDealData(GetDealDataRequest request);

    /**
     * ??????
     */
    TradeResultVo<AuthenticationResponse> authentication(AuthenticationRequest request);

    /**
     * ????????????
     */
    TradeResultVo<GetHisDealDataResponse> getHisDealData(GetHisDealDataRequest request);

    /**
     * ????????????
     */
    TradeResultVo<GetHisOrdersDataResponse> getHisOrdersData(GetHisOrdersDataRequest request);

    /**
     * ???????????????????????????
     */
    TradeResultVo<GetCanBuyNewStockListV3Response> getCanBuyNewStockListV3(GetCanBuyNewStockListV3Request request);

    /**
     * ???????????????????????????
     */
    TradeResultVo<GetConvertibleBondListV2Response> getConvertibleBondListV2(GetConvertibleBondListV2Request request);

    /**
     * ????????????
     */
    TradeResultVo<SubmitBatTradeV2Response> submitBatTradeV2(SubmitBatTradeV2Request request);

    /**
     * ??????????????????
     */
    TradeResultVo<CrGetRzrqAssertsResponse> crGetRzrqAsserts(CrGetRzrqAssertsRequest request);

    /**
     * ??????????????????
     */
    TradeResultVo<CrQueryCollateralResponse> crQueryCollateral(CrQueryCollateralRequest request);

    /**
     * ??????????????????
     */
    TradeResultVo<CrSubmitResponse> crSubmit(CrSubmitRequest request);

    /**
     * ????????????
     */
    TradeResultVo<CrRevokeResponse> crRevoke(CrRevokeRequest request);

    /**
     * ??????????????????
     */
    TradeResultVo<CrGetOrdersDataResponse> crGetOrdersData(CrGetOrdersDataRequest request);

    /**
     * ??????????????????
     */
    TradeResultVo<CrGetDealDataResponse> crGetDealData(CrGetDealDataRequest request);

    /**
     * ??????????????????
     */
    TradeResultVo<CrGetHisDealDataResponse> crGetHisDealData(CrGetHisDealDataRequest request);

    /**
     * ??????????????????
     */
    TradeResultVo<CrGetHisOrdersDataResponse> crGetHisOrdersData(CrGetHisOrdersDataRequest request);

    /**
     * ?????????????????????????????????
     */
    TradeResultVo<CrGetCanBuyNewStockListV3Response> crGetCanBuyNewStockListV3(CrGetCanBuyNewStockListV3Request request);

    /**
     * ?????????????????????????????????
     */
    TradeResultVo<CrGetConvertibleBondListV2Response> crGetConvertibleBondListV2(CrGetConvertibleBondListV2Request request);

    /**
     * ??????????????????
     */
    TradeResultVo<CrSubmitBatTradeV2Response> crSubmitBatTradeV2(CrSubmitBatTradeV2Request request);

}
