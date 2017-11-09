package com.smartwork.tttt.entity;

import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.jpa.convert.threeten.Jsr310JpaConverters;

import javax.persistence.Convert;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import java.time.LocalDateTime;

/**
 * @author longkai.zlk
 * @email zhaolongkai3k@gamil.com
 * @createTime 2017/11/7
 */
@Data
@NoArgsConstructor
@Entity
public class Article {

    @Id
    @GeneratedValue
    private Long id;
    private Long categoryId;
    private String author;
    private String title;
    private String content;
    /**
     * 缩略图
     */
    private String thumbs;
    private String url;
    private String tags;
    /**
     * 外部id标识
     */
    private String unionId;
    @Convert(converter = Jsr310JpaConverters.LocalDateTimeConverter.class)
    private LocalDateTime created;
}
