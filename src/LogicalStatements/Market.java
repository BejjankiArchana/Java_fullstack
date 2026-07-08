package LogicalStatements;

import java.util.Scanner;

public class Market {

	public static void main(String[] args) {
		System.out.println("welcome to Raithu baazar Market");
		Scanner sc=new Scanner(System.in);
		System.out.println("what do you want fruits? / veggies? / leafly_vegitavles?:");
		int price=0;
		int sum=0;
		String yn="";
		String purchasedItems = "";
		do {
			
			price=0;
			
		System.out.println("enter your choice fru/veg/leaf");
		String choice=sc.next();
	switch(choice) {
	case "fru"->{
		System.out.println("which fruit you want: banana/apple/mango/grapes/orange/pineapple");
		String item=sc.next();
		 switch(item) {
		  case "banana"->{
			System.out.println("banana 70rs per dozen");
			System.out.println("enter quantity in dozens :");
			int quan=sc.nextInt();
			price=70*quan;
			 purchasedItems += "Banana - ₹70\n";
			
			
		    }
		    case "apple"->{
			System.out.println("apple 100rs per kg");
			System.out.println("enter quantity in kgs :");
			int quan=sc.nextInt();
			price=100*quan;
			 purchasedItems += "apple - ₹100\n";
			
		    }
		    case "mango"->{
			System.out.println("mango 100rs per kg");
			System.out.println("enter quantity in kgs :");
			int quan=sc.nextInt();
			price=100*quan;
			 purchasedItems += "mango - ₹100\n";
			
		    }
		    default ->{
			System.out.println("entered item is out of stock");
		    }
		    
		}
	}
		
	case "veg"->{
		System.out.println("which vegitable you want: carrot/tomato/cucumber/potato/beetroot/mirchi/onion");
		String item=sc.next();
		 switch(item) {
		  case "carrot"->{
			System.out.println("carrot 50rs per kg");
			System.out.println("enter quantity in kgs :");
			int quan=sc.nextInt();
			price=50*quan;
			 purchasedItems += "carrot - ₹50\n";
		    }
		    case "tomato"->{
			System.out.println("tomato 60rs per kg");
			System.out.println("enter quantity in kgs :");
			int quan=sc.nextInt();
			price=60*quan;
			 purchasedItems += "tomato - ₹60\n";
			
		    }
		    case "cucumber"->{
			System.out.println("cucumber 30rs per kg");
			System.out.println("enter quantity in kgs :");
			int quan=sc.nextInt();
			price=30*quan;
			 purchasedItems += "cucumber - ₹30\n";
			
		    }
		    default ->{
			System.out.println("entered item is out of stock");
		    }
		}
			
		        }
	case "leaf"->{
		System.out.println("which leafs you want: thotakura/palakura/gongura/kothimeera/menthikura/curryleafs");
		String item=sc.next();
		 switch(item) {
		  case "thotakura"->{
			System.out.println("thotakura 10rs per bunch");
			System.out.println("enter quantity in bunches :");
			int quan=sc.nextInt();
			price=10*quan;
			 purchasedItems += "thotakura - ₹10\n";
		    }
		    case "palakura"->{
			System.out.println("palakura 10rs per bunch");
			System.out.println("enter quantity in kgs :");
			int quan=sc.nextInt();
			price=10*quan;
			 purchasedItems += "palakura - ₹10\n";
			
		    }
		    case "gongura"->{
			System.out.println("gongura 10rs per bunch");
			System.out.println("enter quantity in kgs :");
			int quan=sc.nextInt();
			price=10*quan;
			 purchasedItems += "gongura - ₹10\n";
			
		    }
		    default ->{
			System.out.println("entered item is out of stock");
		    }
		}
			
		}
	default->{System.out.println("we have only fruits,veggies and leafs");
			
		}
			
	}
	sum+=price;
	
	System.out.println("do you need another item y/n :");
		yn=sc.next();
		
			}while(yn.equalsIgnoreCase("y"));
		System.out.println("\nPurchased Items:");
		System.out.println(purchasedItems);
		System.out.println("your total bill : "+sum);
		System.out.println("thanks for buying ! visit again!");
	}

}
