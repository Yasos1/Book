package com.company;

public class TestBook {
    public static void main(String[] args) {
        Book b1 = new Book("Three comrades ", " novel", 470);
        Book b2 = new Book("Beauty and the beast ", " fairy tale", 96);
        Book b3 = new Book("The Shining ", " horror", 560);
        System.out.println(b1);
        System.out.println(b2);
        System.out.println(b3);
    }
}