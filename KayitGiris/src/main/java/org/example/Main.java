package org.example;

public class Main {


    public static void main(String[] args) throws InterruptedException {

        Kayıt userkayıt = new Kayıt();
        Kullanıcı user = new Kullanıcı(1, "Quartz", 18);
        userkayıt.kayıtOl(new Kullanıcı(1, user.getName(), user.getAge()));
    }



}