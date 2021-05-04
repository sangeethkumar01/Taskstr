package com.taskarrstr;



public class Taskstr {

	

		public void demoString(){
		String s="engine";
		int x = 0;
		int y = 0;
		for (int i = 0; i < s.length(); i++) 
		{
			char c=s.charAt(i);
			if 
			( c=='a' || c=='e' || c=='i' || c=='o'  || c=='u')
			{
				x++;
			}
			else if (c>='a' && c<='z')
			{
				y++;
			}
		}
		System.out.println("number of vowels is : "+x);
		System.out.println("number of consonants is : "+y);
	}
		
		public static void main(String[] args) {
			// TODO Auto-generated method stub

			Taskstr obj = new Taskstr();
			obj.demoString();
			
		}
	}


