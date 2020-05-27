package sorting;
import java.util.*;
public class Problem4 {

	public static void main(String[] args) {

		int a[]= {9, 2, 8 ,4 ,5 ,7 ,6 ,0};
		int n=a.length;
		Arrays.sort(a);
		int i=0;
		int j=n-1;
		int sum=0;
		while(i<j)
		{
			sum+=a[i]*a[j];
			i++;
			j--;
		}
		System.out.println(sum);
	}

}
