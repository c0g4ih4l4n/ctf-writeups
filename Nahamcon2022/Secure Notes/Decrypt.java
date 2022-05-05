package com.naham;

import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;

public class Decrypt {
    public static boolean action(String str, File file, File file2) {
        try {
            SecretKeySpec secretKeySpec = new SecretKeySpec(str.getBytes(), "AES");
            Cipher instance = Cipher.getInstance("AES");
            instance.init(2, secretKeySpec);
            FileInputStream fileInputStream = new FileInputStream(file);
            byte[] bArr = new byte[(int) file.length()];
            fileInputStream.read(bArr);
            byte[] doFinal = instance.doFinal(bArr);
            FileOutputStream fileOutputStream = new FileOutputStream(file2);
            fileOutputStream.write(doFinal);
            fileInputStream.close();
            fileOutputStream.close();
            return true;
        } catch (Exception e2) {
            System.out.println(e2.toString());
            return false;
        }
    }

}
