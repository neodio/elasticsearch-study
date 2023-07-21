package com.example.es.domain.repository;

import com.example.es.domain.entity.ProdHist;
import org.springframework.data.elasticsearch.repository.ElasticsearchRepository;
import org.springframework.stereotype.Repository;

@Repository("prod-hist")
public interface ProdHistRepository extends ElasticsearchRepository<ProdHist, Long> {
}
