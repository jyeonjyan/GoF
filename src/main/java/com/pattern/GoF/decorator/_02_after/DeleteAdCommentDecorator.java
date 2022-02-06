package com.pattern.GoF.decorator._02_after;

public class DeleteAdCommentDecorator extends CommentDecorator{

    public DeleteAdCommentDecorator(CommentService commentService) {
        super(commentService);
    }

    @Override
    public void addComment(String comment) {
        if (!existAd(comment)){
            super.addComment(comment);
        }
    }

    private boolean existAd(String comment) {
        return comment.contains("http") || comment.contains("https");
    }
}
