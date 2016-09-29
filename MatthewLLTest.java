import java.util.Arrays;

public class MatthewLLTest {
	public static boolean failVerbose;
	public static boolean passVerbose;
	
	public static void main(String[] args){
		failVerbose = true;
		passVerbose = true;
		test_testcode();
		test_constructor();
		test_addAndRemove();
	}
	
	public static void test_addAndRemove(){
		try{
			MatthewLL<Integer> list = new MatthewLL<Integer>();
			list.add(5);
			test(list.toString(), "[5]", "test_add1");
			list.add(222);
			test(list.toString(), "[5, 222]", "test_add2");
			list.remove(1);
			test(list.toString(), "[5]", "test_remove1");
			list.remove(0);
			test(list.toString(), "[]", "test_remove2");
			list.add(12);
			list.poll();
			test(list.toString(), "[]", "test_poll1");
			list.add(3);list.add(5);list.add(1);
			list.poll();
			test(list.toString(), "[5, 1]", "test_poll1");
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