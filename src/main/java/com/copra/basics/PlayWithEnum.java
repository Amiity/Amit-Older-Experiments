package com.copra.basics;

public enum PlayWithEnum {
    CRICKET(1, "BAT"), FOOTBALL(2, "Ball"), BASKETBALL(3, "Ball"), VOLLEYBALL(4, "Ball");

    public int code;
    public String type;

    PlayWithEnum(int i, String type) {
        code = i;
        this.type = type;
    }

    int returnCode(){
        return code;
    }

    String returnString(){
        return type;
    }

    public static void main(String[] args) {
        PlayWithEnum enu = PlayWithEnum.BASKETBALL;
        PlayWithEnum anEnum = PlayWithEnum.valueOf("CRICKET");
        System.out.println(enu.returnCode());
        System.out.println(enu.returnString());
        System.out.println(PlayWithEnum.FOOTBALL.toString());
        System.out.println(anEnum);
    }
}


