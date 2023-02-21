package org.awslambda;

public class WrapperExample {
    public static void main(String[] args) {
        Integer three= 3;
        System.out.println(++three);


        //Two wrapper objects created using new are not same object
        Integer four1= new Integer(4);
        Integer four2= new Integer(4);
/*        System.out.println(++four1);
        System.out.println(++four1);*/
        System.out.println(four1 == four2);
        //uses the equals method to check if their contents are equal. By using the equals method, we ensure that the comparison is based on the string contents, not the object identity.
        System.out.println("four1 .equal four2 ==> " +four1.equals(four2));
    }
    /*String comparison issue: The == operator checks if two objects are the same instance, not if their contents are equal. When comparing strings, it's better to use the equals method instead.*/
}
