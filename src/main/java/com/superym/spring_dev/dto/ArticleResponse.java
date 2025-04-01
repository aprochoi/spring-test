package com.superym.spring_dev.dto;

import com.superym.spring_dev.domain.Article;
import lombok.Getter;

@Getter
public class ArticleResponse {
    private final String title;
    private final  String content;

    public ArticleResponse(Article article) {
        this.title = article.getTitle();
        this.content = article.getContent();
    }
}
