package com.superym.spring_dev.repository;

import com.superym.spring_dev.domain.Article;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
@RequiredArgsConstructor
public class BlogRepositoryImpl implements BlogRepository {

    private final BlogJpaRepository jpa;

    @Override
    public Article save(Article article) {
        return jpa.save(article);
    }

    @Override
    public List<Article> findAll() {
        return jpa.findAll();
    }
}
