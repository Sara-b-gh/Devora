package com.vita.Utils;

public class JavaConnector {

    public static boolean captchaValidated = false;

    public void receiveToken(String token) {
        captchaValidated = true;

        System.out.println("Captcha valide !");
        System.out.println(token);
    }
}
