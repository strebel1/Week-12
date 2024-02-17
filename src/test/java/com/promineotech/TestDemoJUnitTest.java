package com.promineotech;

import static org.assertj.core.api.Assertions.assertThat;
import static org.assertj.core.api.Assertions.assertThatThrownBy;
import static org.junit.jupiter.params.provider.Arguments.arguments;
import static org.mockito.Mockito.doReturn;
import static org.mockito.Mockito.spy;

import java.util.stream.Stream;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

class TestDemoJUnitTest {
	
	private TestDemo testDemo;

	@BeforeEach
	void setUp() throws Exception {
		testDemo = new TestDemo ();
	}

	@ParameterizedTest 
	@MethodSource("com.promineotech.TestDemoJUnitTest#argumentsForAddPositive")
	void assertThatTwoPositiveNumbersAreAddedCorrectly(int a, int b, int expected, boolean expectException) {
		// Given a numeric string to test
		
		//When the method is called the numbers are added together. 
		
		//Then positive numbers are added correctly.
		
		//addPositive add = new addPositive();
		//add.add
		


if(!expectException) {

  assertThat(testDemo.addPositive(a, b)).isEqualTo(expected);
  
} else {

assertThatThrownBy(() -> testDemo.addPositive(a, b)).isInstanceOf(IllegalArgumentException.class);
  
}
  
} 
	
	@Test 

	void assertThatPairsOfPositiveNumbersAreAddedCorrectly() {
		
		assertThat(testDemo.addPositive(4,5)).isEqualTo(9);

		assertThat(testDemo.addPositive(40,50)).isEqualTo(90);
		assertThat(testDemo.addPositive(8,4)).isEqualTo(12);
		assertThat(testDemo.addPositive(1,5)).isEqualTo(6);

		
		
	}
	@Test
	//This test asserts that two positive numbers are multiplied correctly. 
void assertThatPairsOfPositiveNumbersAreMultipliedCorrectly() {
		
		assertThat(testDemo.multiplyPositive(4,5)).isEqualTo(20);

		assertThat(testDemo.multiplyPositive(40,50)).isEqualTo(2000);
		assertThat(testDemo.multiplyPositive(8,4)).isEqualTo(32);
		assertThat(testDemo.multiplyPositive(1,5)).isEqualTo(5);
		
}
	@Test
	
	void assertThatNumberSquaredIsCorrect() {
		
		TestDemo mockDemo = spy(testDemo);
		doReturn(5).when(mockDemo).getRandomInt();
		int fiveSquared = mockDemo.randomNumberSquared();
		assertThat(fiveSquared).isEqualTo(25);
		
	}
 static	Stream<Arguments> argumentsForAddPositive(){
	 
	 return Stream.of
			  (
					  arguments(2, 4, 6, false),
					  
					  arguments(0, 1, 1, true),
					  
					  arguments(-1, 3, 2, true)
					  
					 
					 
					 
					 );
 }

 	
	}


