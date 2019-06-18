package com.github.hcsp.controlflow;

public class Main {
    public static void main(String[] args) {
        printPrimeNumbers();
    }

    /**
     * 打印100以内的素数（质数）。 一个大于1的自然数，除了1和它自身外，不能被其他自然数整除的数叫做质数。
     *
     * <p>提示：对于正整数n，如果用2到Math.sqrt(n)+1之间的所有整数去除，均无法整除，则n为质数。
     */
    public static void printPrimeNumbers() {
        for (int i =2;i<100;i++){
            int number =(int)Math.sqrt(i)+1;
            boolean isResult = true;  //  质数
            for(int j =2;j<=number;j++){
                if(i%j==0){
                    isResult=false;
                    break;
                }
            }
            if(isResult){
                System.out.println(i);
            }
        }
    }
}
