package com.kodilla.testing.forum;

public class ForumComment {
    private ForumPost forumPost;
    private String commentBody;
    private String author;

    public ForumComment(ForumPost forumPost, String commentBody, String author) {
        this.forumPost = forumPost;
        this.commentBody = commentBody;
        this.author = author;
    }

    public ForumPost getForumPost() {
        return this.forumPost;
    }

    public String getCommentBody() {
        return this.commentBody;
    }

    public String getAuthor() {
        return this.author;
    }

    public boolean equals(Object o) {
        if (this == o) {
            return true;
        } else if (!(o instanceof ForumComment)) {
            return false;
        } else {
            ForumComment that = (ForumComment)o;
            if (!this.forumPost.equals(that.forumPost)) {
                return false;
            } else {
                return !this.commentBody.equals(that.commentBody) ? false : this.author.equals(that.author);
            }
        }
    }

    public int hashCode() {
        int result = this.forumPost.hashCode();
        result = 31 * result + this.commentBody.hashCode();
        result = 31 * result + this.author.hashCode();
        return result;
    }
}