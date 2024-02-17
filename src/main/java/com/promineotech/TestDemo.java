package com.promineotech;

import java.util.Random;

public class TestDemo {

	public int addPositive(int a, int b) {
		
		if ( a > 0 && b > 0) {
			
		return a + b; 
		}
		
		else {
			throw new IllegalArgumentException("Both parameters must be positive!"); 
		}
	}
	//This method multiplies two positive numbers. 
	
public int multiplyPositive(int a, int b) {
		
		if ( a > 0 && b > 0) {
			
		return ( a * b); 
		}
		
		else {
			throw new IllegalArgumentException("Both parameters must be positive!"); 
		}
//These are the methods for random number squared. 
		
}

	int getRandomInt() {
        Random random = new Random();
        return random.nextInt(10) + 1;
    }

    public int randomNumberSquared() {
        int randomNum = getRandomInt();
        return randomNum * randomNum;
    }
		
		



}


