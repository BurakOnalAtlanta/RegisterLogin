package org.example;

public class Kayıt {




    public void kayıtOl(Kullanıcı user) throws InterruptedException {
        UserAgeCheck userAge = new UserAgeCheck();
        UserNameCheck userName = new UserNameCheck();
        if (userAge.ageCheck(user) && userName.nameCheck(user)) {
            System.out.println("Kullanıcı Kayıt oldu: " + user.getName());
        } else {
            System.out.println("Kullanıcı kayıt olamadı.");
        }

    }

}
