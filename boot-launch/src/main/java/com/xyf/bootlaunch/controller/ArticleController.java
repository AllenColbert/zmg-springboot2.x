package com.xyf.bootlaunch.controller;

import com.xyf.bootlaunch.model.AjaxResponse;
import com.xyf.bootlaunch.model.ArticleVO;
import com.xyf.bootlaunch.service.ArticleService;
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
    private ArticleService articleService;
    /**
     * 增加文章
     */
    @PostMapping("article")
    public AjaxResponse saveArticle(@RequestBody ArticleVO articleVO) {
        return AjaxResponse.success(articleService.save(articleVO));
    }

    /**
     *删除文章
     */
    @DeleteMapping("article/{id}")
    public AjaxResponse deleteArticle(@PathVariable Integer id) {
        articleService.delete(id);
        return AjaxResponse.success();
    }

    /**
     * 更新文章
     */
    @PutMapping("article/{id}")
    public AjaxResponse updateArticle(@PathVariable Integer id, @RequestBody ArticleVO articleVO) {
        return AjaxResponse.success(articleService.update(id,articleVO));
    }

    /**
     * 查询文章
     */
    @GetMapping("article/{id}")
    public AjaxResponse getArticle(@PathVariable Integer id) {

        return AjaxResponse.success(articleService.getOne(id));
    }

    /**
     * 查询全部
     */
    @GetMapping("articles")
    public AjaxResponse getAll(){
        return AjaxResponse.success(articleService.getAll());
    }
}
