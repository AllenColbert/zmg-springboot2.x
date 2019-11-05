package com.xyf.bootlaunch.service;

import com.xyf.bootlaunch.model.ArticleVO;

import java.util.List;

/**
 * @author : xuyunfeng
 * @date :   2019/11/5 9:51
 */
public interface ArticleService {
    Integer save(ArticleVO articleVO);

    void delete(Integer id);

    Integer update(Integer id, ArticleVO articleVO);

    ArticleVO getOne(Integer id);

    List<ArticleVO> getAll();
}
