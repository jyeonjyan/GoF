package com.pattern.GoF.decorator._02_after;

public class Client {
    private final CommentService commentService;

    public Client(CommentService commentService) {
        this.commentService = commentService;
    }

    public void writeComment(String comment){
        commentService.addComment(comment);
    }
}
