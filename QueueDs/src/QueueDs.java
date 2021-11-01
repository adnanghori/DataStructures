import java.util.Scanner;

public class QueueDs {
	static Scanner scanner = new Scanner(System.in);
	static int choice,size,sizee,type,main_choice,front=-1,rear=-1;
	static Object[] object_queue;
	static byte[] byte_queue;
	static short[] short_queue;
	static int[] int_queue;
	static long[] long_queue;
	static float[] float_queue;
	static double[] double_queue;
	static char[] char_queue;
	static boolean[] boolean_queue;
	static Object object_element;
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
	public static void getValue() throws InterruptedException {
		System.out.println("Enter Element: ");
		if(choice==1) {
			object_element = scanner.next();
			enQueue(object_element);
		}
		if(choice==2) {
			
		}
	}
	public static boolean isEmpty() {
		if(front==-1&&rear==-1) {
			return true;
		}
		else return false;
	}
	public static boolean isFull() {
		if(front==0&&rear==size-1||front==0&&rear==sizee-1) {
			return true;
		}
		else return false;
	}
	public static void enQueue(Object object_element) throws InterruptedException {
		if(isFull()) {
			System.out.println("Full");
		}
		if(isEmpty()) {
			System.out.println("Going To Insert First Element.!");
			Thread.sleep(1000);
			rear++;
			object_queue[rear] = object_element;	
			System.out.println("Element Inserted At:"+rear);
		}
		else {
			System.out.println("Inserting Element.!");
			Thread.sleep(1000);
			rear++;
			object_queue[rear] = object_element;
			System.out.println("Element Inserted At:"+rear);
		}
	}
	public static void enQueue(byte byte_element) throws InterruptedException {
		if(isFull()) {
			System.out.println("Full");
		}
		if(isEmpty()) {
			System.out.println("Going To Insert First Element.!");
			Thread.sleep(1000);
			rear++;
			byte_queue[rear] = byte_element;	
			System.out.println("Element Inserted At:"+rear);
		}
		else {
			System.out.println("Inserting Element.!");
			Thread.sleep(1000);
			rear++;
			byte_queue[rear] = byte_element;
			System.out.println("Element Inserted At:"+rear);
		}
	}public static void enQueue(short short_element) throws InterruptedException {
		if(isFull()) {
			System.out.println("Full");
		}
		if(isEmpty()) {
			System.out.println("Going To Insert First Element.!");
			Thread.sleep(1000);
			rear++;
			short_queue[rear] = short_element;	
			System.out.println("Element Inserted At:"+rear);
		}
		else {
			System.out.println("Inserting Element.!");
			Thread.sleep(1000);
			rear++;
			short_queue[rear] = short_element;
			System.out.println("Element Inserted At:"+rear);
		}
	}public static void enQueue(int int_element) throws InterruptedException {
		if(isFull()) {
			System.out.println("Full");
		}
		if(isEmpty()) {
			System.out.println("Going To Insert First Element.!");
			Thread.sleep(1000);
			rear++;
			int_queue[rear] = int_element;	
			System.out.println("Element Inserted At:"+rear);
		}
		else {
			System.out.println("Inserting Element.!");
			Thread.sleep(1000);
			rear++;
			int_queue[rear] = int_element;
			System.out.println("Element Inserted At:"+rear);
		}
	}public static void enQueue(long long_element) throws InterruptedException {
		if(isFull()) {
			System.out.println("Full");
		}
		if(isEmpty()) {
			System.out.println("Going To Insert First Element.!");
			Thread.sleep(1000);
			rear++;
			long_queue[rear] = long_element;	
			System.out.println("Element Inserted At:"+rear);
		}
		else {
			System.out.println("Inserting Element.!");
			Thread.sleep(1000);
			rear++;
			long_queue[rear] = long_element;
			System.out.println("Element Inserted At:"+rear);
		}
	}public static void enQueue(float float_element) throws InterruptedException {
		if(isFull()) {
			System.out.println("Full");
		}
		if(isEmpty()) {
			System.out.println("Going To Insert First Element.!");
			Thread.sleep(1000);
			rear++;
			float_queue[rear] = float_element;	
			System.out.println("Element Inserted At:"+rear);
		}
		else {
			System.out.println("Inserting Element.!");
			Thread.sleep(1000);
			rear++;
			float_queue[rear] = float_element;
			System.out.println("Element Inserted At:"+rear);
		}
	}public static void enQueue(double double_element) throws InterruptedException {
		if(isFull()) {
			System.out.println("Full");
		}
		if(isEmpty()) {
			System.out.println("Going To Insert First Element.!");
			Thread.sleep(1000);
			rear++;
			double_queue[rear] = double_element;	
			System.out.println("Element Inserted At:"+rear);
		}
		else {
			System.out.println("Inserting Element.!");
			Thread.sleep(1000);
			rear++;
			double_queue[rear] = double_element;
			System.out.println("Element Inserted At:"+rear);
		}
	}public static void enQueue(char char_element) throws InterruptedException {
		if(isFull()) {
			System.out.println("Full");
		}
		if(isEmpty()) {
			System.out.println("Going To Insert First Element.!");
			Thread.sleep(1000);
			rear++;
			char_queue[rear] = char_element;	
			System.out.println("Element Inserted At:"+rear);
		}
		else {
			System.out.println("Inserting Element.!");
			Thread.sleep(1000);
			rear++;
			char_queue[rear] = char_element;
			System.out.println("Element Inserted At:"+rear);
		}
	}public static void enQueue(boolean boolean_element) throws InterruptedException {
		if(isFull()) {
			System.out.println("Full");
		}
		if(isEmpty()) {
			System.out.println("Going To Insert First Element.!");
			Thread.sleep(1000);
			rear++;
			boolean_queue[rear] = boolean_element;	
			System.out.println("Element Inserted At:"+rear);
		}
		else {
			System.out.println("Inserting Element.!");
			Thread.sleep(1000);
			rear++;
			boolean_queue[rear] = boolean_element;
			System.out.println("Element Inserted At:"+rear);
		}
		
	}
	public static void main(String[] args) throws InterruptedException {
		choice();
		do {
			System.out.println("Operation To Perform:"+"\n"+"1. EnQueue"+"\n"+"2. DeQueue"+"\n"+"3. Traverse"+"\n"+"4. Exit");
			main_choice = scanner.nextInt();
			switch(main_choice) {
			case 1 : getValue(); break;
			//case 2 : deQueue();break;
			//case 3 : peek();break;
			//case 4 : traverse();break;
						
		}
		}while(main_choice!=4);

	}
	
}


