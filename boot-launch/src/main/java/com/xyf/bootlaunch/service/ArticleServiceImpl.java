package com.xyf.bootlaunch.service;

import com.xyf.bootlaunch.model.ArticleVO;
import com.xyf.bootlaunch.utils.DozerUtils;
import com.xyf.bootlaunch.generator.Article;
import com.xyf.bootlaunch.generator.ArticleDao;
import org.dozer.Mapper;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * @author : xuyunfeng
 * @date :   2019/11/5 9:55
 */
@Service
public class ArticleServiceImpl  implements ArticleService{
    @Resource
    private ArticleDao articleDao;

    @Resource
    private Mapper dozerMapper;


    @Override
    public Integer save(ArticleVO articleVO) {
        return articleDao.insert(dozerMapper.map(articleVO, Article.class));
    }

    @Override
    public void delete(Integer id) {
        articleDao.deleteByPrimaryKey(id);
    }

    @Override
    public Integer update(Integer id, ArticleVO articleVO) {
        Article article = dozerMapper.map(articleVO, Article.class);
        article.setId(id);
        return articleDao.updateByPrimaryKey(article);
    }

    @Override
    public ArticleVO getOne(Integer id) {
        Article article = articleDao.selectByPrimaryKey(id);
        return dozerMapper.map(article,ArticleVO.class);
    }

    @Override
    public List<ArticleVO> getAll() {
        List<Article> articles = articleDao.selectByExample(null);
        return DozerUtils.mapList(articles,ArticleVO.class);
    }
}
