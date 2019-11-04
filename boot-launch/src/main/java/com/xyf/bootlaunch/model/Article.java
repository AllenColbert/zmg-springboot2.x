package com.xyf.bootlaunch.model;

import com.fasterxml.jackson.annotation.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;
import java.util.List;

/**
 * @author : xuyunfeng
 * @date :   2019/10/28 10:18
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
//@JsonPropertyOrder(value = {"title","author"})    改变json子属性的默认定义的顺序
@JsonPropertyOrder(value = {"title","author"})
public class Article {

    //@JsonIgnore 排除属性不做序列化与反序列化
    @JsonIgnore
    private Long id;
    //@JsonProperty 为属性换一个名
    @JsonProperty("auther")
    private String author;
    private String title;
    private String content;

    //@JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss", timezone = "GMT+8") 指定属性日期格式（也可以指定其他属性格式？）
    //一般会在yml中配置全局的日期格式
    @JsonFormat
    //@JsonInclude(JsonInclude.Include.NON_NULL) 排除为空的元素不做序列化反序列化
    @JsonInclude(JsonInclude.Include.NON_NULL)
    private Date createTime;
    private List<Reader> reader;
}
