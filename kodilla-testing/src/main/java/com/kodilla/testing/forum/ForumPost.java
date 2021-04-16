package com.kodilla.testing.forum;

public class ForumPost {

    private ForumPost forumPost;
    private String commentBody;
    private String author;

    public ForumPost(ForumPost forumPost, String commentBody, String author) {
        this.forumPost = forumPost;
        this.commentBody = commentBody;
        this.author = author;
    }

    public ForumPost() {
        String author = this.author;
        String postBody = this.commentBody;

    }

    public ForumPost getForumPost() {
        return forumPost;
    }

    public String getCommentBody() {
        return commentBody;
    }

    public String getAuthor() {
        return author;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof ForumPost)) return false;

        ForumPost that = (ForumPost) o;

        if (!forumPost.equals(that.forumPost)) return false;
        if (!commentBody.equals(that.commentBody)) return false;
        return author.equals(that.author);
    }

    @Override
    public int hashCode() {
        int result = forumPost.hashCode();
        result = 31 * result + commentBody.hashCode();
        result = 31 * result + author.hashCode();
        return result;
    }

    public String getPostBody() {
        return null;
    }
}