package com.example.es.domain.entity;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.springframework.data.annotation.Id;
import org.springframework.data.elasticsearch.annotations.DateFormat;
import org.springframework.data.elasticsearch.annotations.Document;
import org.springframework.data.elasticsearch.annotations.Field;
import org.springframework.data.elasticsearch.annotations.FieldType;
import org.springframework.data.elasticsearch.annotations.Setting;

@Getter
@Setter
@Setting(settingPath = "/elasticsearch/mappings/settings.json")
@AllArgsConstructor
@NoArgsConstructor
@Document(indexName = "prod")
public class Prod {
    @Id
    @Field(type = FieldType.Long)
    private Long prodNo;
    @Field(type = FieldType.Text, analyzer = "custom-analyzer")
    private String prodNm;
    @Field(type = FieldType.Text, analyzer = "custom-analyzer")
    private String partnerId;
    @Field(type = FieldType.Keyword)
    private String prodType;
    @Field(type = FieldType.Keyword)
    private String mallType;
    @Field(type = FieldType.Keyword)
    private String prodStatus;
    @Field(type = FieldType.Keyword)
    private String saleStatus;
    @Field(type = FieldType.Text, analyzer = "custom-analyzer")
    private String partnerSellerBusinessNm;
    @Field(type = FieldType.Keyword)
    private String dispYn;
    @Field(type = FieldType.Long)
    private Long brandNo;
    @Field(type = FieldType.Text, analyzer = "custom-analyzer")
    private String brandNm;
    @Field(type = FieldType.Long)
    private Long makerNo;
    @Field(type = FieldType.Keyword)
    private String makerNm;
    @Field(type = FieldType.Text)
    private String regId;
    @Field(type = FieldType.Date, format = DateFormat.custom, pattern = "yyyy-MM-dd HH:00")
    private String regDt;
    @Field(type = FieldType.Long)
    private Integer dcateCd;
    @Field(type = FieldType.Long)
    private Integer scateCd;
    @Field(type = FieldType.Long)
    private Integer mcateCd;
    @Field(type = FieldType.Long)
    private Integer lcateCd;
    @Field(type = FieldType.Date, format = DateFormat.custom, pattern = "yyyy-MM-dd HH:00")
    private String saleStartDt;
    @Field(type = FieldType.Date, format = DateFormat.custom, pattern = "yyyy-MM-dd HH:00")
    private String saleEndDt;
    @Field(type = FieldType.Long)
    private Long salePrice;
    @Field(type = FieldType.Keyword, analyzer = "custom-analyzer")
    private String sellerProdCd;
    @Field(type = FieldType.Keyword)
    private String adultLimitYn;
    @Field(type = FieldType.Keyword)
    private String basketLimitYn;
    @Field(type = FieldType.Keyword)
    private String optSelUseYn;
    @Field(type = FieldType.Keyword)
    private String optTxtUseYn;
    @Field(type = FieldType.Keyword)
    private String dispOnlyDealYn;
    @Field(type = FieldType.Text, analyzer = "custom-analyzer")
    private String keywordWmp;
}
