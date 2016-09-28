import java.util.Arrays;

public class MatthewLLTest {
	public static boolean failVerbose;
	public static boolean passVerbose;
	
	public static void main(String[] args){
		failVerbose = true;
		passVerbose = true;
		test_testcode();
		test_constructor();
		test_add();
	}
	
	public static void test_add(){
		try{
			MatthewLL<Integer> addList = new MatthewLL<Integer>();
			addList.add(5);
			test(addList.toString(), "[5]", "test_add1");
		} catch (Exception e){
			if(failVerbose){
				println("** FAILED: test_constructor1");
				println("caught exception:");
				println(e.getMessage());
			}
		}
	}
	
	public static void test_constructor(){
		try{
			MatthewLL<Integer> matthewList = new MatthewLL<Integer>();
			if(passVerbose)
				println("passed: test_constructor1");
			test(matthewList.size(), 0, "test_constructor2");
		} catch (Exception e){
			if(failVerbose){
				println("** FAILED: test_constructor1");
				println("caught exception:");
				println(e.getMessage());
			}
		}
	}
	
	public static void test_testcode(){
		int a = 3;
		int b = 3;
		test(a,b,"test_testcode1");
		
		int[] c = {4,5,6};
		int[] d = c;
		test_Array(c,d,"test_testcode2");
		
		int[] e = {4,5,6};
		test_Array(c,e,"test_testcode3");
	}
	
	
	
	// output methods
	public static void print(Object o){
		System.out.print(o);
	}
	
	public static void println(Object o){
		System.out.println(o);
	}
	
	public static void test(Object one, Object two, String testName){
		boolean equal = one.equals(two);
		if (!equal && failVerbose){
			println("** FAILED: " + testName);
			println("one toString: " + one);
			println("two toString: " + two);
		}
		else if(passVerbose)
			println("passed: " + testName);
	}
	
	public static void test_Array(int[] one, int[] two, String testName){
		boolean equal = Arrays.equals(one, two);
		if (!equal && failVerbose){
			println("** FAILED: " + testName);
			println("one toString: " + Arrays.toString(one));
			println("two toString: " + Arrays.toString(two));
		}
		else if(passVerbose)
			println("passed: " + testName);
	}
	
	public static void test_Array(String[] one, String[] two, String testName){
		boolean equal = Arrays.equals(one, two);
		if (!equal && failVerbose){
			println("** FAILED: " + testName);
			println("one toString: " + Arrays.toString(one));
			println("two toString: " + Arrays.toString(two));
		}
		else if(passVerbose)
			println("passed: " + testName);
	}
	
	public static void test_Array(double[] one, double[] two, String testName){
		boolean equal = Arrays.equals(one, two);
		if (!equal && failVerbose){
			println("** FAILED: " + testName);
			println("one toString: " + Arrays.toString(one));
			println("two toString: " + Arrays.toString(two));
		}
		else if(passVerbose)
			println("passed: " + testName);
	}
}