package com.smartwork.tttt.entity;

import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

/**
 * @author longkai.zlk
 * @email zhaolongkai3k@gmail.com
 * @createTime 2017/11/7
 */
@Data
@NoArgsConstructor
@Entity
public class Category {

    @Id
    @GeneratedValue
    private Long id;
    private String name;
    private String type;//视频、新闻
}
