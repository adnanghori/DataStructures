import java.util.Scanner;

public class ArrayDs {
	static byte byte_element;
	static short short_element;
	static int size,sizee,int_element,choice,type,counter=0;
	static long long_element;
	static float float_element;
	static double double_element;
	static char char_element;
	static boolean boolean_element;
	static Object[] object_array;
	static byte [] byte_array;
	static short [] short_array;
	static int[] int_array;
	static long[] long_array;
	static float[] float_array;
	static double[] double_array;
	static char[] char_array;
	static boolean[] boolean_array;
	static int index=-1;
	static Object object;
	static Scanner scanner = new Scanner(System.in);
	public static void choice() {
		System.out.println("Which Type Of Values To Store: " +"\n"+ "1. Object " +"\n"+ "2. Primitive");
		
		choice = scanner.nextInt();
		
		switch(choice) {
		case 1 : System.out.println("Enter Size:");
				 size =scanner.nextInt();
				 object_array = new Object[size];
				 break;
		case 2 : System.out.println("1. byte "+ "\n"+"2. short " + "\n"+ "3. int"+"\n"+ "4. long"+"\n"+"5. float"+"\n"+"6. double"+"\n"+"7. char"+"\n"+"8. boolean"); 
				 type=scanner.nextInt();
				 System.out.println("Enter Size:");
				 sizee =scanner.nextInt();
		switch(type)
		{
		case 1 :    byte_array = new byte[sizee];break;
		case 2 :    short_array = new short[sizee];break;
		case 3 :    int_array = new int[sizee];break;
		case 4 :    long_array = new long[sizee];break;
		case 5 :    float_array = new float[sizee];break;
		case 6 :    double_array = new double[sizee];break;
		case 7 :    char_array = new char[sizee];break;
		case 8 :    boolean_array = new boolean[sizee];break;
 		}
		break;
	
		}
	}
	public static void check() {
		System.out.println("Enter Element To Insert:");
		if(choice==1) {
			object = scanner.next();
			add(object);
			System.out.println("Object inserted at:"+index);
		}
		if(choice==2) {
			if(type==1) {
				byte_element = scanner.nextByte();
				//add method for byte
			}
			if(type==2) {
				short_element = scanner.nextShort();
				//add method for short
			}
			if(type==3) {
				int_element = scanner.nextInt();
				//add method for int
			}
			if(type==4) {
				long_element= scanner.nextLong();
				//add method for long
			}
			if(type==5) {
				float_element=scanner.nextFloat();
				//add method for float
			}
			if(type==6) {
				double_element = scanner.nextDouble();
				//add method for double
			}
			if(type==7) {
				char_element = scanner.next().charAt(0);
				//add method for char
			}
			if(type==8) {
				boolean_element = scanner.nextBoolean();
				//add method for boolean
			}
		}
	}
	public static void add(Object object) {
		if(index==-1) {
			index++;
			object_array[index]=object;
		}
		else {
			index++;
			object_array[index]=object;
			
		}
	}
	public static void traverse() {
		if(choice==1) {
			
			for(Object object:object_array) {
				System.out.println(object_array[counter]);
				counter++;
			}
		}
		if(choice==2) {
			if(type==1) {
				for(byte bite : byte_array) {
					System.out.println(byte_array[counter]);
					counter++;
				}
			}
			if(type==2) {
				short_element = scanner.nextShort();
				//add method for short
			}
			if(type==3) {
				int_element = scanner.nextInt();
				//add method for int
			}
			if(type==4) {
				long_element= scanner.nextLong();
				//add method for long
			}
			if(type==5) {
				float_element=scanner.nextFloat();
				//add method for float
			}
			if(type==6) {
				double_element = scanner.nextDouble();
				//add method for double
			}
			if(type==7) {
				char_element = scanner.next().charAt(0);
				//add method for char
			}
			if(type==8) {
				boolean_element = scanner.nextBoolean();
				//add method for boolean
			}
		}
	}
	public static void main(String[] args) {
			choice();				
			while(choice!=0) {
				System.out.println("Operation To Perform:"+"\n"+"1. Add"+"\n"+"2. Traverse");
				int choice=scanner.nextInt();
			switch(choice) {
			case 1 : check(); break;
			case 2 : traverse();break;
			default : System.out.println("Wrong Choice");
			}
	//		check();
//			traverse();
			 
		
	}}
}
