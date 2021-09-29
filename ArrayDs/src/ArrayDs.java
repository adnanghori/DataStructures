import java.util.Scanner;

public class ArrayDs {
	static Object object_element,delete_object_element;
	static byte byte_element;
	static short short_element;
	static int size,sizee,int_element,choice,type,index=-1,delete_index;
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
	public static void getValue() {
		System.out.println("Enter Element To Insert:");
		if(choice==1) {
			object_element = scanner.next();
			add(object_element);
			
		}
		if(choice==2) {
			if(type==1) {
				byte_element = scanner.nextByte();
				add(byte_element);
				
				
			}
			if(type==2) {
				short_element = scanner.nextShort();
				add(short_element);
				
			}
			if(type==3) {
				int_element = scanner.nextInt();
				add(int_element);
				
			}
			if(type==4) {
				long_element= scanner.nextLong();
				add(long_element);
				
			}
			if(type==5) {
				float_element=scanner.nextFloat();
				add(float_element);
				
			}
			if(type==6) {
				double_element = scanner.nextDouble();
				add(double_element);
				
			}
			if(type==7) {
				char_element = scanner.next().charAt(0);
				add(char_element);
				
			}
			if(type==8) {
				boolean_element = scanner.nextBoolean();
				add(boolean_element);
				
			}
		}
	
	}

	public static void add(Object object_element) {
			if(index==size-1) {
				System.out.println("Full");
			}
			else {
				if(index==-1) {
					System.out.println("Inserting First Element:");
					index=0;
					object_array[index]=object_element;
					System.out.println("Object inserted at:"+index);
				}
				else {
					index++;
					object_array[index]=object_element;	
					System.out.println("Object inserted at:"+index);
				}
			}

	}
	
	public static void add(byte byte_element) {
		
		if(index==sizee-1) {
			System.out.println("Full");
		}
		else {
			if(index==-1) {
				System.out.println("Inserting First Element:");
				index=0;
				byte_array[index]=byte_element;
				System.out.println("Element Inserted At:"+index);
			}
			else {
			index++;
			byte_array[index]=byte_element;
			System.out.println("Element Inserted At:"+index);
			}
		}
	}
	public static void add(short short_element) {
		
		if(index==sizee-1) {
			System.out.println("Full");
		}
		else {
			if(index==-1) {
				System.out.println("Inserting First Element:");
				index=0;
				short_array[index]=short_element;
				System.out.println("Element Inserted At:"+index);
			}
			else {
			index++;
			short_array[index]=short_element;
			System.out.println("Element Inserted At:"+index);
			}
		}
		
	}
	public static void add(int int_element) {
		
		if(index==sizee-1) {
			System.out.println("Full");
		}
		else {
			if(index==-1) {
				System.out.println("Inserting First Element:");
				index=0;
				int_array[index]=int_element;
				System.out.println("Element Inserted At:"+index);
			}
			else {
			index++;
			int_array[index]=int_element;
			System.out.println("Element Inserted At:"+index);
			}
		}
	}
	public static void add(long long_element) {
		
		if(index==sizee-1) {
			System.out.println("Full");
		}
		else {
			if(index==-1) {
				System.out.println("Inserting First Element:");
				index=0;
				long_array[index]=long_element;
				System.out.println("Element Inserted At:"+index);
			}
			else {
			index++;
			long_array[index]=long_element;
			System.out.println("Element Inserted At:"+index);
			}
		}
	}
	public static void add(float float_element) {
		
		if(index==sizee-1) {
			System.out.println("Full");
			
		}
		else {
			if(index==-1) {
				System.out.println("Inserting First Element:");
				index=0;
				float_array[index]=float_element;
				System.out.println("Element Inserted At:"+index);
			}
			else {
			index++;
			float_array[index]=float_element;
			System.out.println("Element Inserted At:"+index);
			}
		}
		
	}
	public static void add(double double_element) {
		
		if(index==size-1) {
			System.out.println("Full");
		}
		else {
			if(index==-1) {
				System.out.println("Inserting First Element:");
				index=0;
				double_array[index]=double_element;
				System.out.println("Element Inserted At:"+index);
			}
			else {
			index++;
			double_array[index]=double_element;
			System.out.println("Element Inserted At:"+index);
			}
		}
	}
	public static void add(char char_element) {
		
		if(index==sizee-1) {
			System.out.println("Full");
		}
		else {
			if(index==-1) {
				System.out.println("Inserting First Element:");
				index=0;
				char_array[index]=char_element;
				System.out.println("Element Inserted At:"+index);
			}
			else {
			index++;
			char_array[index]=char_element;
			System.out.println("Element Inserted At:"+index);
			}
		}
		
	}
	public static void add(boolean boolean_element) {
		
		if(index==size-1) {
			System.out.println("Full");
		}
		else {
			if(index==-1) {
				System.out.println("Inserting First Element:");
				index=0;
				boolean_array[index]=boolean_element;
				System.out.println("Element Inserted At:"+index);
			}
			else {
			index++;
			boolean_array[index]=boolean_element;
			System.out.println("Element Inserted At:"+index);
			}
		}
		
	}
	public static void traverse() {
		int counter=0;
		int flag=0;
		if(index==-1) {
			System.out.println("Empty");
		}
		if(choice==1) {
		for(counter=0;counter<=index;counter++) {
			System.out.println(object_array[counter]+" At Index :"+flag);
			flag++;
		}
			
		}
		if(choice==2) {
			if(type==1) {
				for(counter=0;counter<=index;counter++) {
					System.out.println(byte_array[counter]+" At Index :"+flag);
					flag++;
				}
			}
			if(type==2) {
				for(counter=0;counter<=index;counter++) {
					System.out.println(short_array[counter]+" At Index :"+flag);
					flag++;
				}
			}
			if(type==3) {
				for(counter=0;counter<=index;counter++) {
					System.out.println(int_array[counter]+" At Index :"+flag);
					flag++;
				}
			}
			if(type==4) {
				for(counter=0;counter<=index;counter++) {
					System.out.println(long_array[counter]+" At Index :"+flag);
					flag++;
				}
			}
			if(type==5) {
				for(counter=0;counter<=index;counter++) {
					System.out.println(float_array[counter]+" At Index :"+flag);
					flag++;
				}
			}
			if(type==6) {
				for(counter=0;counter<=index;counter++) {
					System.out.println(double_array[counter]+" At Index :"+flag);
					flag++;
				}
			}
			if(type==7) {
				for(counter=0;counter<=index;counter++) {
					System.out.println(char_array[counter]+" At Index :"+flag);
					flag++;
				}
			}
			if(type==8) {
				for(counter=0;counter<=index;counter++) {
					System.out.println(boolean_array[counter]+" At Index :"+flag);
					flag++;
				}
			}
		}
	}
	public static void deleteElementEnd() {
		if(index==-1) {
			System.out.println("Empty, No Element To Delete.");
		}
		else {
			index--;
		}
		System.out.println("last element deleted");
	}
	public static void deleteElementFromIndex(){
		System.out.println("Enter Index:");
		delete_index = scanner.nextInt();
		while(delete_index!=index) {
			object_array[delete_index]=object_array[delete_index+1];
			delete_index++;
		}
		index=index-1;
	}
	
	public static void main(String[] args) {
			choice();				
			do {
				System.out.println("Operation To Perform:"+"\n"+"1. Add"+"\n"+"2. Traverse"+"\n"+"3. DeleteEnd"+"\n"+"4. DeleteFromIndex");
	
				
			int choice=scanner.nextInt();
			switch(choice) {
			case 1 : getValue(); break;
			case 2 : traverse();break;
			case 3 : deleteElementEnd();break;
			case 4 : deleteElementFromIndex();break;
			default : System.out.println("Wrong Choice");
			
		}
			}while(choice!=0);
			 
		
			
	
			}
}
