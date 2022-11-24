package com.mycompagny.springarticle.article.controller;

import com.mycompagny.springarticle.article.entity.Article;
import com.mycompagny.springarticle.article.service.ArticleService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

public class ArticleController {


    private ArticleService articleService;

    @RequestMapping(value = "/article/all",method = RequestMethod.GET)
    public List<Article> getAllArticles(){
        return articleService.getAllArticles();
    }

    @RequestMapping(value = "/article/{id}", method = RequestMethod.GET)
    public  Article getOneArticle(@PathVariable long id){
        return  articleService.findAtticleArticle(id);

    }

    @RequestMapping(value = "/article/add",method = RequestMethod.POST)
    public  Article addArticle(@RequestBody Article article){

        return  articleService.AddArticle(article);
    }

//    @RequestMapping(value = "/article/update/{id}",method = RequestMethod.PUT)
//    public Article updateArticle(@PathVariable long id)
//    {
//
//    }

    @RequestMapping(value = "/article/delete/{id}", method = RequestMethod.DELETE)
    public String deleteArticle(@PathVariable int id){
        return  articleService.deleteArticle(id);
    }




}
