package sorting;

import java.util.Arrays;

public class Problem6 {

	public static void main(String[] args) {

		String s="AFBRi";
		char lower[]=new char[s.length()];
		char upper[]=new char[s.length()];
		int l=0;
		int u=0;
		for(int i=0;i<s.length();i++)
		{
			if(Character.isLowerCase(s.charAt(i)))
			{
				lower[l]=s.charAt(i);
				l++;
			}
			else if(Character.isUpperCase(s.charAt(i)))
			{
				upper[u]=s.charAt(i);
				u++;
			}
		}
		Arrays.sort(lower);
		Arrays.sort(upper);
		String s1="";
		String s2="";
		for(int i=0;i<lower.length;i++)
		{
			s1+=lower[i];
		}
		for(int i=0;i<upper.length;i++)
		{
			s2+=upper[i];
		}
		s1=s1.trim();
		s2=s2.trim();
		int i=0;
		int j=0;
		String ans="";
		while(i<s1.length()||j<s2.length())
		{
			if(j<s2.length())
			{
				ans+=s2.charAt(j);
				j++;
			}
			if(i<s1.length())
			{
				ans+=s1.charAt(i);
				i++;
			}
		}
		System.out.println(ans);
	}

}
