import java.util.Scanner;

public class Basics{
    public static void main(String[]args){
        System.out.println("Printing with a new line");
        System.out.print("Printing without a new line. Printf and print works the same way");

        System.out.println("\n");

        // Variables

        int a = 59;
        float b = 59.5;
        double c = 59.83489; //more accurate than float but uses 8 bytes of memory
        String d = "Hello"; //there is no char in java but a function to get a single character

        // if/else statements with input from user

        Scanner sc = new Scanner(System.in); // for everything you need to create a var or object & System.in is you who is giving a input or value to the terminal

        int value = sc.nextInt();

        if(value>5 && value<10) System.out.println("You pass");
        else System.out.println("You fail");

        // loops

        for(int i =1; i<=10; i++){
            System.out.print(i+" "); // if you want them in a new line use "println" & remove the + and "" mark.
        }

        System.out.println(); //you don't need to type \n for a new line as println creates a new line after printing the given value
        int j = 0;

        while(j<21){
            System.out.print(j +" ")
        }

        System.out.println();

        do{
            int k = 21;
            System.out.println(k +" ");
            k++;
        }while(k<31);
    }
}