package LogicalStatements;

import java.util.Scanner;

public class SwitchWithYield {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter weak day :");
		String day=sc.next();
		String info=getDay(day);
		System.out.println(info);

	}
	static String getDay(String day) {
		String info=switch(day) {
		case "mon"->{System.out.println("monday is lazy day");
		               yield "lazy";
		             }
		case "tue","wed","thu"->{System.out.println("activ days");
        yield "active";
      }
		case "fri"->{System.out.println("weakend mode");
        yield "chill";
      }
		case "sat","sun"->{System.out.println("holiday mode");
        yield "enjoy";
      }
		
		default->"invalid day";
		
		};
		return info;
	}

}
