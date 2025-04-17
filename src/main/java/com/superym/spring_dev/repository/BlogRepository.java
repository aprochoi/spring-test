package com.superym.spring_dev.repository;

import com.superym.spring_dev.domain.Article;

import java.util.List;

public interface BlogRepository {
    Article save(Article article);
    List<Article> findAll();
}
