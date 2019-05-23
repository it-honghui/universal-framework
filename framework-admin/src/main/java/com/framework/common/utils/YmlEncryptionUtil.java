package com.framework.common.utils;

import org.jasypt.encryption.pbe.StandardPBEStringEncryptor;
import org.jasypt.encryption.pbe.config.EnvironmentPBEConfig;

public class YmlEncryptionUtil {
    /**
     * 加密串
     *
     * @param key 秘钥
     * @param str 要加密的字符串
     * @throws Exception
     */
    public static String encryption(String key, String str) throws Exception {
        StandardPBEStringEncryptor standardPBEStringEncryptor = new StandardPBEStringEncryptor();
        EnvironmentPBEConfig config = new EnvironmentPBEConfig();
        //加密算法
        config.setAlgorithm("PBEWithMD5AndDES");
        // 加密的密钥
        config.setPassword(key);
        standardPBEStringEncryptor.setConfig(config);
        //加密串
        String encryptedText = standardPBEStringEncryptor.encrypt(str);
        return encryptedText;
    }

    /**
     * 解密工具类
     *
     * @param encryptedStr 要解密的字符串
     * @param key          秘钥
     * @throws Exception
     */
    public static String Decrypt(String encryptedStr, String key) throws Exception {
        StandardPBEStringEncryptor standardPBEStringEncryptor = new StandardPBEStringEncryptor();
        EnvironmentPBEConfig config = new EnvironmentPBEConfig();
        //加密模式
        config.setAlgorithm("PBEWithMD5AndDES");
        //加密秘钥
        config.setPassword(key);
        standardPBEStringEncryptor.setConfig(config);
        //密文
        String str = standardPBEStringEncryptor.decrypt(encryptedStr);
        return str;
    }

    public static void main(String[] args) throws Exception {
        String encryptedStr = encryption("wanghonghui", "666666");
        System.out.println(encryptedStr);
        String str = Decrypt(encryptedStr, "wanghonghui");
        System.out.println(str);
    }
}