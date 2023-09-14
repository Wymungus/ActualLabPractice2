//Wyatt Nall
//9/14/23


import java.util.Scanner;
public class Main
{
    public static void main (String[] args)
    {
        Scanner keyboard = new Scanner(System.in);

        String StringOne;
        int intOne;

        System.out.print("What is your first name :: ");
        StringOne = keyboard.next();
        System.out.println("Your name is :  " + StringOne);

        System.out.print("What is your age :: ");
        intOne = keyboard.nextInt();



        System.out.println("Your age is :  " + intOne);

    }
}