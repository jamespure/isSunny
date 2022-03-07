package com.seymourjames.handsOn1;

public class HandsOn {

	public static void main(String[] args) {
		boolean isSunny = true;
		boolean atBeach = true;
		
		if (isSunny == true) {
			System.out.println("Wear sunglasses!");
			
			if (atBeach == true) {
				System.out.println("Wear sunblock!");
				System.out.println("Come back tomorrow.");
			} else {
				System.out.println("Don't need sunblock.");
			}
		} else {
			System.out.println("Don't wear sunglasses.");
			System.out.println("Don't go to the beach.");
		}
	}

}
