package learning.app;

public class ABC {

	public static void main(String[] args) {
		System.out.println("Hello");
		System.out.println("Hello 12");
		dosomething();
	}
	
	static void dosomething(){
		
		int age=17;
		String result=(age>=18)?"Ok":"not ok";
		System.out.println(result);
	}
}
