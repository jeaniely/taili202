package com.neuedu.api.object0731.entry;

public class Card {
    private String suid;//花色
    private String face;//面值

    public Card(){}

    public Card(String suid, String face) {
        this.suid = suid;
        this.face = face;
    }

    public String getSuid() {
        return suid;
    }

    public void setSuid(String suid) {
        this.suid = suid;
    }

    public String getFace() {
        return face;
    }

    public void setFace(String face) {
        this.face = face;
    }

    @Override
    public String toString() {
        return  suid + face;
    }
}
