package com.xyf.bootlaunch.service;

import com.xyf.bootlaunch.dao.ArticleJDBCDAO;
import com.xyf.bootlaunch.model.Article;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.Resource;
import java.util.List;

/**
 * @author xuyunfeng
 */
@Slf4j
@Service
public class ArticleRestJDBCServiceImpl implements ArticleRestService{

    @Resource
    ArticleJDBCDAO articleJDBCDAO;


    @Transactional
    @Override
    public Article saveArticle(Article article) {

        articleJDBCDAO.save(article);

        return  article;
    }

    @Override
    public void deleteArticle(Integer id) {
        articleJDBCDAO.deleteById(id);
    }

    @Override
    public void updateArticle(Article article,Integer id) {
        articleJDBCDAO.updateById(article,id);
    }

    @Override
    public Article getArticle(Integer id) {
        Article article = articleJDBCDAO.findById(id);
        if (article!= null) {
            return articleJDBCDAO.findById(id);
        }
        return null;
    }

    @Override
    public List<Article> getAll() {
        return articleJDBCDAO.findAll();
    }
}
