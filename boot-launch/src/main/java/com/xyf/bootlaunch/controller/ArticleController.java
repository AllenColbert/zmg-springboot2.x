package com.xyf.bootlaunch.controller;

import com.xyf.bootlaunch.model.AjaxResponse;
import com.xyf.bootlaunch.model.ArticleVO;
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
    //写增删改查4种RESTFul接口,能调用就行不用写具体方法内容，注意理解RESTFul风格接口的实际含义

    @Resource
    private ArticleRestService articleRestService;
    /**
     * 增加文章
     */
    @PostMapping("article")
    public AjaxResponse saveArticle(@RequestBody ArticleVO articleVO) {
        return AjaxResponse.success(articleRestService.saveArticle(articleVO));
    }

    /**
     *删除文章
     */
    @DeleteMapping("article/{id}")
    public AjaxResponse deleteArticle(@PathVariable Integer id) {
        articleRestService.deleteArticle(id);
        return AjaxResponse.success();
    }

    /**
     * 更新文章
     */
    @PutMapping("article/{id}")
    public AjaxResponse updateArticle(@PathVariable Integer id, @RequestBody ArticleVO articleVO) {
        articleVO.setId(id);
        articleRestService.updateArticle(articleVO);
        return AjaxResponse.success();
    }

    /**
     * 查询文章
     */
    @GetMapping("article/{id}")
    public AjaxResponse getArticle(@PathVariable Integer id) {
        return AjaxResponse.success(articleRestService.getArticle(id));
    }

    /**
     * 获取全部文章
     */
    @GetMapping("articles")
    public AjaxResponse getAllArticle(){
        return AjaxResponse.success(articleRestService.getAll());
    }

}
