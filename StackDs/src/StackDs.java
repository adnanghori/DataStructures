import java.util.Scanner;

public class StackDs {
	static int choice,size,type,sizee,main_choice,index=-1;
	static Object object_element;
	static byte byte_element;
	static short short_element;
	static int int_element;
	static long long_element;
	static float float_element;
	static double double_element;
	static char char_element;
	static boolean boolean_element;
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
	public static void getValue() {
		System.out.println("Enter Element: ");
		if(choice==1) {
			object_element = scanner.next();
			push(object_element);
		}	
		if(choice==2) {
			if(type==1) {
				byte_element=scanner.nextByte();
				push(byte_element);
			}
			if(type==2) {
				short_element = scanner.nextShort();
				push(short_element);
			}
			if(type==3) {
				int_element = scanner.nextInt();
				push(int_element);
			}
			if(type==4) {
				long_element = scanner.nextLong();
				push(long_element);
			}
			if(type==5) {
				float_element = scanner.nextFloat();
				push(float_element);
			}
			if(type==6) {
				double_element = scanner.nextDouble();
				push(double_element);
			}
			if(type==7) {
				char_element = scanner.next().charAt(0);
				push(char_element);
			}
			if(type==8) {
				boolean_element = scanner.nextBoolean();
				push(boolean_element);
			}
			
			
		}
	}
		public static void push(Object object_element) {
			if(index==size-1) {
				System.out.println("Full");
			}
			else {
				if(index==-1) {
					System.out.println("Inserting First Element.");
					index=0;
					object_stack[index]=object_element;
					System.out.println("Object inserted at:"+index);
				}
				else {
					index++;
					object_stack[index]=object_element;
					System.out.println("Object inserted at:"+index);
					
				}
			}
		}
		public static void push(byte byte_element) {
			if(index==sizee-1) {
				System.out.println("Full");
			}
			else {
				if(index==-1) {
					System.out.println("Inserting First Element.");
					index=0;
					byte_stack[index]=byte_element;
					System.out.println("Object inserted at:"+index);
				}
				else {
					index++;
					byte_stack[index]=byte_element;
					System.out.println("Object inserted at:"+index);
					
				}
			}
		}
		
		public static void push(short short_element) {
			if(index==sizee-1) {
				System.out.println("Full");
			}
			else {
				if(index==-1) {
					System.out.println("Inserting First Element.");
					index=0;
					short_stack[index]=short_element;
					System.out.println("Object inserted at:"+index);
				}
				else {
					index++;
					short_stack[index]=short_element;
					System.out.println("Object inserted at:"+index);
					
				}
			}
		}
		public static void push(int int_element) {
			if(index==sizee-1) {
				System.out.println("Full");
			}
			else {
				if(index==-1) {
					System.out.println("Inserting First Element.");
					index=0;
					int_stack[index]=int_element;
					System.out.println("Object inserted at:"+index);
				}
				else {
					index++;
					int_stack[index]=int_element;
					System.out.println("Object inserted at:"+index);
					
				}
			}
		}
		public static void push(long long_element) {
			if(index==sizee-1) {
				System.out.println("Full");
			}
			else {
				if(index==-1) {
					System.out.println("Inserting First Element.");
					index=0;
					long_stack[index]=long_element;
					System.out.println("Object inserted at:"+index);
				}
				else {
					index++;
					long_stack[index]=long_element;
					System.out.println("Object inserted at:"+index);
					
				}
			}
		}
		public static void push(float float_element) {
			if(index==sizee-1) {
				System.out.println("Full");
			}
			else {
				if(index==-1) {
					System.out.println("Inserting First Element.");
					index=0;
					float_stack[index]=float_element;
					System.out.println("Object inserted at:"+index);
				}
				else {
					index++;
					float_stack[index]=float_element;
					System.out.println("Object inserted at:"+index);
					
				}
			}
		}
		public static void push(double double_element) {
			if(index==sizee-1) {
				System.out.println("Full");
			}
			else {
				if(index==-1) {
					System.out.println("Inserting First Element.");
					index=0;
					double_stack[index]=double_element;
					System.out.println("Object inserted at:"+index);
				}
				else {
					index++;
					double_stack[index]=double_element;
					System.out.println("Object inserted at:"+index);
					
				}
			}
		}
		public static void push(char char_element) {
			if(index==sizee-1) {
				System.out.println("Full");
			}
			else {
				if(index==-1) {
					System.out.println("Inserting First Element.");
					index=0;
					char_stack[index]=char_element;
					System.out.println("Object inserted at:"+index);
				}
				else {
					index++;
					char_stack[index]=char_element;
					System.out.println("Object inserted at:"+index);
					
				}
			}
		}
		public static void push(boolean boolean_element) {
			if(index==sizee-1) {
				System.out.println("Full");
			}
			else {
				if(index==-1) {
					System.out.println("Inserting First Element.");
					index=0;
					boolean_stack[index]=boolean_element;
					System.out.println("Object inserted at:"+index);
				}
				else {
					index++;
					boolean_stack[index]=boolean_element;
					System.out.println("Object inserted at:"+index);
					
				}
			}
		}
		public static void pop() {
			if(index==-1) {
				System.out.println("Empty.!");
			}
			else {
				System.out.println("Element At Index "+index+" Popped");
				index--;
	}
			
		}
		public static void peek() {
			
		}
		
		public static void main(String[] args) {
		choice();

		do {
			System.out.println("Operation To Perform:"+"\n"+"1. Push"+"\n"+"2. Pop"+"\n"+"3. Peek"+"\n"+"4. Traverse"+"\n"+"5. Exit");
			main_choice = scanner.nextInt();
			switch(main_choice) {
			case 1 : getValue(); break;
			case 2 : pop();break;
	//		case 3 : deleteElementEnd();break;
		//	case 4 : deleteElementFromIndex();break;
						
		}
		}while(main_choice!=0);

	}
}
