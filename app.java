
import java.util.Scanner;

// JAVA
class Main{
    public static void main(String[] args) {
        // Scanner Predefined = class 
        // tc = variable
        // new = Instance of Object
        // Scanner() = Class Calling...
        // System.in = input readable values (Dynamic)
        Scanner tc = new Scanner(System.in);

        // System.out.println("Enter Your Name : ");
        // Data Type = String
        // __________________________________
        // String name = tc.nextLine();

        // System.out.println("Hii my name is " + name);

        // Data Type = Number 
        // ____________________________________

        System.out.println("Enter Your Frist Number : ");
        int fnum = tc.nextInt();

        System.out.println("Enter Your Second Number : ");
        int lnum = tc.nextInt();
    
        System.out.println(fnum + lnum);
    }
}


