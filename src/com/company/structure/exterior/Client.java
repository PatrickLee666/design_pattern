package com.company.structure.exterior;

public class Client {
    public static void main(String args[]){
        Siri siri = new Siri();

        siri.on("siri，请帮我打开qq音乐和爱奇艺");
        siri.close("siri，关一下qq音乐");

    }
}
