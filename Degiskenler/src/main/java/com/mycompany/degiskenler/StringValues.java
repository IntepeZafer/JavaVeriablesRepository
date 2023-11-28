package com.mycompany.degiskenler;
public class StringValues {
    public static void main(String[] args) {
        String Name = "Zafer";
        System.out.println("Name Size: " + Name.length());
        char a = (char)Name.charAt(0);
        System.out.println(a);
        String b = "12";
        int c = Integer.parseInt(b);
        System.out.println(c);
        System.out.println(Name + " --- " + c);
        char aa = 'a';
        String bb = String.valueOf(aa);
        System.out.println(bb);
    }
}
