package org.awslambda;

public class StringConcatAndBufferDiff {
    public static void main(String[] args) {
        String s1= "Value1";
        String s2= "Value2";
        for (int i=0; i<1000; ++i){
            System.out.println("======");
            s1= s1+s2;
        }


        StringBuffer v1= new StringBuffer("Value1");
        String v2="Value2";
        for (int i=0; i<100000; ++i){
            //System.out.println("===testWithStringBuffer===");
            v1.append(v2);
        }
    }
    //ReadME
    /** In Java, there are two main ways to concatenate strings: using the + operator or using the StringBuffer class. Here are some differences between the two approaches:

String concatenation using the + operator creates a new String object each time the + operator is used. This can be inefficient if a large number of strings are being concatenated. In contrast, StringBuffer provides a more efficient way to concatenate strings.

StringBuffer provides the append method for concatenating strings. The append method modifies the existing StringBuffer object rather than creating a new one. This can be more efficient than using the + operator to concatenate strings, especially when dealing with large numbers of strings.

StringBuffer is thread-safe, which means that it can be used safely in a multithreaded environment. In contrast, the + operator is not thread-safe, so care must be taken when using it in a multithreaded environment.

StringBuffer is mutable, which means that its contents can be changed after it is created. In contrast, String objects are immutable, which means that their contents cannot be changed once they are created.
*/
}
