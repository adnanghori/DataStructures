import java.util.Scanner;

public class StackDs {
	static int choice,size,type,sizee,main_choice;
	static Object [] object_stack;
	static byte[] byte_stack;
	static short[] short_stack;
	static int[] int_stack;
	static long[] long_stack;
	static float[] float_stack;
	static double[] double_stack;
	static char[] char_stack;
	static boolean[] boolean_stack;
	static Scanner scanner = new Scanner(System.in);
	
	public static void choice() {
		System.out.println("Enter Your Choice:"+"\n"+"1. Object"+"\n"+"2. Primitive");
		choice = scanner.nextInt();
		switch(choice) {
		case 1 : System.out.println("Enter Size: ");
				 size = scanner.nextInt();
				 object_stack = new Object[size];
				 break;
		
		case 2 :  System.out.println("1. byte "+ "\n"+"2. short " + "\n"+ "3. int"+"\n"+ "4. long"+"\n"+"5. float"+"\n"+"6. double"+"\n"+"7. char"+"\n"+"8. boolean");
				  type = scanner.nextInt();
				  System.out.println("Enter Size: ");
				  sizee = scanner.nextInt();
		switch(type) {
		case 1 :    byte_stack = new byte[sizee];break;
		case 2 :    short_stack = new short[sizee];break;
		case 3 :    int_stack = new int[sizee];break;
		case 4 :    long_stack = new long[sizee];break;
		case 5 :    float_stack = new float[sizee];break;
		case 6 :    double_stack = new double[sizee];break;
		case 7 :    char_stack = new char[sizee];break;
		case 8 :    boolean_stack = new boolean[sizee];break;
		}
		}
	}
		public static void push() {
			
		}
	public static void main(String[] args) {
		choice();

		do {
			System.out.println("Operation To Perform:"+"\n"+"1. Push"+"\n"+"2. Pop"+"\n"+"3. Peek"+"\n"+"4. Traverse"+"\n"+"5. Exit");
			main_choice = scanner.nextInt();
			switch(main_choice) {
		//	case 1 : getValue(); break;
	//		case 2 : traverse();break;
	//		case 3 : deleteElementEnd();break;
		//	case 4 : deleteElementFromIndex();break;
						
		}
		}while(main_choice!=0);

	}
}
