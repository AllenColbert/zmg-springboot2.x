package com.xyf.bootlaunch.service;


import com.xyf.bootlaunch.model.Article;

import java.util.List;

public interface ArticleRestService {

    Article saveArticle(Article article);

    void deleteArticle(Integer id);

    void updateArticle(Article article, Integer id);

    Article getArticle(Integer id);

    List<Article> getAll();
}

