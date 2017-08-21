package com.likun.entity.vo;

import com.likun.entity.Author;
import com.likun.entity.Post;

import java.util.List;

/**
 * Created by likun(li.k@ikcrm.com) on 2017/8/21.
 */
public class BlogVO {
    private Integer id;

    private String title;

    private Integer author_id;

    private Author author;

    private List<Post> posts;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title == null ? null : title.trim();
    }

    public Integer getAuthor_id() {
        return author_id;
    }

    public void setAuthor_id(Integer author_id) {
        this.author_id = author_id;
    }

    public Author getAuthor() {
        return author;
    }

    public void setAuthor(Author author) {
        this.author = author;
    }

    public List<Post> getPosts() {
        return posts;
    }

    public void setPosts(List<Post> posts) {
        this.posts = posts;
    }
}
