package com.jojoldu.book.springboot.web.dto;

import com.jojoldu.book.springboot.domain.posts.Posts;
import lombok.Getter;

@Getter
public class PostsResponseDto {

    private Long id;
    private String title;
    private String author;
    private String content;

    public PostsResponseDto(Posts entity) {
        this.id         = entity.getId();
        this.title      = entity.getTitle();
        this.author     = entity.getAuthor();
        this.content    = entity.getContent();
    }
}
