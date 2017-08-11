package com.skydust.io;

import org.apache.commons.io.FileUtils;
import org.apache.commons.lang.StringUtils;
import org.apache.commons.lang.SystemUtils;

import java.io.File;
import java.io.IOException;
import java.util.Collection;
import java.util.List;

/**
 * Created by laoliangliang on 2017/6/15.
 */
public class FileReaderTest {
    public static void main(String[] args) throws IOException {
        String srcPath = SystemUtils.USER_DIR+"/apachetool/src/main/";
        System.out.println(srcPath);
        File srcFile = new File(srcPath);
        Collection<File> files = FileUtils.listFiles(srcFile,null,true);
        for (File file : files) {
            List<String> lines = FileUtils.readLines(file, "utf-8");
            for (String line : lines) {
                line = StringUtils.strip(line);
                if(StringUtils.startsWith(line,"//")){
                    System.out.println(line);
                }
            }
        }
    }
}
