package test.java;

import static org.junit.jupiter.api.Assertions.*;

import main.java.jenkins_test_main;

import org.junit.jupiter.api.Test;

class jenkins_unit_tests {

	@Test
	void test() {
		float result = main.java.jenkins_test_main.addSomeNumbers(1.0f,2.0f,3.0f,4.0f);
		
		assert(result==10.0f);
	}

}