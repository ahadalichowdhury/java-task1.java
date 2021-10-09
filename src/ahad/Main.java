package ahad;
/*
Name:S. M. Ahad Ali Chowdhury
Id:2012020156
Section:D
Email:cse_2012020156@lus.ac.bd
Date:15-07-2021
*/


import java.util.Scanner;
public class Main {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter your section: ");
        String section = input.nextLine();
        Info info=new Info();
        Hobby hobby = new Hobby();
        System.out.println("Your section is "+section);
        System.out.println("Your name is "+info.name);
        System.out.println("Your id is "+info.id);
        System.out.println("Your hobby is "+hobby.hobbyName);


    }
}
