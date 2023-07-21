package com.example.es.api.prod.dto;

import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
public class ProdDto {
    private Long prodNo;
    private String prodNm;
    private String prodType;
    private String prodTypeNm;
    private String mallType;
    private String mallTypeNm;
    private String prodStatus;
    private String saleStatus;
    private String partnerId;
    private String partnerSellerBusinessNm;
    private String transType;
    private String dispYn;
    private Long brandNo;
    private String brandNm;
    private Long makerNo;
    private String makerNm;
    private String regId;
    private String regDt;
    private Integer dcateCd;
    private Integer scateCd;
    private Integer mcateCd;
    private Integer lcateCd;
    private String saleStartDt;
    private String saleEndDt;
    private Long originPrice;
    private Long salePrice;
    private String sellerProdCd;
    private String adultLimitYn;
    private String basketLimitYn;
    private String optSelUseYn;
    private String optTxtUseYn;
    private String dispOnlyDealYn;
    private String keywordEp;
    private String keywordWmp;
}
