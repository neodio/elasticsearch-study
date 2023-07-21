package com.example.es.domain.entity;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.springframework.data.annotation.Id;
import org.springframework.data.elasticsearch.annotations.Document;
import org.springframework.data.elasticsearch.annotations.Field;
import org.springframework.data.elasticsearch.annotations.FieldType;
import org.springframework.data.elasticsearch.annotations.Mapping;
import org.springframework.data.elasticsearch.annotations.Setting;

@Getter
@Setter
@Setting(settingPath = "/elasticsearch/mappings/settings.json")
@Mapping(mappingPath = "/elasticsearch/mappings/prod-hist.json")
@AllArgsConstructor
@NoArgsConstructor
@Document(indexName = "prod-hist-#{T(java.time.LocalDate).now().toString()}")
public class ProdHist {

    @Id
    @Field(type = FieldType.Long)
    private Long prodNo;

    @Field(type = FieldType.Text, analyzer = "custom-analyzer")
    private String prodNm;

    @Field(index = false)
    private String others;

}
