package main_package;

public class jenkins_test_main {
	
	public static void main(String[] args)
	{
		System.out.println("Hello Jenkins");
		
		float result = addSomeNumbers(1.0f,2.0f,3.0f,4.0f);
		
		System.out.println("Result is "+result);
	}
	
	public static float addSomeNumbers(float... numbers)
	{
		float total=0.0f;
		
		for(float number:numbers)
		{
			total+=number;
		}
		return total;
	}

}
