package lKN1;

import collections.Abstract;

public class UseInterface implements Interface1 {
	

	public static void main(String[] args) {
		UseInterface ui = new UseInterface();
		Abstract abs = new Abstract() {
			
			@Override
			public void f2() {
				// TODO Auto-generated method stub
				
			}
			
			@Override
			public void f1() {
				// TODO Auto-generated method stub
				
			}
		};
		ui.f1();
		ui.f2();
	}

	@Override
	public void f1() {
	System.out.println("abc");
		
	}

	@Override
	public void f2() {
		System.out.println("123");
		
	}

}
