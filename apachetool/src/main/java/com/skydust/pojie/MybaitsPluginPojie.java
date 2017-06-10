package com.skydust.pojie;

/**
 * Created by laoliangliang on 17/6/10.
 */

import javassist.*;

import java.io.IOException;


/**
 * Description:
 * http://www.tuicool.com/articles/6vEFb2u
 *
 * @author liuzhengyang
 * @version 1.0
 * @since 2016-09-16
 */
public class MybaitsPluginPojie {
    public static void main(String[] args) throws NotFoundException {
        ClassPool pool = ClassPool.getDefault();
        CtClass driverClass = pool.get("com.seventh7.mybatis.ref.license.ActivationDriver");
        CtClass javaUtil = pool.get("com.seventh7.mybatis.util.JavaUtils");
        CtMethod activate = driverClass.getMethod("activate", "(Ljava/lang/String;)Lcom/seventh7/mybatis/ref/license/ActivationResult;");
        CtMethod refValid = javaUtil.getDeclaredMethod("refValid");
        try {
            refValid.setBody("{return true;}");
        } catch (CannotCompileException e) {
            e.printStackTrace();
        }
        System.out.println(activate);
        try {
            activate.setBody("{com.seventh7.mybatis.ref.license.LicenseData licenseData = new com.seventh7.mybatis.ref.license.LicenseData(\"1\", \"2\");com.seventh7.mybatis.ref.license.ActivationResult res =com.seventh7.mybatis.ref.license.ActivationResult.success(licenseData); return res;}");
        } catch (CannotCompileException e) {
            e.printStackTrace();
        }
        try {
            driverClass.writeFile("hello");
            javaUtil.writeFile("hello");
        } catch (CannotCompileException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}