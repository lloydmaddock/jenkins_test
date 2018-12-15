package main_package;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class TestAddSomeNumbers {

	@Test
	void test() {
		float result = jenkins_test_main.addSomeNumbers(1.0f,2.0f,3.0f,4.0f);
		
		assert(result==9.0f);
	}

}
