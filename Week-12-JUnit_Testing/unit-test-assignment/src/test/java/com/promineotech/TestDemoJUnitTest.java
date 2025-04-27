package com.promineotech;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;

import static org.assertj.core.api.Assertions.assertThat;
import static org.assertj.core.api.Assertions.assertThatThrownBy;

import java.util.stream.Stream;
import org.junit.jupiter.params.provider.Arguments;
import static org.junit.jupiter.params.provider.Arguments.arguments;
import static org.mockito.Mockito.doReturn;
import static org.mockito.Mockito.spy;

import org.junit.jupiter.params.provider.MethodSource;

class TestDemoJUnitTest {
	private TestDemo testDemo;
	
	@BeforeEach
	void setUp() throws Exception {
		testDemo = new TestDemo();
	}

	// Section 2
	@ParameterizedTest
	@MethodSource("com.promineotech.TestDemoJUnitTest#argumentsForAddPositive")
	void assertThatTwoPositiveNumbersAreAddedCorrectly(int a, int b, int expected, boolean expectException) {
		if (!expectException) {
			assertThat(testDemo.addPositive(a, b)).isEqualTo(expected);
		} else {
			assertThatThrownBy(() -> testDemo.addPositive(a, b)).isInstanceOf(IllegalArgumentException.class);
		}

	}
	
	static Stream<Arguments> argumentsForAddPositive() {
		return Stream.of(arguments(2, 4, 6, false), // expected pass
						 arguments(2, 4, 6, true),  // expected exception but params pass
						 arguments(1, 1, 3, false), // expected fail w/o exception
						 arguments(0, 0, 0, false), // expected exception
						 arguments(2, 0, 0, false), // expected exception
						 arguments(-2, -4, -6, true), // expected pass since expected exception
						 arguments(0, 1, 6, false), // expected exception
						 arguments(1, -1, 0, true)); // expected pass
	}
	
	@Test
	void assertThatPairsOfPositiveNumbersAreAddedCorrectly() {
		assertThat(testDemo.addPositive(4,5)).isEqualTo(9); // expected pass
		assertThat(testDemo.addPositive(40,50)).isEqualTo(90); // expected pass
		assertThat(testDemo.addPositive(4,5)).isEqualTo(8); // expected fail
	}

	// Section 3
	@ParameterizedTest
	@MethodSource("com.promineotech.TestDemoJUnitTest#argumentsForMultiplyPositive")
	void assertThatTwoPositiveNumbersAreMultipliedCorrectly(int a, int b, int expected, boolean expectException) {
		if (!expectException) {
			assertThat(testDemo.multiplyPositive(a, b)).isEqualTo(expected);
		} else {
			assertThatThrownBy(() -> testDemo.multiplyPositive(a, b)).isInstanceOf(IllegalArgumentException.class);
		}

	}
	
	static Stream<Arguments> argumentsForMultiplyPositive() {
		// run the following individual tests with the following data
		return Stream.of(arguments(2, 4, 8, false), // expected pass
						 arguments(2, 4, 8, true), // expected exception but params pass
						 arguments(1, 1, 3, false), // expected fail w/o exception
						 arguments(0, 0, 0, false), // expected exception
						 arguments(2, 0, 0, false), // expected exception
						 arguments(-2, -4, 8, true), // expected pass since expected exception
						 arguments(0, 1, 1, false), // expected exception
						 arguments(1, -1, -1, true)); // expected pass
	}
	
	@Test
	void assertThatPairsOfPositiveNumbersAreMultipliedCorrectly() {
		assertThat(testDemo.multiplyPositive(4,5)).isEqualTo(20);     // expected pass
		assertThat(testDemo.multiplyPositive(40,50)).isEqualTo(2000); // expected pass
		assertThat(testDemo.multiplyPositive(4,5)).isEqualTo(19);     // expected fail
	}
	
	// Section 4
	@Test
	void assertThatNumberSquaredIsCorrect() {
		TestDemo mockDemo = spy(testDemo);
		
		doReturn(5).when(mockDemo).getRandomInt();
		int fiveSquared = mockDemo.randomNumberSquared();
		assertThat(fiveSquared).isEqualTo(25);
	}
}
