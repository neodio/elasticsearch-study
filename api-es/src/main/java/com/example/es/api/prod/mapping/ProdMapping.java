package com.example.es.api.prod.mapping;

import com.example.es.api.prod.dto.ProdDto;
import com.example.es.domain.entity.Prod;
import org.mapstruct.Mapper;
import org.mapstruct.ReportingPolicy;
import org.mapstruct.factory.Mappers;

@Mapper(unmappedTargetPolicy = ReportingPolicy.IGNORE)
public interface ProdMapping {
    ProdMapping INSTANCE = Mappers.getMapper(ProdMapping.class);

    Prod toProd(ProdDto prodDto);

    ProdDto toProdDto(Prod prod);
}
