package com.xyf.bootlaunch.model;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonInclude;
import lombok.AllArgsConstructor;
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
public class ArticleVO {

    private Integer id;
    private String author;
    private String title;
    private String content;
    @JsonFormat
    @JsonInclude(JsonInclude.Include.NON_NULL)
    private Date createTime;
    private List<Reader> reader;
}
