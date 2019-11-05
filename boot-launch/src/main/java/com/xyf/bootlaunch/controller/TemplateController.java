package com.xyf.bootlaunch.controller;

import com.xyf.bootlaunch.model.ArticleVO;
import com.xyf.bootlaunch.service.ArticleService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.annotation.Resource;
import java.util.List;

@Controller
@RequestMapping("template")
public class TemplateController {

    @Resource
    ArticleService articleService;

    @GetMapping("freemarker")
    public String index(Model model) {

        List<ArticleVO> articles = articleService.getAll();

        model.addAttribute("articles", articles);

        //模版名称，实际的目录为：resources/templates/fremarkertemp.html
        return "fremarkertemp";
    }
}
