package com.example.demo.io;

import cn.hutool.core.io.file.FileReader;

import java.util.List;

public class FileReaderDemo {
    public static void main(String[] args) {
        FileReader fileReader = new FileReader("E:\\test\\douyin_user_ids.txt");
        String s = fileReader.readString();
        List<String> strings = fileReader.readLines();
        strings.stream().forEach(System.out::println);
//        System.out.println(s);
    }
}
