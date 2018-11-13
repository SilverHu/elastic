package com.elastic.entity.es;

import lombok.Data;
import org.springframework.data.annotation.Id;
import org.springframework.data.elasticsearch.annotations.Document;
import org.springframework.data.elasticsearch.annotations.Field;
import org.springframework.data.elasticsearch.annotations.FieldType;

import java.util.Date;

/**
 * @author huchuanyin
 * @date 2018/11/12 10:30
 */
@Data
@Document(indexName = "sys_log_#{yamlProperties.getElasticIndexSuffix()}", type = "EsSysLog", replicas = 0)
public class EsSysLog {

    @Id
    @Field(type = FieldType.Keyword)
    private String id;

    @Field(type = FieldType.Date)
    private Date recordTime;

    @Field(type = FieldType.Keyword)
    private String userName;

    @Field(type = FieldType.Ip)
    private String ip;

    @Field(type = FieldType.Keyword)
    private String operateContent;

    @Field(type = FieldType.Keyword)
    private String uri;

    /**
     * 0：失败 1：成功
     */
    @Field(type = FieldType.Integer)
    private Integer result;

    @Field(type = FieldType.Keyword)
    private String reason;
}
