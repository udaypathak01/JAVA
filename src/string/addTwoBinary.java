package string;

import java.math.BigInteger;

public class addTwoBinary {
    public static void main(String[] args) {
        String a="11";
        String b="1";
//****************** method 1 *******************************
        BigInteger num1=new BigInteger(a,2);
        BigInteger num2=new BigInteger(b,2);

        System.out.println(num1.add(num2).toString(2));






    }
}
