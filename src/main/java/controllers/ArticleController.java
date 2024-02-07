package controllers;

import models.Article;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.Arrays;
import java.util.List;

@Controller
@RequestMapping("/api/v1/article")
public class ArticleController {

    @GetMapping
    public List<Article> getAllArticles() {
    }
}
