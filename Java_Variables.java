
// Hi it's J_P_Sathavara...

// In Java, there are different types of variables, for example:

/*  
    String - stores text, such as "Hello". String values are surrounded by double quotes
    int - stores integers (whole numbers), without decimals, such as 123 or -123
    float - stores floating point numbers, with decimals, such as 19.99 or -19.99
    char - stores single characters, such as 'a' or 'B'. Char values are surrounded by single quotes
    boolean - stores values with two states: true or false 
*/

/*
    => The general rules for naming variables are:

        Names can contain letters, digits, underscores, and dollar signs
        Names must begin with a letter
        Names should start with a lowercase letter and it cannot contain whitespace
        Names can also begin with $ and _ (but we will not use it in this tutorial)
        Names are case sensitive ("myVar" and "myvar" are different variables)
        Reserved words (like Java keywords, such as int or boolean) cannot be used as names
*/ 
/**
 * Java_Variables
 */
public class Java_Variables {

    public static void main(String[] args) {
        // basic structure tu define variable
        // type variableName = value;
        // type represent the variable's type like 'String' or 'int'
        // variableName reprecent the name of variable
        // vlaue is represent the value of variable
        // and the ' = ' assignment operator is assign the valu to the vavriable
        // acording to it's type

        // now Create a variable called num of type int and assign it the value 18:
        int num = 18;
        System.out.println(" The value of int num is :- " + num);

        // or

        /*
         * int num ;
         * num = 18 ;
         * System.out.println(" The value of int num is :- " + num );
         */ // this is the another way to define the variable

        // as par above we also overwrite the value to. by variable 'number' with value
        // of 21 to overwrite 30
        int number = 21;
        number = 30;
        System.out.println(" overwrited value of int number :- " + number);

        // there are another method with you can prevent the value from overwrit... as
        // 'final' key word
        final int numBer = 30;
        System.out.println(" you can note overwrited value of int numBer :- " + numBer);

        // now Create a variable called myName of type String and assign it the value
        // "Nish":
        String myName = "Nish";
        System.out.println(" The value of String myName is :-  " + myName);

        // other vsriablr

        int myNum = 5;
        float myFloatNum = 5.99f;
        char myLetter = 'D';
        boolean myBool = true;
        String myText = "Hello";

        System.out.println(+myNum + " , " + myFloatNum + " , " + myBool + " , " + myLetter + " , " + myText);

        // you can also declair your variables like this

        int a = 10, b = 12, c = 18, d = 30;

        // You can also use the + character to add a variable to another variable:
        int x = a + b + c + d;

        System.out.println(" The som of a + b + c + d = " + x);

    }

}