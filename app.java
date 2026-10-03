import java.util.Scanner;

class Main{
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        // Scanner = Class ||| new = Instance Of Object creation ||| System.in  = User input parse collection

        // Labels = 
        System.out.println("Enter Your Number : ");
        // Input
        int num = sc.nextInt();

        System.out.println("Enter Your Second Number : ");

        int num2 = sc.nextInt();

        int total = num + num2;

        if (total % 2 == 0){
            System.out.println(total + " This number is Even");
        }else{
            System.out.println(total + " This number is Odd");
        }


        // Scanner Predefined = class 
        // tc = variable
        // new = Instance of Object
        // Scanner() = Class Calling...
        // System.in = input readable values (Dynamic)
        // Scanner tc = new Scanner(System.in);

        // System.out.println("Enter Your Name : ");
        // Data Type = String
        // __________________________________
        // String name = tc.nextLine();

        // System.out.println("Hii my name is " + name);

        // Data Type = Number 
        // ____________________________________

        // System.out.println("Enter Your Frist Number : ");
        // int fnum = tc.nextInt();

        // System.out.println("Enter Your Second Number : ");
        // int lnum = tc.nextInt();
    
        // System.out.println(fnum + lnum);
    }
}


