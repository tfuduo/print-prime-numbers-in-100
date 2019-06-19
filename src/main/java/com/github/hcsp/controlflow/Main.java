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
        for(int i=3;i<=100;i+=2){
            if(isFindNum(i)){
                System.out.println(i);
            }
        }
    }

    public static boolean isFindNum(int n){
        boolean res = true;
        for(int i=3;i<Math.sqrt(n)+1;i+=2){
            if(n/i==0||n%i==0){
                res = false;
                break;
            }
        }
        return res;
    }
}
