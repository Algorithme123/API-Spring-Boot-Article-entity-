package com.mycompagny.springarticle.article.service;

import com.mycompagny.springarticle.article.entity.Article;
import com.mycompagny.springarticle.article.repository.ArticleRepository;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
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

    public ResponseEntity<Article> updateArticle(Article article, Long id){

        Article existingArticle = articleRepository.findById(id).orElse(null);
        existingArticle.setCode(article.getCode());
        existingArticle.setLibelle(article.getLibelle());
        existingArticle.setQte(article.getQte());
        existingArticle.setDescription(article.getDescription());

        this.articleRepository.save(existingArticle);
        return  ResponseEntity.ok().body(existingArticle);


    }

    // Methode pour supprimer Articles

public String deleteArticle(long id){
        this.articleRepository.deleteById(id);
        return "Article supprimer avec succes ";
}

// Methode pour recuperer une Seul article

    public Article findAtticleArticle(long id){
        return this.articleRepository.findAtticleArticle(id);
    }

}
