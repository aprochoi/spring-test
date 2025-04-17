package com.superym.spring_dev.repository;

import com.superym.spring_dev.domain.Article;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

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

    @Override
    public void deleteAll() {
        jpa.deleteAll();
    }

    @Override
    public Optional<Article> findById(Long id) {
        return jpa.findById(id);
    }

    @Override
    public void delete(Long id) {
        jpa.deleteById(id);
    }
}
