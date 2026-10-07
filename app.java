import java.util.Scanner;

// class Student{
//     String name;
//     int age;
// }

// interface Payment{
//     void pay();
// }

// interface Withdrawal{
//     void deposit();
// }


// class UPI implements Payment, Withdrawal{
//     public void pay(){
//         System.out.println("Payment is dont by UPI");
//     }

//     public void deposit(){
//         System.out.println("Your payment is refunded");
//     }
// }

// class Person{
//     consturctor(name){
//         this.name = "Ansh";
//     }
// }

// class Student extends Person{}
// class Employee extends Person{}


//Blueprints of Rules -  Rules Define for a classes, classes must be use this rule for code execuation
// interface Vehical{
//     void start();
// }

// class Car implements Vehical{
//     public void start(){
//         System.out.println("Car is start with key");
//     }
// }
// class Bike implements Vehical{
//     public void start(){
//         System.out.println("Bike is Start with self");
//     }
// }
// class Truck implements Vehical{
//     public void start(){
//         System.out.println("Truck is Start with gear");
//     }
// }

// class Main{
//     public static void main(String[] args) {
//         Car c1 = new Car();
//         Bike b1 = new Bike();
//         Truck t1 = new Truck();
//         c1.start();
//         b1.start();
//         t1.start();

//         // System.out.println("Hello Student");
//         // Primtive - 
//         // 1. Byte
//         // 2. short
//         // 3. int
//         // int age = 22398;
//         // System.out.println(age);
//         // // 4. long = 29839483948L
//         // long adhaar = 2239823829329L;
//         // System.out.println(adhaar);
//         // // 5. float
//         // float agree = 34.05f;
//         // System.out.println(agree);
//         // // 6. Double
//         // double reslt = 34.05;
//         // System.out.println(reslt);
//         // // 7. Char
//         // char grade = 'A';
//         // System.out.println(grade);
//         // // 8. boolean
//         // boolean passed = true;
//         // System.out.print(passed);

//         // ----------------------------------------------------
//         // String name = "Ayushman";
//         // System.out.println(name);

//         // --------------------------
//         // Array
//         // int[] marks = {87, 90 , 29};
//         // System.out.println(marks[2]);

       
//         Student s1 = new Student();
//         s1.name = "Ayushman";
//         s1.age = 24;

//         System.out.println("Hii I am " + s1.name + " and my age is " + s1.age);
//         System.out.println(s1);
//     }
// }

// class Student{
//         String name;
//         int age;
// }
// Student s1 = new Student();
// s1.name = "Ayushman";
// s1.age = 24;

// app.java ----> javac app.java -----> bytecode -----> JVM (Communication) ----> OutPut
// Primtive - 
// 1. Byte
// 2. short
// 3. int
// 4. long = 29839483948L
// 5. float
// 6. Double
// 7. Char
// 8. boolean

// Non Primitive
// 1. String
// 2. Array 
// 3. class
// 4. Object
// 5. Interface
// 6. Enum

enum Signal{
    RED,
    YELLOW,
    GREEN
}

class Main{
    public static void main(String[] args){
        // Signal light = Signal.YELLOW;

        //init Class    -----Class---------
        Scanner tc = new Scanner(System.in);

        // Label
        System.out.println("Enter Your Signal RED/YELLOW/GREEN : ");

        // Input
        String color = tc.nextLine().trim().toUpperCase();

        // READ PREDEFIND Variablee Values
        // color = user input
        Signal light = Signal.valueOf(color);

        if(light == Signal.RED){
            System.out.println("STOP");
        }else if(light == Signal.YELLOW){
            System.out.println("Caution");
        }else{
            System.out.println("GO");
        }
    }
}