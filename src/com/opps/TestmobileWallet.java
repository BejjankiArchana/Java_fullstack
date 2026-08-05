package com.opps;

public class TestmobileWallet {

	public static void main(String[] args) {
		MobileWallet m=new MobileWallet(100);
		System.out.println(m.getBalance());
		m.deduct(90);
		m.deduct(10);
		m.recharge(67.0);
		m.deduct(10);
		
	}

}
