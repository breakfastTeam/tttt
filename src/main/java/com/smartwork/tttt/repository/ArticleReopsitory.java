package com.smartwork.tttt.repository;

import com.smartwork.tttt.entity.Article;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ArticleReopsitory extends PagingAndSortingRepository<Article, Long> {
}
