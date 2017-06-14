package com.skydust.patchca;

import com.github.bingoohuang.patchca.Patchca;
import com.github.bingoohuang.patchca.service.Captcha;

import javax.imageio.ImageIO;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

/**
 * 生成验证码图片
 * Created by laoliangliang on 2017/6/14.
 */
public class PatchcaTest {
    public static void main(String[] args) throws IOException {
        Captcha next = Patchca.next();
        BufferedImage image = next.getImage();
        ImageIO.write(image,"jpg",new File("patchca.jpg"));
    }
}
