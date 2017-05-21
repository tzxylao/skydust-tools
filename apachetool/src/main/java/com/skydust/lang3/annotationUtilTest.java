package com.skydust.lang3;

import org.apache.commons.lang3.AnnotationUtils;

/**
 * Created by laoliangliang on 17/5/21.
 */
public class annotationUtilTest {
    public static void main(String[] args) {
        boolean validAnnotationMemberType = AnnotationUtils.isValidAnnotationMemberType(String.class);
        System.out.println(validAnnotationMemberType);
    }
}
