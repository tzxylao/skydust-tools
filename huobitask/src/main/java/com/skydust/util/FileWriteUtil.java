package com.skydust.util;

import java.io.*;

/**
 * Created by laoliangliang on 17/6/4.
 */
public class FileWriteUtil {

    public static String path = "./logs/priceRecord.txt";

    public static void writePrice(Double price) throws IOException {

        File file = new File(path);
        if (!file.exists())
            file.createNewFile();
        FileWriter fileWritter = new FileWriter(file, false);
        BufferedWriter bufferWritter = new BufferedWriter(fileWritter);
        bufferWritter.write("price=" + price);
        bufferWritter.flush();
        bufferWritter.close();
    }

    public static String readPrice() throws IOException {
        FileReader reader = new FileReader(path);
        BufferedReader br = new BufferedReader(reader);
        StringBuffer sb = new StringBuffer();
        String str = null;

        while ((str = br.readLine()) != null) {
            sb.append(str);
        }
        br.close();
        reader.close();
        return sb.toString();
    }

    public static void main(String[] args) throws IOException {
        writePrice(223.0);
        System.out.println(readPrice());
    }
}
