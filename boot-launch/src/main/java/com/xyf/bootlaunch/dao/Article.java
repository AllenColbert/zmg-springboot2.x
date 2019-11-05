package com.xyf.bootlaunch.dao;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.Date;

/**
 * @author : xuyunfeng
 * @date :   2019/11/5 9:19
 */
@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
@Table(name = "article")
public class Article {

    @Id
    @GeneratedValue
    private Integer id;

    @Column(nullable = false,length = 32)
    private String author;

    @Column(nullable = false,length = 128,unique = true)
    private String title;

    @Column(length = 512)
    private String content;

    private Date createTime;

}
