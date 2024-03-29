package main;

/**
 * Created by ldrygala on 2015-01-23.
 * F1	F2	F3	F4	F5	F6	F7	F8	F9	F10	F11	F12	F13	F14	F15	F16	F17	  F18	F19
 1	1	2	3	5	8	13	21	34	55	89	144	233	377	610	987	1597  2584	4181
 */
/*
fn - Fn
 */
public class Fibonaci {
	public static void main(String[] args){
		int n = 10;
		System.out.printf("%d-th number of Fibonacci number is %d\n", n, fib(n));
	}
    public static long fib(int n) {
    	if(n == 0){
    		return 0;
    	}
    	else if(n == 1){
    		return 1;
    	}
    	else{
        	long value = 0;
        	long prev = 0;
        	long next = 1;
    		for(int i = 2;i <= n;i++){
    			value = prev + next;
    			prev = next;
    			next = value;
    		}
    		return value;
    	}
  }
}
