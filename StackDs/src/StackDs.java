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
			if(choice==1) {
				if(index==0) {
					System.out.println("Last Element "+object_stack[index]+" Popped");
					index--;
				}
				else {
				System.out.println("Element "+object_stack[index]+" Popped");
				index--;
				}
			}
			if(choice==2) {
				if(type==1) {
					if(index==0) {
						System.out.println("Last Element "+byte_stack[index]+" Popped");
						index--;
					}
					else {
					System.out.println("Element "+byte_stack[index]+" Popped");
					index--;
					}
				}
				if(type==2) {
					if(index==0) {
						System.out.println("Last Element "+short_stack[index]+" Popped");
						index--;
					}
					else {
					System.out.println("Element "+short_stack[index]+" Popped");
					index--;
					}
				}
				if(type==3) {
					if(index==0) {
						System.out.println("Last Element "+int_stack[index]+" Popped");
						index--;
					}
					else {
					System.out.println("Element "+int_stack[index]+" Popped");
					index--;
					}
				}
				if(type==4) {
					if(index==0) {
						System.out.println("Last Element "+byte_stack[index]+" Popped");
						index--;
					}
					else {
					System.out.println("Element "+long_stack[index]+" Popped");
					index--;
					}
				}
				if(type==5) {
					if(index==0) {
						System.out.println("Last Element "+byte_stack[index]+" Popped");
						index--;
					}
					else {
					System.out.println("Element "+float_stack[index]+" Popped");
					index--;
					}
				}
				if(type==6) {
					if(index==0) {
						System.out.println("Last Element "+byte_stack[index]+" Popped");
						index--;
					}
					else {
					System.out.println("Element "+double_stack[index]+" Popped");
					index--;
					}
				}
				if(type==7) {
					if(index==0) {
						System.out.println("Last Element "+byte_stack[index]+" Popped");
						index--;
					}
					else {
					System.out.println("Element "+char_stack[index]+" Popped");
					index--;
					}
				}
				if(type==8) {
					if(index==0) {
						System.out.println("Last Element "+byte_stack[index]+" Popped");
						index--;
					}
					else {
					System.out.println("Element "+boolean_stack[index]+" Popped");
					index--;
					}
				}
			}
	}
			
		
		public static void peek() {
			if(index==-1) {
				System.out.println("Empty.!");
			}
			if(choice==1&&index>-1) {
				System.out.println("Top Element "+object_stack[index]);
			}
			if(choice==2&&index>-1) {
				if(type==1) {
					System.out.println("Top Element "+byte_stack[index]);
				}
				if(type==2) {
					System.out.println("Top Element "+short_stack[index]);
				}
				if(type==3) {
					System.out.println("Top Element "+int_stack[index]);
				}
				if(type==4) {
					System.out.println("Top Element "+long_stack[index]);
				}
				if(type==5) {
					System.out.println("Top Element "+float_stack[index]);
				}
				if(type==6) {
					System.out.println("Top Element "+double_stack[index]);
				}
				if(type==7) {
					System.out.println("Top Element "+char_stack[index]);
				}
				if(type==8) {
					System.out.println("Top Element "+boolean_stack[index]);
				}
			}
			
		}
		public static void traverse() {
			int counter=0;
			int flag=0;
			if(index==-1) {
				System.out.println("Empty.!");
			}
			if(choice==1) {
				for(counter=0;counter<=index;counter++) {
					System.out.println("Element: "+object_stack[counter]+" At Index: "+flag);
					flag++;
				}
			}
			if(choice==2) {
				if(type==1) {
					for(counter=0;counter<=index;counter++) {
						System.out.println("Element: "+byte_stack[counter]+" At Index: "+flag);
						flag++;
					}
				}
				if(type==2) {
					for(counter=0;counter<=index;counter++) {
						System.out.println("Element: "+short_stack[counter]+" At Index: "+flag);
						flag++;
					}
				}
				if(type==3) {
					for(counter=0;counter<=index;counter++) {
						System.out.println("Element: "+int_stack[counter]+" At Index: "+flag);
						flag++;
					}
				}
				if(type==4) {
					for(counter=0;counter<=index;counter++) {
						System.out.println("Element: "+long_stack[counter]+" At Index: "+flag);
						flag++;
					}
				}
				if(type==5) {
					for(counter=0;counter<=index;counter++) {
						System.out.println("Element: "+float_stack[counter]+" At Index: "+flag);
						flag++;
					}
				
				}
				if(type==6) {
					for(counter=0;counter<=index;counter++) {
						System.out.println("Element: "+double_stack[counter]+" At Index: "+flag);
						flag++;
					}
				}
				if(type==7) {
					for(counter=0;counter<=index;counter++) {
						System.out.println("Element: "+char_stack[counter]+" At Index: "+flag);
						flag++;
					}
				}
				if(type==8) {
					for(counter=0;counter<=index;counter++) {
						System.out.println("Element: "+boolean_stack[counter]+" At Index: "+flag);
						flag++;
					}
				}
			}
		}
		public static void main(String[] args) {
		choice();

		do {
			System.out.println("Operation To Perform:"+"\n"+"1. Push"+"\n"+"2. Pop"+"\n"+"3. Peek"+"\n"+"4. Traverse"+"\n"+"5. Exit");
			main_choice = scanner.nextInt();
			switch(main_choice) {
			case 1 : getValue(); break;
			case 2 : pop();break;
			case 3 : peek();break;
			case 4 : traverse();break;
						
		}
		}while(main_choice!=5);

	}
}
