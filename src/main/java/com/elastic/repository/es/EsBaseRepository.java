package com.elastic.repository.es;

import java.io.Serializable;

import org.springframework.data.elasticsearch.repository.ElasticsearchRepository;
import org.springframework.data.repository.NoRepositoryBean;

@NoRepositoryBean
public interface EsBaseRepository<T, ID extends Serializable> extends ElasticsearchRepository<T, ID> {

}
