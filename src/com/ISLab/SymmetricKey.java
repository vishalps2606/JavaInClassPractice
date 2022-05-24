package com.ISLab;

import java.nio.charset.StandardCharsets;
import javax.crypto.Cipher;
import javax.crypto.KeyGenerator;
import javax.crypto.SecretKey;

//Note: I have perform this practical using JAVA programming language because Java is my first programming language
// as well as there are sufficient resources present on internet from where I can seek help
public class SymmetricKey {
    private static Cipher cipher = null;

    public static void main(String[] args) throws Exception {

        KeyGenerator keyGenerator = KeyGenerator.getInstance("DESede");

        // keysize must be equal to 112 or 168 for this provider
        keyGenerator.init(168);
        SecretKey secretKey = keyGenerator.generateKey();
        cipher = Cipher.getInstance("DESede");

        System.out.println();
        String plainText = "Vishal Pandey 19BCS2930"; // providing the PlainText
        System.out.println("Plain Text Before Encryption: " + plainText);

        byte[] plainTextByte = plainText.getBytes(StandardCharsets.UTF_8);
        byte[] encryptedBytes = encrypt(plainTextByte, secretKey);

        String encryptedText = new String(encryptedBytes, StandardCharsets.UTF_8);
        System.out.println("Encrypted Text After Encryption: " + encryptedText);

        byte[] decryptedBytes = decrypt(encryptedBytes, secretKey);
        String decryptedText = new String(decryptedBytes, StandardCharsets.UTF_8);
        System.out.println("Decrypted Text After Decryption: " + decryptedText);
    }

    static byte[] encrypt(byte[] plainTextByte, SecretKey secretKey)
            throws Exception {
        cipher.init(Cipher.ENCRYPT_MODE, secretKey);
        return cipher.doFinal(plainTextByte);
    }

    static byte[] decrypt(byte[] encryptedBytes, SecretKey secretKey)
            throws Exception {
        cipher.init(Cipher.DECRYPT_MODE, secretKey);
        return cipher.doFinal(encryptedBytes);
    }
}
