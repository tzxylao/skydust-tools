package com.skydust.io;

import com.google.common.io.Files;

import java.io.File;
import java.io.IOException;
import java.util.List;

import static com.google.common.base.Charsets.UTF_8;

/**
 * Created by laoliangliang on 2017/8/16.
 */
public class FileGuava {
    public static void main(String[] args) throws IOException {
        File file = new File(".");
        System.out.println(file.getAbsolutePath());
//        ByteSource byteSource = Files.asByteSource(new File("FileGuava.java"));
        //读取所有行
        List<String> stringList = Files.readLines(new File("pom.xml"), UTF_8);
        for (String s : stringList) {
            System.out.println(s);
        }
    }
}
