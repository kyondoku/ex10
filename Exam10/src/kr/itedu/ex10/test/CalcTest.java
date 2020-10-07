package kr.itedu.ex10.test;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import kr.itedu.ex10.Calc;

class CalcTest {

	@Test
	void test() {
		int n1; int n2; int sum;
		n1 = 1;
		n2 = 1;
		sum = n1 + n2;
		assertEquals(sum, Calc.sum(n1, n2));
		
		n1 = 2;
		n2 = 3;
		sum = n1 + n2;
		assertEquals(sum, Calc.sum(n1, n2));
		
		n1 = 4;
		n2 = 5;
		sum = n1 + n2;
		assertEquals(sum, Calc.sum(n1, n2));
	}

}
