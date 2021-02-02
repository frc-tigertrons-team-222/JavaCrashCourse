package myPackage;

import java.util.Date;
import java.util.Scanner;

import otherPackage.*; // imports all from other package | we can use: import otherPackage.exampleDriver; and it would only import exampleDriver class

public class App {

    static void myMethod() {
        System.out.println("HELLO MY FRIENDS!");
    }
    static void myMethod2(String fname) {
        System.out.println(fname + " Refsnes");
    }

    static void myMethod3(String fname, int age) {
        System.out.println(fname + " is " + age);
    }
      
    static int sumNumbers(int a, int b) {
        return a + b;
    }

    // Recursion -- > method / function calling itself
    static int factorial(int n) {
        if(n == 0){
            return 1;
        }
        else{
            return n * factorial(n-1);
        }
    }

    public static void main(String[] args) throws Exception {

        int x = 10;
        int y = 100;
        int z = x + y; // 10 + 100 = 110

        String name = "Andrzej";
        char letter = 'A';
        char secondLetter = name.charAt(1);

        System.out.println("Hello, World!"); // output: "Hello World"
        System.out.println("X = "+x + " | Y =  "+ y + " | Z = "+ z); // output: X = 10 | Y = 100 | Z = 110
        System.out.println(letter + " | "+ secondLetter); // output: A
        System.out.println("My name is " + name); // output: "My name is Andrzej"


        // INPUTS
        Scanner sc= new Scanner(System.in); //System.in is a standard input stream.

        System.out.println("What is your name? ");
        String str= sc.nextLine();  
        System.out.println("What is your age? ");
        int inputInt = sc.nextInt();
        System.out.println("What is the size of your screen in [in]? ");
        float inputFraction = sc.nextFloat();
        System.out.println("Give me PI number: ");
        double inputDoublePrecisionFraction = sc.nextDouble();

        System.out.println( " HI " +  str + " !!! " + "You are: "+ inputInt + " years old "  );
        System.out.print( " Your screen has" + inputFraction + "[in] \n PI = "+inputDoublePrecisionFraction);

        sc.close();  

        // more examples: 
        // https://www.javatpoint.com/how-to-get-input-from-user-in-java
        // https://www.javatpoint.com/Scanner-class

        Date now = new Date();
        System.out.println(" \n ==============> Today is: " + now);


    //  CONDITIONS
    if( x > y ){
        System.out.println( x+y );
    } else if( y > 100 && x <= 10 && x != y ) {
        System.out.println( x*y );
    } else {
        System.out.println( "Neither condition was true" );
    }

    int day = 4;
    switch (day) {
      case 1:
        System.out.println("Monday");
        break;
      case 2:
        System.out.println("Tuesday");
        break;
      case 3:
        System.out.println("Wednesday");
        break;
      case 4:
        System.out.println("Thursday");
        break;
      case 5:
        System.out.println("Friday");
        break;
      case 6:
        System.out.println("Saturday");
        break;
      case 7:
        System.out.println("Sunday");
        break;
    default:
        System.out.println("Non of above: time is relative");
        break;
    }


    //  LOOPS
    int i = 0;
    while (i < 5) {
      System.out.println(i);
      i++;
    }


    int j = 0;
    do {
        System.out.println(j);
        j++;
    }
    while (i < 5);  

    for (int iterator = 0; iterator < 5; iterator++) {
        System.out.println(iterator * 2);
    }

    String[] cars = {"Volvo", "BMW", "Ford", "Mazda"};
    for (String car : cars) {
      System.out.println(cars);
    }

//  BREAK / CONTINUE

    for (int k = 0; k < 10; k++) {
        if (k == 4) {
          break; // stops right here and breaks the loop - so it won't execute those commands any more
        }
        System.out.println(k);
      }

      for (int k = 0; k < 10; k++) {
        if (k == 4) {
          continue; // -- that wont break whole loop. it will just skip iteration for i == 4
        }
        System.out.println(k);
      }



//      ARRAYS
        String[] cars2 = {"Volvo", "BMW", "Ford", "Mazda"};
        cars[0] = "Opel"; // accesing and editing array's values
        System.out.println(cars[0]);
        System.out.println("Lenght of cars array: " + cars.length);

        int[] myNum = {10, 20, 30, 40};

        for (int ii = 0; ii < cars.length; ii++) {
            System.out.println(cars[ii]);
        }



        // MATRIXES - array of arrays
        int[][] myNumbers = { 
            { 1, 2, 3, 4 }, 
            { 5, 6, 7 } 
        };
        int value = myNumbers[1][2];
        System.out.println(value); // Outputs 7
        for (int ii = 0; ii < myNumbers.length; ++ii) {
            for(int jj = 0; jj < myNumbers[ii].length; ++jj) {
              System.out.println(myNumbers[ii][jj]);
            }
        }

        // METHODS

        myMethod();
        myMethod2("Tigertrons");
        int age = 20;
        myMethod3("Andrzej", age);
        System.out.println( sumNumbers(age, 10) );
        System.out.println( factorial(9) );
        

        // =============================================================
        //  OOP
        //  if the class we are trying to reach is in the same package we dont use any extra imports -> just type name and create obj
        Person gandalf = new Person("Gandalf the White",3000,"You shall not pass");
        System.out.println( gandalf.lifeQuote );
        gandalf.lifeQuote = "Pedo melon a mino";
        System.out.println( gandalf.lifeQuote );
        gandalf.sayHelllo();



        //  Packages - import above
        exampleDriver talonX = new exampleDriver();
    }
}

/*
    =================== Homework ;)  ===================
    Exercise 1:
    Print shape in console 

        X X X X X X
        X         X
        X         X
        X         X
        X         X
        X X X X X X


    Exercise 2:
    Print shape in console 
    a ) with fixed size ( height == 6 )
		     X
		    XXX
		   XXXXX
		  XXXXXXX
		 XXXXXXXXX
    XXXXXXXXXXX
    b)* get height from user    

    Exercise 3:
    Print shape in console
	1
	12
	123
	1234
	12345
	123456
    
    Exercise 4:
    Print all odd numbers in range x ∈ < 0, 100 >

*/