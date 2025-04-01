package com.superym.spring_dev.repository;

import com.superym.spring_dev.domain.Article;
import org.springframework.data.jpa.repository.JpaRepository;

public interface BlogRepository extends JpaRepository<Article, Long> {
}
