package com.mycompagny.springarticle.article.service;

import com.mycompagny.springarticle.article.entity.Article;
import com.mycompagny.springarticle.article.repository.ArticleRepository;

import java.util.List;

public class ArticleService {



    private ArticleRepository articleRepository;

//    Methode d'ajout d'un article

    public Article AddArticle(Article article){
        this.articleRepository.save(article);
        return  article;
    }


    //methode de reperatiion des Articles

    public List <Article> getAllArticles(){
        return  (List<Article>)articleRepository.findAll();
    }

//    methode de modification d'un article


}
