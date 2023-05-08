package org.example;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
       String userName,pswd;
       Scanner input = new Scanner(System.in);

       System.out.print("Kullanıcı adınız giriniz : ");
       userName = input.nextLine();

       System.out.print("Şifrenizi giriniz : ");
       pswd = input.nextLine();

       if (userName.equals("Patika") && pswd.equals("12345")){
           System.out.println("Giriş yaptınız");
       }else {
           System.out.println("Hatalı giriş yaptınız");
       }



    }
}