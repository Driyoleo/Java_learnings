package Lesson3;

public class typeConversion {
    public static void main(String[] a){

        // Type Conversion: where data type with small range is converted into a variable with larger range
        // also known as implicit type conversion
        byte num1 = 2 ;
        int num2 = num1 ;
        System.out.printf("num2 = %d %n" , num2);

        // Type Casting: where data type with larger range is converted into a data type with smaller range but the value within the smaller range
        // syntax: (type) value;
        // this is also known as explicit type conversion
        int n1 = 10 ;
        byte n2 = (byte) n1 ;
        System.out.printf("n2 = %d %n" , n2) ;

        // Type Promotion: where due to operation value may have possibility to exceed the present data type range thus type converted into larger data type
        byte p = 2 ;
        byte q = 4 ;
        int r = p+q ;
        System.out.println(r);




    }
}
