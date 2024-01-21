// Hi it's J_P_Sathavara...
/*
    Data types are divided into two groups:

        => Primitive data types - includes byte, short, int, long, float, double, boolean and char
        => Non-primitive data types - such as String, Arrays and Classes 
 */
/*
    * Primitive Data Types
        => A primitive data type specifies the size and type of variable values, and it has no additional methods.
 */
/*
        Data Type  	  |            Size	          |            Description
                      |                           |
          byte	      |           1 byte          |   Stores whole numbers from -128 to 127
          short	      |           2 bytes         |   Stores whole numbers from -32,768 to 32,767
          int	      |           4 bytes         |   Stores whole numbers from -2,147,483,648 to 2,147,483,647
          long	      |           8 bytes         |   Stores whole numbers from -9,223,372,036,854,775,808 to 9,223,372,036,854,775,807
          float	      |           4 bytes         |   Stores fractional numbers. Sufficient for storing 6 to 7 decimal digits
          double	  |           8 bytes         |   Stores fractional numbers. Sufficient for storing 15 decimal digits
          boolean     |           1 bit           |   Stores true or false values
          char	      |           2 bytes         |   Stores a single character/letter or ASCII values
          
 */


public class Java_Data_Type {
    public static void main(String[] args) {
        
    
    int myNum = 18;               // Integer (whole number)
    float myFloatNum = 8.76f;    // Floating point number
    char myLetter = 'K';         // Character
    boolean myBool = true;       // Boolean
    String myText = "Hello";     // String

    System.out.println(myNum + "\n" + myFloatNum + "\n" + myLetter + "\n" + myBool + "\n" + myText);        //  "\n" => for next line

                                        // OR

    String output = myNum + "\n" + myFloatNum + "\n" + myLetter + "\n" + myBool + "\n" + myText ;
    System.out.println("\n" +output + "\n");
    /*
        Primitive number types are divided into two groups:

            => Integer types :-> stores whole numbers, positive or negative, without decimals. Valid types are byte, short, int and long.

            => Floating point types represents numbers with a fractional part, containing one or more decimals. There are two types: float and double.
     */
    // Even though there are many numeric types in Java, the most used for numbers are int (for whole numbers) and double (for floating point numbers).
    /*
        Scientific Numbers :
            
            -> A floating point number can also be a scientific number with an "e" to indicate the power of 10:
     */
    float f1 = 18e2f;
    double d1 = 61E5d;
    System.out.println(f1);
    System.out.println(d1 + "\n");
    /*
    Here's a breakdown of the number 18e2f:

        -> 18: This is the mantissa, or the significant digits of the number. It represents the value 35.
        -> e2: This is the exponent, expressed in scientific notation. 
               The "e" stands for "times 10 to the power of." 
               In this case, "e2" means "times 10 to the power of 2," or 1,800.
        -> f: This is a type specifier, indicating that the number is a single-precision floating-point number (also known as a "float" in many programming languages).
        Putting it all together, 18e2f is equal to 18 * 100, which is 1,800.
    */
    //Single-precision floats (32 bits): They offer a balance between range and precision for many applications.
    //Double-precision floats (64 bits): They provide higher precision but may consume more memory.

    /*
        Java Type Casting
     
            => Type casting is when you assign a value of one primitive data type to another type.

                In Java, there are two types of casting:

                    => Widening Casting (automatically) - converting a smaller type to a larger type size
                            byte -> short -> char -> int -> long -> float -> double

                    => Narrowing Casting (manually) - converting a larger type to a smaller size type
                            double -> float -> long -> int -> char -> short -> byte
    */

    // Widening Casting

    int myInt = 18;
    double myDouble = myInt; // Automatic casting: int to double
        
    System.out.println(myInt);      // Outputs 18
    System.out.println(myDouble + "\n");   // Outputs 18.0

    // Narrowing Casting

    double myDouble1 = 18.65d;
    int myInt1 = (int) myDouble1; // Manual casting: double to int

    System.out.println(myDouble1);   // Outputs 18.65
    System.out.println(myInt1);      // Outputs 18

    }    
}
