package com.superym.spring_dev.repository;

import com.superym.spring_dev.domain.Article;

import java.util.List;
import java.util.Optional;

public interface BlogRepository {
    Article save(Article article);
    List<Article> findAll();
    void deleteAll();
    Optional<Article> findById(Long id);
    void delete(Long id);
}
