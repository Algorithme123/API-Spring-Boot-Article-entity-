package com.mycompagny.springarticle.article.repository;

import com.mycompagny.springarticle.article.entity.Article;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ArticleRepository extends JpaRepository<Article, Long> {
}
