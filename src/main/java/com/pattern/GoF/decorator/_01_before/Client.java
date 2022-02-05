package com.pattern.GoF.decorator._01_before;

public class Client {
    private final CommentService commentService;

    public Client(CommentService commentService) {
        this.commentService = commentService;
    }

    public void writeComment(String comment){
        commentService.addComment(comment);
    }

    public static void main(String[] args) {
        Client basicClient = new Client(new CommentService());

        basicClient.writeComment("hello world");
        basicClient.writeComment("loading...");
        basicClient.writeComment("copyright: https://toss.me/jyeonjyan");

        System.out.println("==========================");

        Client trimClient = new Client(new TrimCommentService());

        trimClient.writeComment("hello world");
        trimClient.writeComment("loading...");
        trimClient.writeComment("copyright: https://toss.me/jyeonjyan");

        System.out.println("==========================");

        Client deleteAdClient = new Client(new DeleteAdCommentService());

        deleteAdClient.writeComment("hello world");
        deleteAdClient.writeComment("loading...");
        deleteAdClient.writeComment("copyright: https://toss.me/jyeonjyan");
    }
}
