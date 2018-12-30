package com.kodilla.testing.forum;

import java.util.Objects;

public class ForumPost {
    String postBody;
    String author;

    public ForumPost(String postBody, String author) {
        this.postBody = postBody;
        this.author = author;
    }

    public String getPostBody() {
        return postBody;
    }

    public String getAuthor() {
        return author;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        ForumPost forumPost = (ForumPost) o;
        return postBody.equals(forumPost.postBody) &&
                author.equals(forumPost.author);
    }

    @Override
    public int hashCode() {
        return Objects.hash(postBody, author);
    }
}
