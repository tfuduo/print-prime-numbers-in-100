package com.github.hcsp.controlflow;

public class Main {
    public static void main(String[] args) {
        printPrimeNumbers();
    }
    public static void printPrimeNumbers() {
	System.out.println(2);
        for(int i=2;i<100;i++){
 	    boolean isPr=true;
	    for(int j=2;j<Math.sqrt(i)+1;j++){
	        if(i%j==0)//is not prime
		    {isPr=false;break;}
	    }
	    if(isPr)
	        System.out.println(i);
	}
    }
}
