package com.xyf.bootlaunch.mybatis;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.xyf.bootlaunch.generator.Article;
import com.xyf.bootlaunch.generator.ArticleDao;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import javax.annotation.Resource;
import java.util.List;

/**
 * @author : xuyunfeng
 * @date :   2019/11/5 13:15
 */
@RunWith(SpringRunner.class)
@SpringBootTest
public class MybatisTest {
    @Resource
    ArticleDao articleDao;

    @Test
    public void testPageHelper(){
        // 只有紧跟在PageHelper.startPage方法后的第一个Mybatis的查询（Select）方法会被分页!!!!
        PageHelper.startPage(1, 2);
        List<Article> articles = articleDao.selectByExample(null);
        PageInfo<Article> page = PageInfo.of(articles);
        System.out.println(page);
    }
}
