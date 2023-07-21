package com.example.es.api.prod.dto;

import lombok.Getter;
import lombok.Setter;

import java.util.List;

@Setter
@Getter
public class ProdGetResDto {
    private int prodCount;
    private List<ProdDto> list;
}
