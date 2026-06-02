package LanguageFundamentals;
//in java variables are 3 types based on position
//1.static  2.instance  3.local
//based on value 1.primitive  2.object

public class TypesOfVariables {
	//primitive+instance
	int id;
	//object+instance
	String name;
	//primitive+static
	static int collegeid=1;
	//object+static
	static String collegename="v cube";

	public static void main(String[] args) {
		TypesOfVariables t1=new TypesOfVariables();
		t1.id=1;
		t1.name="archana";
		//accessing instance data
		System.out.println(t1.id);
		System.out.println(t1.name);
//accessing static data 3 ways 1.directly 2. using class_name.data 3.obj_ref_var.data
		System.out.println(collegeid);
		System.out.println(collegename);//directly
		System.out.println(TypesOfVariables.collegeid);
		System.out.println(TypesOfVariables.collegename);//using class name
		System.out.println(t1.collegeid);
		System.out.println(t1.collegename);//using obj ref variable
	//	but if object is null then no impact on static data has no impact
	//so we can use but not recomended to access static data with obj_ref_variable
		TypesOfVariables t2=new TypesOfVariables();
		t2=null;
		System.out.println(t2.collegeid);//no impact even t2 is null
		System.out.println(t2.collegename);
		
		//System.out.println(t2.id);//you will get null pointer exception
		//System.out.println(t2.name);
	//var allowed inside methods only
		var a=10;
		var b="java";
		var c='m';
		var d=true;
		System.out.println(a);
		System.out.println(b);
		System.out.println(c);
		System.out.println(d);
//*** static can not be used inside methods
//***only final permitted for local variables
		
		
	}

}
