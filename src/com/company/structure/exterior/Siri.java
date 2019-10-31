package com.company.structure.exterior;

/**
 * 假设
 *
 * 电脑上有qq音乐，爱奇艺，chrome浏览器。这些都属于子系统类
 * 电脑上有siri，我们可以直接用siri帮我们打开想要的子系统
 */
public class Siri {
    private MusicQQ musicQQ;
    private AiQiYi aiQiYi;
    private Chrome chrome;

    public Siri() {
        this(new MusicQQ(), new AiQiYi(), new Chrome());
    }

    public Siri(MusicQQ musicQQ, AiQiYi aiQiYi, Chrome chrome) {
        this.musicQQ = musicQQ;
        this.aiQiYi = aiQiYi;
        this.chrome = chrome;
    }

    public void on(String message){
        if (message == null){
            System.out.println("对不起，我没听懂你在说什么");
            return;
        }
        boolean check = false;
        if (message.contains("qq音乐")){
            musicQQ.on();
            check = true;
        }
        if (message.contains("爱奇艺")){
            aiQiYi.on();
            check = true;
        }
        if (message.contains("chrome")){
            chrome.on();
            check = true;
        }
        if (!check)
            System.out.println("对不起，我没听懂你在说什么");
    }

    public void close(String message){
        if (message == null){
            System.out.println("对不起，我没听懂你在说什么");
            return;
        }
        boolean check = false;
        if (message.contains("qq音乐")){
            musicQQ.off();
            check = true;
        }
        if (message.contains("爱奇艺")){
            aiQiYi.off();
            check = true;
        }
        if (message.contains("chrome")){
            chrome.off();
            check = true;
        }
        if (!check)
            System.out.println("对不起，我没听懂你在说什么");
    }

}

class MusicQQ{
    public void on(){
        System.out.println("打开qq音乐");
    }

    public void off(){
        System.out.println("关闭qq音乐");
    }
}

class AiQiYi{
    public void on(){
        System.out.println("打开爱奇艺");
    }

    public void off(){
        System.out.println("关闭爱奇艺");
    }
}

class Chrome{
    public void on(){
        System.out.println("打开Chrome");
    }

    public void off(){
        System.out.println("关闭Chrome");
    }
}
