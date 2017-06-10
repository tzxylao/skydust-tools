package com.skydust.util;

import java.io.IOException;
import java.io.InputStreamReader;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLConnection;

/**
 * Created by laoliangliang on 17/6/3.
 */
public class UrlUtils {

    public static String loadJson(String url) {
        StringBuilder json = new StringBuilder();
        try {
            URL urlObject = new URL(url);
            URLConnection uc = urlObject.openConnection();
            InputStreamReader isr = new InputStreamReader(uc.getInputStream());
//            BufferedReader in = new BufferedReader(new InputStreamReader(uc.getInputStream()));
//            String inputLine = null;
//            while ( (inputLine = in.readLine()) != null) {
//                json.append(inputLine);
//            }
            char[] buffer = new char[1024];
            int len = 0;
            while ((len = isr.read(buffer)) != -1) {
                json.append(buffer, 0, len);
            }
//            System.out.println(json.toString());
            isr.close();
        } catch (MalformedURLException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
        return json.toString();
    }

    public static void main(String[] args) {
        System.out.println(UrlUtils.class.getClassLoader().getResource(".").getPath());
        System.out.println(UrlUtils.class.getClassLoader().getResource("config.properties").getPath());
    }
}
