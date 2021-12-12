package com.plaxz;

import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

/*
Powered by FinalShell-Keygen v1.0 - Developed by UltraPanda
Only for educational purpose
*/

public class FinalShellHash {
    public static String transform(String str) throws NoSuchAlgorithmException {
        return hashMD5(str).substring(8, 24);
    }

    public static String hashMD5(String str) throws NoSuchAlgorithmException {
        MessageDigest digest = MessageDigest.getInstance("MD5");
        byte[] hashed = digest.digest(str.getBytes());
        StringBuilder sb = new StringBuilder();
        for (byte b : hashed) {
            int len = b & 0xFF;
            if (len < 16) {
                sb.append("0");
            }
            sb.append(Integer.toHexString(len));
        }
        return sb.toString();
    }
}
