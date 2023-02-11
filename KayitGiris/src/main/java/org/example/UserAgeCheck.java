package org.example;

import java.util.Scanner;

public class UserAgeCheck {

    public boolean ageCheck(Kullanıcı user) throws InterruptedException {
        System.out.println("Yaşınızı giriniz");
        Scanner scanner = new Scanner(System.in);
        int age = scanner.nextInt();
        user.setAge(age);

        System.out.println("Yaşınız Kontrol Ediliyor");
        Thread.sleep(3000);

        if (user.getAge() >= 18) {
            System.out.println("Yaşınız kabul edildi. " + user.getAge());

            return true;
        }else {
            System.out.println("Yaşınız 18'den küçük. " + (user.getAge()));
        }
        return false;
    }


}
