package com.xyf.bootlaunch.service;


import com.xyf.bootlaunch.dao.Article;
import com.xyf.bootlaunch.dao.ArticleRepository;
import com.xyf.bootlaunch.model.ArticleVO;
import com.xyf.bootlaunch.utils.DozerUtils;
import org.dozer.Mapper;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * @author : xuyunfeng
 * @date :   2019/10/29 16:51
 */
@Service
public class ArticleRestJPAServiceImpl implements ArticleRestService {

    @Resource
    private ArticleRepository articleRepository;

    @Resource
    private Mapper dozerMapper;

    @Override
    public ArticleVO  saveArticle(ArticleVO articleVO) {
        Article article = articleRepository.save(dozerMapper.map(articleVO, Article.class));
        return dozerMapper.map(article,ArticleVO.class);
    }

    @Override
    public void deleteArticle(Integer id) {
        articleRepository.deleteById(id);
    }

    @Override
    public void updateArticle(ArticleVO article) {
        articleRepository.save(dozerMapper.map(article, Article.class));
    }

    @Override
    public ArticleVO getArticle(Integer id) {
        Article article = articleRepository.getOne(id);
        return dozerMapper.map(article,ArticleVO.class);
    }


    @Override
    public List<ArticleVO> getAll() {
        List<Article> articleLis = articleRepository.findAll();
        return DozerUtils.mapList(articleLis,ArticleVO.class);
    }
}
