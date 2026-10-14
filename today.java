import java.util.Scanner;

class Main{
    static void greet(){
        System.out.println("JAVA Outer Scope");
    };
    // static void greet(int a, int b){
    //     int result = a + b;
    //     System.out.println(result);
    // };

    // static int multiply(int a, int b){
    //     return a * b;
    // }

    static void checkEvenOdd(int num){
        if(num % 2 == 0){
            System.out.println("Even Number");
        }else{
             System.out.println("Odd Number");
        }
    }

    public static void main(String[] args){
        System.out.println("-----Even & ODD Program Function-----");

        // int result = multiply(2, 3);
        // System.out.println(result);

        // Scanner nu = new Scanner(System.in);
        // System.out.println("Enter Your Number : ");
       

        int number = 7;

        checkEvenOdd(number);



        // greet(17, 18);
        // greet(78, 23);
        // greet(37, 21);
        // greet(14, 18);
     
        // int marks = 40;
        

        // if(marks >= 40){
        //     System.out.println("Pass");
        // }else{
        //     System.out.println("Fail");
        // }

        // Scanner mrk = new Scanner(System.in);
        // Creating Labels

        // System.out.println("Enter Marks : ");
        // int marks = mrk.nextInt();

        // if(marks < 0 || marks > 100){
        //     System.out.println("Invalid Marks");
        // }
        // else if(marks >= 90){
        //     System.out.println("Grade A");
        // }
        // else if(marks >= 75){
        //     System.out.println("Grade B");
        // }
        // else if(marks >= 60){
        //     System.out.println("Grade C");
        // }
        // else if(marks >= 40){
        //     System.out.println("Grade D");
        // }
        // else{
        //     System.out.println("Fail");
        // }

        // for(int i = 0; i <= 10; i++){
        //     System.out.println(i);
        // }

        // int i = 5;
        // while(i >= 1){
        //     System.out.println(i);

        //     // Decriment
        //     i--;
        // }

        // Scanner nu = new Scanner(System.in);

        // System.out.println("Enter Your Number : ");
        // int number = nu.nextInt();

        // for(int i = 1; i <= 10; i++){
        //     System.out.println((number * i));
        // }

        // Outer Loop
        // for(int i = 1; i <= 5; i++){
        //     // Nested Loop
        //     for(int j = 1; j <= i; j++){
        //         System.out.print("*");
        //     }
        //     System.out.println();
        // }

        // for(int i = 1; i <= 20; i++){
        //     if(i % 2 == 0){
        //         System.out.println(i +  " Even");
        //     }
        //     else{
        //         System.out.println(i +  " ODD");
        //     }
        // }


        //Data Types ----> Statics Variables ----> Scanner Class ---> If else ----> Statements -----> if True = {Passs} | if false = {Fail}

        // String name = "Rahul";
        // [
        //     1. Option 1
        //     2. Option 2
        //     3. Option 3
        // ]

        // Answer 2 = Return Option statement is excuted!

        // Market(Vegitables) , College, School

        // Conditions First - Market || Vegitables
        // if(name.equals("Rahul")){
        //     System.out.println("Found");
        // }

        // // Conditions Sec - College || Asignments
        // else if(){

        // }

        // // Conditions Third - School || Results
        // else if(){
            
        // }

        // // Conditions Exit
        // else{
        //     System.out.println("Not Found");
        // }

    }
}
