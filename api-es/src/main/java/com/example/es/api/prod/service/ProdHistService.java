package com.example.es.api.prod.service;

import com.example.es.api.prod.dto.ProdHistDto;
import com.example.es.api.prod.mapping.ProdHistMapping;
import com.example.es.domain.entity.ProdHist;
import com.example.es.domain.repository.ProdHistRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class ProdHistService {
    private final ProdHistRepository prodHistRepository;

    public Long addProdHist(final ProdHistDto prodHistDto) {
        ProdHist prodHist = ProdHistMapping.INSTANCE.toProdHist(prodHistDto);
        prodHistRepository.save(prodHist);
        return 0L;
    }
}
