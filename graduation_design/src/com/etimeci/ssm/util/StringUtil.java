package com.etimeci.ssm.util;


public class StringUtil {

    public static boolean isNotEmpty(String data) {

        if (data==null || "".equals(data) ) {
            return false;
        }
        return true;
    }

    public static String selectSpecialCharacterToJava (String data) {

        if (StringUtil.isNotEmpty(data)) {
           data = data.replace("\\\\", "\\");
           data = data.replace("\\%", "%");
           data = data.replace("\\!", "!");
           data = data.replace("\\$", "$");
           data = data.replace("\\/", "/");
           data = data.replace("\\+", "+");
           data = data.replace("\\ ", " ");
           data = data.replace("\\*", "*");
           data = data.replace("\\^", "^");
        }

        return data;
    }

    public static String selectSpecialCharacterToDatabase (String data) {

        if (StringUtil.isNotEmpty(data)) {

           data = data.replace("\\", "\\\\");
           data = data.replace("%", "\\%");
           data = data.replace("!", "\\!");
           data = data.replace("$", "\\$");
           data = data.replace("/", "\\/");
           data = data.replace("+", "\\+");
           data = data.replace(" ", "\\ ");
           data = data.replace("*", "\\*");
           data = data.replace("^", "\\^");
        }

        return data;
    }
}