package com.example.es.api.prod.mapping;

import com.example.es.api.prod.dto.ProdHistDto;
import com.example.es.domain.entity.ProdHist;
import org.mapstruct.Mapper;
import org.mapstruct.ReportingPolicy;
import org.mapstruct.factory.Mappers;

@Mapper(unmappedTargetPolicy = ReportingPolicy.IGNORE)
public interface ProdHistMapping {

    ProdHistMapping INSTANCE = Mappers.getMapper(ProdHistMapping.class);

    ProdHist toProdHist(ProdHistDto prodHistDto);

}
