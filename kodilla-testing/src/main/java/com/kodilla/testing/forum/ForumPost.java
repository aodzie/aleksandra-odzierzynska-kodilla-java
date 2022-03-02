package com.kodilla.testing.forum;

public class ForumPost {
    private String postBody;
    private String author;

    public ForumPost(String postBody, String author) {
        this.postBody = postBody;
        this.author = author;
    }

    public String getPostBody() {
        return this.postBody;
    }

    public String getAuthor() {
        return this.author;
    }

    public boolean equals(Object o) {
        if (this == o) {
            return true;
        } else if (o != null && this.getClass() == o.getClass()) {
            ForumPost forumPost = (ForumPost)o;
            return !this.postBody.equals(forumPost.postBody) ? false : this.author.equals(forumPost.author);
        } else {
            return false;
        }
    }

    public int hashCode() {
        int result = this.postBody.hashCode();
        result = 31 * result + this.author.hashCode();
        return result;
    }
}