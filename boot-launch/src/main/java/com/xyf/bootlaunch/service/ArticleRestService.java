package com.xyf.bootlaunch.service;

import com.xyf.bootlaunch.model.ArticleVO;

import java.util.List;

/**
 * @author : xuyunfeng
 * @date :   2019/10/29 16:50
 */
public interface ArticleRestService {
    ArticleVO saveArticle(ArticleVO article);

    void deleteArticle(Integer id);

    void updateArticle(ArticleVO article);

    ArticleVO getArticle(Integer id);

    List<ArticleVO> getAll();
}
