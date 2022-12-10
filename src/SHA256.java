/**
SHA256 class used to convert a block to a sha256 digest
Author: Francesco Nieri
Date: 10/12/2021
Taken from https://www.javatpoint.com/messagedigest-in-java
*/

import java.security.MessageDigest;
import java.util.Scanner;  

public class SHA256 {
    public SHA256() throws Exception {}   

    private String hash(String inputToHash) throws Exception {
        MessageDigest digest = MessageDigest.getInstance("SHA-256");
        digest.update(inputToHash.getBytes());
        byte[] hash = digest.digest();
        StringBuffer hexHash = new StringBuffer();  
        for (int i = 0; i < hash.length; i++) {  
            hexHash.append(Integer.toHexString(0xFF & hash[i]));  
        }  
        String finalHash = hexHash.toString();
        System.out.println(finalHash);
        return finalHash;
    }
    
    public String computeHash(String inputToHash) throws Exception {
        return hash(inputToHash);
    }
}