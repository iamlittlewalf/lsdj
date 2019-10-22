package com.lsdj.lushan.utils;

import org.apache.commons.codec.digest.DigestUtils;

public class PasswordEncryption {

    public static String md5(String text){
        //a7ddb9e347bb2b816e3529f493954bec:统一密钥
       return DigestUtils.md5Hex(text + "a7ddb9e347bb2b816e3529f493954bec");
    }

}
