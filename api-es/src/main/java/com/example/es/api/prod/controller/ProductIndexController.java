package com.example.es.api.prod.controller;

import com.example.es.api.prod.dto.ProdDto;
import com.example.es.api.prod.dto.ProdGetResDto;
import com.example.es.api.prod.service.ProdService;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@Slf4j
@RestController
@RequiredArgsConstructor
public class ProductIndexController {

    private final ProdService prodService;

    @PostMapping("/indexer/product/createProduct")
    public Long createProduct(@RequestBody ProdDto prodDto) {
        return prodService.addProdDocument(prodDto);
    }

    @GetMapping("/indexer/search/product/all")
    public ProdGetResDto getProdAll() {
        return prodService.getProdAll();
    }
}
