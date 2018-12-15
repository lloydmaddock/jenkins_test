package test;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class TestAddSomeNumbers {

	@Test
	void test() {
		float result = main.jenkins_test_main.addSomeNumbers(1.0f,2.0f,3.0f,4.0f);
		
		assert(result==10.0f);
	}
}
