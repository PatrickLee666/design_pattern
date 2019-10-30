package com.company.structure.combination;

public class ImageFile extends File {

    public ImageFile(String name) {
        super(name);
    }

    @Override
    public void display() {
        System.out.println("这是图片文件，文件名="+getName());
    }
}
