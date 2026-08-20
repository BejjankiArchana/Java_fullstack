package com.dsa;

public class SlidingWindow {

	public static void main(String[] args) {
		int[]views= {120,150,100,170,180,200,250};
		int days=3;
		int sum=0;
		double avg=0;
		for(int i=0;i<days;i++) {
			sum+=views[i];
		}
		System.out.print(sum+" ");
		double avg1=sum/days;
		
		for(int i=0;i<views.length-days;i++) {
			sum=sum-views[i]+views[days+i];
			System.out.print(sum+" ");
			//System.out.print(sum/days+" ");
		}

	}

}
