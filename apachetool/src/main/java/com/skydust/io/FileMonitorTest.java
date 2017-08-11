package com.skydust.io;

import org.apache.commons.io.FileUtils;
import org.apache.commons.io.filefilter.IOFileFilter;
import org.apache.commons.io.monitor.FileAlterationListener;
import org.apache.commons.io.monitor.FileAlterationMonitor;
import org.apache.commons.io.monitor.FileAlterationObserver;
import org.apache.commons.io.monitor.FileEntry;
import org.apache.commons.lang.StringUtils;

import java.io.File;
import java.io.IOException;
import java.util.Iterator;
import java.util.List;

/**
 * FileUtils 对文件进行各种操作
 * 在target/classes下创建文件，会去target/classes/com/skydust下寻找同名文件并替换
 * Created by laoliangliang on 2017/6/13.
 */
public class FileMonitorTest {
    public static void main(String[] args) throws IOException {
        File tempDirectory = FileUtils.getTempDirectory();
        System.out.println(FileUtils.getUserDirectoryPath());
        System.out.println(tempDirectory.getAbsolutePath());
        final String path = FileMonitorTest.class.getClass().getResource("/").getPath();
        System.out.println(path);
        final File parentFile = FileUtils.getFile(path);
        final File aimFile = FileUtils.getFile(path+"/com/skydust/");
        System.out.println(aimFile.getAbsolutePath());
        File srcFile = FileUtils.getFile(path + "log4j.properties");
        System.out.println(srcFile.getAbsolutePath());
        List<String> strings = FileUtils.readLines(srcFile, "utf-8");
        for (String s : strings) {
            System.out.println(s);
        }
        System.out.println(StringUtils.center("-", 100,"-"));
        System.out.println(FileUtils.readFileToString(srcFile, "utf-8"));
        System.out.println(StringUtils.center("-", 100,"-"));
        FileEntry fileEntry = new FileEntry(srcFile);
        //1、监听文件各种改变，包括创建、删除、改变等待
        FileAlterationObserver observer = new FileAlterationObserver(parentFile);
        observer.addListener(new FileAlterationListener() {
            @Override
            public void onStart(FileAlterationObserver observer) {

            }

            @Override
            public void onDirectoryCreate(File directory) {

            }

            @Override
            public void onDirectoryChange(File directory) {

            }

            @Override
            public void onDirectoryDelete(File directory) {

            }

            @Override
            public void onFileCreate(final File cfile) {
                Iterator<File> fileIterator = FileUtils.iterateFilesAndDirs(aimFile, new IOFileFilter() {
                    @Override
                    public boolean accept(File file) {
                        if (file.getName().equals(cfile.getName())) {
                            try {
                                FileUtils.copyFile(cfile, file);
                                cfile.delete();
                            } catch (IOException e) {
                                e.printStackTrace();
                            }
                            return true;
                        }
                        return false;
                    }

                    @Override
                    public boolean accept(File dir, String name) {
                        System.out.println(dir.getAbsolutePath());
                        System.out.println(name);
                        return false;
                    }
                }, new IOFileFilter() {
                    @Override
                    public boolean accept(File file) {
                        return true;
                    }

                    @Override
                    public boolean accept(File dir, String name) {
                        return false;
                    }
                });
                while (fileIterator.hasNext()) {
                    File next = fileIterator.next();
                    if(next.isFile()){
                        System.out.println(next.getName());
                    }
                }
            }

            /**
             * 监控文件改变
             * @param file
             */
            @Override
            public void onFileChange(File file) {
                System.out.println("change");
            }

            @Override
            public void onFileDelete(File file) {

            }

            @Override
            public void onStop(FileAlterationObserver observer) {

            }
        });
        FileAlterationMonitor monitor = new FileAlterationMonitor(500,observer);
        try {
            monitor.start();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
