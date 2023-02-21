package org.awslambda;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class StringConcatAndBufferDiffTest {

    @Test
    //StringBuffer improves our performance compare to String concat(slow not recommend to use with loop and each iteration it creates new object ) . below code run in 3 sec and 166ms
    public void testWithStringConcat() {
        String v1="Value1";
        String v2="value2";
        for (int i=0; i<100000; ++i){
            v1+=v2;
        }
        System.out.println(v1);
    }
    @Test
    //StringBuffer improves our performance compare to String concat . below code run in 35 ms
    public void testWithStringBuffer() {
        StringBuffer s1= new StringBuffer("Value1");
        String s2="Value2";
        for (int i=0; i<100000; ++i){
            //System.out.println("===testWithStringBuffer===");
            s1.append(s2);
        }
        System.out.println(s1);
    }
}