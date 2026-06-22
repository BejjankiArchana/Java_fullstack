package LogicalStatements;

import java.util.Scanner;

public class NoukariPortal {

	public static void main(String[] args) {
		System.out.println("complete your profile for associate role at infosis:");
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter your full name :");
		String name=sc.nextLine();
		
		System.out.println("have you completed your degree : yes/no");
		String degree=sc.next();
		if(degree.equalsIgnoreCase("yes")) {
			System.out.println("do you have any carrier gap: yes/no ");
			String carrier_gap=sc.next();
			if(carrier_gap.equalsIgnoreCase("no")) {
				System.out.println("enter your degree percentage :");
				double degree_percentage=sc.nextDouble();
				if(degree_percentage>=60) {
					System.out.println("enter your inter percentage :");
					double inter_percentage=sc.nextDouble();
					if(inter_percentage>=60) {
						System.out.println("enter your tength percentage :");
						double tength_percentage=sc.nextDouble();
						if(tength_percentage>=60) {
							System.out.println("do you have any bacllogs : yes/no");
							String backlogs=sc.next();
							if(backlogs.equalsIgnoreCase("no")) {
								System.out.println("what are your slills :java/python/c");
								String skill=sc.next();
								if(skill.equalsIgnoreCase("java")||skill.equalsIgnoreCase("python")||skill.equalsIgnoreCase("c")) {
									System.out.println("can you able to speak english language: yes/no");
									String language_ability=sc.next();
									if(language_ability.equalsIgnoreCase("yes")) {
										System.out.println("how many academic projects have you done");
										int no_of_projects=sc.nextInt();
										if(no_of_projects>=2) {
											System.out.println("are you ready to relocote:yes/no");
											String relocate=sc.next();
											if(relocate.equalsIgnoreCase("yes")) {
												System.out.println("are you ok with 2 year service bond:yes/no");
												String bond=sc.next();
												if(bond.equalsIgnoreCase("yes")) {
													System.out.println("salary expected in lpa?");
													float sal=sc.nextFloat();
													if(sal<=7) {
														System.out.println("your profile matches our requirements ");
														System.out.println("we will schedule an interview very soon! thank for yor time");
														
													}
													else {
														System.out.println("we can only give upto 7 lpa for a fresher");
													}
													
													
												}
												else {
													System.out.println("service bond is mandatory");
													
												}
												
												
											}
											else {
												System.out.println("try some where else, good luck!");
											}
											
											
										}
										else {
											System.out.println("minimum 2  academicprojects are required");
											
										}
										
										
									}
									else {
										System.out.println("english is must other wise you cant survive here");
										
									}	
									
								}
								else {
									System.out.println("either java/python/c  language is neeed :");
									
								}
								
							}
							else {
								System.out.println("first clear your backlogs :");
							}
							
						}
						else {
							System.out.println("Sorry! we are looking for above 60% profile");
							
						}
						
					}
					else {
						System.out.println("Sorry! we are looking for above 60% profile");	
						
					}
						
				}
				else {
					System.out.println("Sorry! we are looking for above 60% profile");	
				}
				
				
			}
			else {
				System.out.println("Sorry! we are looking for regular study profiles");
				
			}
			
		}
		else {
			System.out.println("first complete your degree then apply");
		}
		
		
		

	}

}
