package com.xyf.bootlaunch.controller;

import com.xyf.bootlaunch.model.AjaxResponse;
import com.xyf.bootlaunch.model.Article;
import com.xyf.bootlaunch.service.ArticleRestService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;

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

    @Resource
    private ArticleRestService restService;
    /**
     * 增加文章
     */
    @PostMapping("article")
    public AjaxResponse saveArticle(@RequestBody Article article) {
        return AjaxResponse.success(restService.saveArticle(article));
    }

    /**
     *删除文章
     */
    @DeleteMapping("article/{id}")
    public AjaxResponse deleteArticle(@PathVariable Integer id) {
        restService.deleteArticle(id);
        return AjaxResponse.success();
    }

    /**
     * 更新文章
     */
    @PutMapping("article/{id}")
    public AjaxResponse updateArticle(@PathVariable Integer id, @RequestBody Article article) {
        article.setId(id);
        restService.updateArticle(article,id);
        return AjaxResponse.success();
    }

    /**
     * 查询文章
     */
    @GetMapping("article/{id}")
    public AjaxResponse getArticle(@PathVariable Integer id) {

        return AjaxResponse.success(restService.getArticle(id));
    }

    /**
     * 查询全部的文章
     */
    @GetMapping("articles")
    public AjaxResponse getArticles(){
        return AjaxResponse.success(restService.getAll());
    }

}
