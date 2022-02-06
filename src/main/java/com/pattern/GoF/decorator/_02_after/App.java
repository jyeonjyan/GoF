package com.pattern.GoF.decorator._02_after;

public class App {
    private static final boolean isEnabledAdBlock = true;
    private static final boolean isEnabledTrimming = true;

    public static void main(String[] args) {
        CommentService commentService = new DefaultCommentService();

        if (isEnabledAdBlock){
            commentService = new DeleteAdCommentDecorator(commentService);
        }

        if (isEnabledTrimming){
            commentService = new TrimCommentDecorator(commentService);
        }

        Client client = new Client(commentService);
        client.writeComment("jyeonjyan's tech blog");
        client.writeComment("this is jyeonjyan's tech story... ..."); // if trimming == true, original != print
        client.writeComment("https://jyeonjyan.github.io/"); // if AdBlock == true, original != print

    }
}
