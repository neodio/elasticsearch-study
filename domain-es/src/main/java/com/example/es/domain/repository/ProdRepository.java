package com.example.es.domain.repository;


import com.example.es.domain.entity.Prod;
import org.springframework.data.elasticsearch.repository.ElasticsearchRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository("prodRepository")
public interface ProdRepository extends ElasticsearchRepository<Prod, Long> {

	List<Prod> findByProdNm(String prodNm);

	Prod findByProdNo(Long prodNo);

	List<Prod> findAll();
}
