package com.pattern.GoF.decorator._01_before;

public class DeleteAdCommentService extends CommentService{
    @Override
    public void addComment(String comment) {
        super.addComment(deleteAd(comment));
    }

    private String deleteAd(String comment) {
        if (adExist(comment)){
            comment = null;
        }

        return comment;
    }

    private boolean adExist(String comment){
        return comment.contains("http");
    }
}
