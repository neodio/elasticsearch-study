package com.example.es.api.prod.service;

import com.example.es.api.prod.dto.ProdDto;
import com.example.es.api.prod.dto.ProdGetResDto;
import com.example.es.domain.entity.Prod;
import com.example.es.domain.repository.ProdRepository;
import com.example.es.api.prod.mapping.ProdMapping;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;
import org.springframework.util.CollectionUtils;
import org.springframework.util.ObjectUtils;

import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

@Slf4j
@Service
@RequiredArgsConstructor
public class ProdService {
    private final ProdRepository prodRepository;


    /**
     * 상품 도큐먼트 생성
     *
     * @param prodDto the prod dto
     * @return the long
     */
    public Long addProdDocument(final ProdDto prodDto) {
        Prod prod = ProdMapping.INSTANCE.toProd(prodDto);
        prodRepository.save(prod);
        return prod.getProdNo();
    }

    /**
     * 상품번호로 도큐먼트 조회
     *
     * @param prodNo the prod no
     * @return the prod by prod no
     */
    public ProdDto getProdByProdNo(final long prodNo) {
        Prod prod = prodRepository.findByProdNo(prodNo);
        if (ObjectUtils.isEmpty(prod)) {
            return null;
        }

        return ProdMapping.INSTANCE.toProdDto(prod);
    }

    /**
     * 상품명으로 도큐먼트 조회
     *
     * @param prodNm the prod nm
     * @return the prod by prod nm
     */
    public List<ProdDto> getProdByProdNm(final String prodNm) {
        List<Prod> prodList = prodRepository.findByProdNm(prodNm);

        if (CollectionUtils.isEmpty(prodList)) {
            return Collections.emptyList();
        }

        return prodList.stream().map(ProdMapping.INSTANCE::toProdDto).collect(Collectors.toList());
    }

    public ProdGetResDto getProdAll() {
        List<Prod> prodList = prodRepository.findAll();

        ProdGetResDto prodGetResDto = new ProdGetResDto();
        prodGetResDto.setProdCount(prodList.size());
        prodGetResDto.setList(prodList.stream().map(ProdMapping.INSTANCE::toProdDto).collect(Collectors.toList()));

        return prodGetResDto;
    }
}
