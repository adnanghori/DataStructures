import java.util.Scanner;

public class QueueDs {
	static Scanner scanner = new Scanner(System.in);
	static int choice,size,sizee,type,main_choice;
	static Object[] object_queue;
	static byte[] byte_queue;
	static short[] short_queue;
	static int[] int_queue;
	static long[] long_queue;
	static float[] float_queue;
	static double[] double_queue;
	static char[] char_queue;
	static boolean[] boolean_queue;
	
	public static void choice() {
		System.out.println("Enter Your Choice:"+"\n"+"1. Object"+"\n"+"2. Primitive");
		choice = scanner.nextInt();
		
		switch(choice) {
		case 1 :System.out.println("Enter Size: ");
		 		size = scanner.nextInt(); 	 
				object_queue = new Object[size];break;
		case 2 : System.out.println("1. byte "+ "\n"+"2. short " + "\n"+ "3. int"+"\n"+ "4. long"+"\n"+"5. float"+"\n"+"6. double"+"\n"+"7. char"+"\n"+"8. boolean");
		  		 type = scanner.nextInt();
		  		 System.out.println("Enter Size: ");
		 		 sizee = scanner.nextInt();
		 		 switch(type) {
		 		case 1 :    byte_queue = new byte[sizee];break;
				case 2 :    short_queue = new short[sizee];break;
				case 3 :    int_queue = new int[sizee];break;
				case 4 :    long_queue = new long[sizee];break;
				case 5 :    float_queue = new float[sizee];break;
				case 6 :    double_queue = new double[sizee];break;
				case 7 :    char_queue = new char[sizee];break;
				case 8 :    boolean_queue = new boolean[sizee];break;
		 }break;	
		}
	}
	public static void main(String[] args) {
		choice();
		do {
			System.out.println("Operation To Perform:"+"\n"+"1. Push"+"\n"+"2. Pop"+"\n"+"3. Peek"+"\n"+"4. Traverse"+"\n"+"5. Exit");
			main_choice = scanner.nextInt();
			switch(main_choice) {
			//case 1 : enQueue(); break;
			//case 2 : deQueue();break;
			//case 3 : peek();break;
			//case 4 : traverse();break;
						
		}
		}while(main_choice!=5);

	}
	}


