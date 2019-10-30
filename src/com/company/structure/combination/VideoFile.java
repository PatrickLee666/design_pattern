package com.company.structure.combination;

public class VideoFile extends File {
    public VideoFile(String name) {
        super(name);
    }

    @Override
    public void display() {
        System.out.println("视频文件，文件名="+getName());
    }
}
