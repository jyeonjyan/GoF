package com.pattern.GoF.decorator._02_after;

public class TrimCommentDecorator extends CommentDecorator{

    public TrimCommentDecorator(CommentService commentService) {
        super(commentService);
    }

    @Override
    public void addComment(String comment) {
        super.addComment(trim(comment));
    }

    private String trim(String comment) {
        return comment.replace("...", "");
    }

}
