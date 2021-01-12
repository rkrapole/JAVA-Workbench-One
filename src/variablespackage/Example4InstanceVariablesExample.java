package variablespackage;

/*-> this is example for "Instance Variables (Non-Static) <- if you are declaring variable globally 
 without 'static' key, then you cannot use those variables in a method unless you create a instance 
 of that class*/

public class Example4InstanceVariablesExample {

	int a = 12, b = 13, c, d;
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Example4InstanceVariablesExample inst = new Example4InstanceVariablesExample();
		inst.c = inst.a+inst.b;
  		System.out.println(inst.c);
	}

}
