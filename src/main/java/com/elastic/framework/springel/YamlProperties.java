package com.elastic.framework.springel;

import lombok.Data;
import org.apache.commons.lang3.StringUtils;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

/**
 * @author huchuanyin
 * @date 2018/11/13 10:11
 */
@Data
@Component(value ="yamlProperties")
public class YamlProperties {

    @Value("${elastic.index.suffix}")
    private String elasticIndexSuffix;

    /**
     * 获取Elasticsearch索引后缀
     * @return “” : wps信息收集
     */
    public String getElasticIndexSuffix() {
        if (StringUtils.isBlank(elasticIndexSuffix)){
            return "";
        } else if ("wps".equals(elasticIndexSuffix)){
            // wps信息收集默认不加后缀
            return "";
        } else {
            return elasticIndexSuffix;
        }
    }
}
