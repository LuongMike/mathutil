package com.giaolang.util;

import com.giaolang.util.mathutil.core.MathUtility;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        verifyFactorialGivenRightArg0RunsWell();
        verifyFactorialGivenRightArg1RunsWell();
        verifyFactorialGivenRightArg2RunsWell();
    }
    //test case 3: verify the getfactorial() with n = 2
    public static void verifyFactorialGivenRightArg2RunsWell(){
        System.out.println("2! = expected: 2 " + ", actual: " + MathUtility.getFactorial(2));
        System.out.println("3! = expected: 6 " + ", actual: " + MathUtility.getFactorial(3));
        System.out.println("4! = expected: 24 " + ", actual: " + MathUtility.getFactorial(4));
        System.out.println("5! = expected: 120 " + ", actual: " + MathUtility.getFactorial(5));
        System.out.println("6! = expected: 720 " + ", actual: " + MathUtility.getFactorial(6));
    }
    //test case 2: verify the getfactorial() with n = 1
    public static void verifyFactorialGivenRightArg1RunsWell(){
        int n=1;
        long expected = 1; //hy vọng 1 trả về nếu tính 1!
        long actual = MathUtility.getFactorial(n);
        //test là so sánh
        System.out.println("1! = expected: " + expected + ", actual: " +actual);
    }

    //test thử hàm tính giai thừa gọi trong main()
    //muốn test gì đó phải có test case
    //test case 1: verify the getfactorial() with n =0
    //step
    //given n = 0
    //call getFactorial(n=0)
    //Expected result
    //the method must return 1 as the result of 0! = 1
    //status: pass or fail phải chờ
    public static void verifyFactorialGivenRightArg0RunsWell(){
        int n=0;
        long expected = 1; //hy vọng 1 trả về nếu 0!
        long actual = MathUtility.getFactorial(n);
        //test là so sánh
        System.out.println("0! = expected: " + expected + ", actual: " +actual);
    }
}
//kĩ thuật vừa viết code vừa gõ test case, vừa gõ test run đc gọi là
// TDD(đưa vào CV): Test Driven Development