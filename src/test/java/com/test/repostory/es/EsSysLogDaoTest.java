package com.test.repostory.es;

import com.BaseTest;
import com.elastic.entity.es.EsSysLog;
import com.elastic.repository.es.EsSysLogDao;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.elasticsearch.core.ElasticsearchOperations;
import org.springframework.data.elasticsearch.core.ElasticsearchTemplate;

/**
 * @author huchuanyin
 * @date 2018/11/12 11:13
 */
public class EsSysLogDaoTest extends BaseTest{

    @Autowired
    EsSysLogDao esSysLogDao;

    @Autowired
    ElasticsearchTemplate elasticsearchTemplate;

    @Test
    public void query(){
        elasticsearchTemplate.createIndex(EsSysLog.class);
    }
}
