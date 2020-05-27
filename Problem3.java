package sorting;

import java.util.*;
import java.util.Collections;

public class Problem3 {

	public static void main(String[] args) {

		Scanner sc=new Scanner(System.in);
	    int a[]= {1 ,5};
	    int n=a.length;
	    Arrays.sort(a);
	      // int mini=Integer.MAX_VALUE;
	       int sum=0;
	       int i=0;
	       sum+=Math.abs(a[i]-a[i+1]);
	       for( i=1;i<=n-2;i++)
	       {
	           int d1=Math.abs(a[i]-a[i-1]);
	           int d2=Math.abs(a[i]-a[i+1]);
	           sum+=Math.min(d1,d2);
	       }
	       sum+=Math.abs(a[i]-a[i-1]);
	       System.out.println(sum);
			
	}

}
