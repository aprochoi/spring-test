package com.superym.spring_dev.service;

import com.superym.spring_dev.domain.Article;
import com.superym.spring_dev.dto.AddArticleRequest;
import com.superym.spring_dev.repository.BlogRepository;
import jakarta.transaction.Transactional;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@RequiredArgsConstructor
@Service
public class BlogService {

    private final BlogRepository blogRepository;

    public Article save(AddArticleRequest request) {
        return blogRepository.save(request.toEntity());
    }

    public List<Article> findAll() { return blogRepository.findAll(); }

}

