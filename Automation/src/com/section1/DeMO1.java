package com.section1;

public class DeMO1 {
	public static void main(String[] args) {
		String s="b12$c@";
		String character="";
		String digit="";
		String sc="";
		for(int i=0;i<s.length();i++)
		{
			char ch=s.charAt(i);
			if(Character.isAlphabetic(ch))
			{
				character=character+ch;
			}
			else if(Character.isDigit(ch))
			{
				digit=digit+ch;
			}
			else
			{
				sc=sc+ch;
			}
		}
		System.out.println(character+digit+sc);
	}

}
