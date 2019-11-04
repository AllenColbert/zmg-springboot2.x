package com.xyf.bootlaunch.controller;

import com.xyf.bootlaunch.model.AjaxResponse;
import com.xyf.bootlaunch.model.Article;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.*;

import java.util.Date;

/**
 * 对文章进行增删改查的RESTFul风格的接口
 * 文章作为被操作的资源对象
 *
 * @author : xuyunfeng
 * @date :   2019/10/28 10:22
 */
@Slf4j
@RestController
@RequestMapping("rest")
public class ArticleController {
    //写增删改查4种RESTFul接口,能调用就行不用写具体方法内容，注意理解RESTFul风格接口的实际含义

    /**
     * 增加文章
     */
    @PostMapping("article")
    public AjaxResponse saveArticle(@RequestBody Article article) {
        article.setCreateTime(new Date());
        log.info("成功保存书籍:{}", article);
        return AjaxResponse.success();
    }

    /**
     *删除文章
     */
    @DeleteMapping("article/{id}")
    public AjaxResponse deleteArticle(@PathVariable Long id) {
        log.info("要删除的文章id：{}", id);
        return AjaxResponse.success();
    }

    /**
     * 更新文章
     */
    @PutMapping("article/{id}")
    public AjaxResponse updateArticle(@PathVariable Long id, @RequestBody Article article) {
        article.setId(id);
        log.info("要修改的文章：{}", article);
        return AjaxResponse.success();
    }

    /**
     * 查询文章
     */
    @GetMapping("article/{id}")
    public AjaxResponse getArticle(@PathVariable Long id) {
        log.info("查询文章id：{}", id);
        return AjaxResponse.success();
    }

}
