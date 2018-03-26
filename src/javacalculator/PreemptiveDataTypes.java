package javacalculator;

public class PreemptiveDataTypes {
	 byte b;
	short s;
	int i;
	long l;
	float f;

	double d;
	boolean bl;
	char ch;

	public static void main(String[] args) {
		PreemptiveDataTypes obj=new PreemptiveDataTypes();
        obj.PrintDefultValues(); 
		

	}
	public void PrintDefultValues(){

        System.out.println("byte=" + b);
		System.out.println("short=" + s);
		System.out.println("int= " + i);
		System.out.println("long= " + l);
		System.out.println("float= " + f);
		System.out.println("double= " + d);
		System.out.println("boolean= " + bl);
		System.out.println("char= " + ch);
	}

}