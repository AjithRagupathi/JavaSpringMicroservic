package com.ajith.learnings;

public class ReverseStrings {

	public String reverseStrings(String str) {
		int left=0;
		int right=str.length()-1;
		char [] ch=str.toCharArray();
		while(left<right) {
			char temp= ch[left];
			ch[left]=ch[right];
			ch[right]=temp;
			left++;
			right--;
		}
		
		return new String(ch);
		// TODO Auto-generated constructor stub
	}


}
