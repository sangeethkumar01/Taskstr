package com.taskarrstr;

public class Taskarr {
	public void demoArray(){
		int a[]={7,21,33,42,50};


		for (int i = 0; i < a.length; i++) {
			if(a[i]%2!=0){
				//System.out.println(a[i]);
				int x1=a[i]/2;

				System.out.println(x1);
			}	
		}
		
		
	}


	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Taskarr obj = new Taskarr();
		obj.demoArray();
		
			
	}

}


