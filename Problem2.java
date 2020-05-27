package sorting;

import java.util.Arrays;

public class Problem2 {

	public static void main(String[] args) {

		String s="nnhhggfdeezaaab";
		char str[]=new char[s.length()];
		for(int i=0;i<s.length();i++)
		{
			str[i]=s.charAt(i);
		}
		Arrays.sort(str);
		String ans="";
		for(int i=0;i<str.length;i++)
		{
			ans+=str[i];
		}
		System.out.println(ans);
	}

}
