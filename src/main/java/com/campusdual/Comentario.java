package com.campusdual;

import java.util.Date;

public class Comment {
    private String text;
    private Date date;
    private Usuario owner;

    public Comment(String text, Usuario owner) {
        this.text = text;
        this.date = new Date();
        this.owner = owner;
    }

    @Override
    public String toString() {
        return "Comment{" +
                "text='" + text + '\'' +
                ", date=" + date +
                ", owner=" + owner.getName() +
                '}';
    }
}
