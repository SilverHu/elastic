package com.elastic.entity.es;


import org.springframework.data.elasticsearch.annotations.Document;

/**
 * 系统用户
 *
 * @author SilverHu
 */
@Document(indexName = "sys_user", replicas = 0)
public class EsSysUser {

    private Long id;// 用户id
    private String username;// 用户名
    private String name;// 用户姓名
    private String password;// 密码
    private String email;// 用户邮箱
    private Boolean status;// 保留字符 0-删除 1-存在

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPassword() {
        return password;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Boolean getStatus() {
        return status;
    }

    public void setStatus(Boolean status) {
        this.status = status;
    }

}
