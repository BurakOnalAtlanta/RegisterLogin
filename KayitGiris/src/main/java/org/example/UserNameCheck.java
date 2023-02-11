package org.example;

import java.util.Scanner;

public class UserNameCheck {

    public boolean nameCheck(Kullanıcı user) throws InterruptedException {
        System.out.println("İsminizi giriniz");

        Scanner scanner = new Scanner(System.in);
        String name = scanner.next();
        user.setName(name);

        System.out.println("İsminiz kontrol ediliyor...");
        Thread.sleep(3000);

        if (user.getName() == null) {
            System.out.println("İsim bulunamadı.");
            return false;
        } else {
            System.out.println("İsminiz Onaylandı. İsminiz: " + user.getName());
        }
        return true;
    }


}
