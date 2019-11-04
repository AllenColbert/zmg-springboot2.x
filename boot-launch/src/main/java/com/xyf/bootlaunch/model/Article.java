package com.xyf.bootlaunch.model;

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
public class Article {

    private Long id;
    private String author;
    private String title;
    private String content;
    private Date createTime;
    private List<Reader> readers;
}
