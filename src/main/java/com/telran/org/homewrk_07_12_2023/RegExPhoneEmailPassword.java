package com.telran.org.homewrk_07_12_2023;

import java.util.ArrayList;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegExPhoneEmailPassword {

    public static void main(String[] args) {

// Написать регулярные выражения для :
//       1- Check phone number 7 digit, 7777777 or 777-7777 or  777 7777 :
//        range (0-9)

        List<String> phones = new ArrayList<>();
        phones.add("777-7777");
        phones.add("777 7777");
        phones.add("7777777"); // this should be true
//Неправильный Phones:
        phones.add("@71-1212");
        phones.add("l08 A100");
        phones.add("a09G1&(");

//        String regex1 = "\\d\\d\\d[\\s-\\S]\\d\\d\\d\\d"; // what I add here to make "7777777" true
        String regex1 = "^\\d{7}$|^\\d{3}-\\d{4}$|^\\d{3} \\d{4}$";
        Pattern pattern1 = Pattern.compile(regex1);

        for (String phone : phones) {
            Matcher matcher = pattern1.matcher(phone);
            System.out.println(phone + " : " + matcher.matches());
        }
        System.out.println();

//       2- Check email

        List<String> emails = new ArrayList<>();
        emails.add("alex@gmail.com");
        emails.add("vera@yahoo.com");
        emails.add("steve@comcast.net");
//Неправильный имейл:
        emails.add("@gmail.com");
        emails.add("ryan.nut0800.com@");

        String regex2 = "^[A-Za-z0-9+_.-]+@(.+)$";
        Pattern pattern2 = Pattern.compile(regex2);

        for (String email : emails) {
            Matcher matcher = pattern2.matcher(email);
            System.out.println(email + " : " + matcher.matches());
        }
        System.out.println();

//       3- Check password  8 letters, digit,letters and something else

        List<String> passwords = new ArrayList<>();
        passwords.add("AbtIPdqK98chb$@="); // included 8 letters, (2) digits, (3) letter, and some (3) symbols = something else
//Неправильный passwords:
        passwords.add("PP)11ww http: /");
        passwords.add("7773334");

        String regex = "(?=.*\\d)(?=.*[a-zA-Z])(?=.*[^\\W\\s]).{16,}";
        Pattern pattern = Pattern.compile(regex);
        String regex3 = "[A-Z][a-z][a-z][A-Z][A-Z][a-z][a-z][A-Z]\\d\\d[a-z][a-z][a-z]\\W\\W\\W";
        Pattern pattern3 = Pattern.compile(regex3);

        for (String password : passwords) {
            Matcher matcher = pattern.matcher(password);
            System.out.println(password + " : " + matcher.matches());
        }
        System.out.println();
        for (String password : passwords) {
            Matcher matcher = pattern3.matcher(password);
            System.out.println(password + " : " + matcher.matches());
        }
    }
}