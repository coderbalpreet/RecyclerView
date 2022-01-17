package com.example.android.recylerview;

public class modelClass {
    private int cardView;
    private String nameView,messageView,timeView;

    modelClass(int cardView ,String nameView,String messageView,String timeView){

        this.cardView=cardView;
        this.nameView=nameView;
        this.messageView=messageView;
        this.timeView=timeView;

    }









    public int getCardView() {
        return cardView;
    }

    public String getNameView() {
        return nameView;
    }

    public String getMessageView() {
        return messageView;
    }

    public String getTimeView() {
        return timeView;
    }
}
