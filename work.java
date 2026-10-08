// class Main{
//      public static void main (String[] args){
//          int age = 20;
//          String grade = "A";
//          boolean stock = true;
//          double result = 79.800;

//          System.out.println("hello");
//          System.out.println("khushi");
//          System.out.println("chouhan");
//          System.out.println(age);
//          System.out.println(grade);
//          System.out.println(stock);
//          System.out.println(result);
//      }
//     }     
   


// import java.util.Scanner;

// class Main{
//     public static void main(String[] args) {
//         Scanner tc = new Scanner(System.in);
//         // System.out.println("Enter your Course: ");
//         // String course = tc.nextLine();
//         // System.out.println("Hii my course is " + course);
//         System.out.println("Enter your first value: ");
//         int fvalue = tc.nextInt();

//         System.out.println("Enter your second value: ");
//         int lvalue = tc.nextInt();
//         System.out.println(fvalue - lvalue);
//     }
// }

// import java.util.Scanner;

// class Main{
//     public static void main(String[] args){
//         Scanner kc = new Scanner(System.in);
//         System.out.println("Enter your first number: ");
//         int fnum = kc.nextInt();
//         System.out.println("Enter your second value: ");
//         int lnum = kc.nextInt();
//         int total = fnum + lnum;
//         if (total >= 20){
//         System.out.println("valid");
//         }
//         else {
//         System.out.println("invalid");
//         }
//      }
// }

// import java.util.Scanner;

// class Main{
//     public static void main(String[] args){
//         Scanner cal = new Scanner(System.in);
//         System.out.println("Enter your name: ");
//         String fname = cal.nextLine();
//         System.out.println("Enter your last name: ");
//         String lname = cal.nextLine();
//         String sum = fname + lname ;
       
//         // System.out.println(sum);
       
//         if (sum.equals("khushichouhan")){
//             System.out.println("You are the right person");
//         }
//         else{
//             System.out.println("You are the wrong person");
//         }
//     }
// }


// import java.util.Scanner;

// class Main{
//     public static void main(String[] args){
//         Scanner work = new Scanner(System.in);
//         System.out.println("Enter value:-");
//         int value1 = work.nextInt();
//         System.out.println("Enter next value:-");
//         int value2 = work.nextInt();
//         int total = value1 * value2 ; 
//         System.out.println(total);
//     }
// }

interface Fruits{
    void banana();
};

interface Vegitable{
    void onion();
};

class Chef implements Fruits, Vegitable{
    public void banana(){
        System.out.println("Fruits is UP");
    }

    public void onion(){
        System.out.println("vegitables Is Up");
    }
}

class Main{
    public static void main(String[] args){
        Chef c1 = new Chef();
        c1.onion();
    }
}