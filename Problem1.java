package sorting;

import java.util.Arrays;

public class Problem1 {

	public static void main(String[] args) {

			int arr[]= {1 ,0 ,1 ,1 ,1 ,1 ,1 ,0, 0 ,0};
			int n=arr.length;
			int c=0;
		    for(int i=0;i<n;i++)
		    {
		        if(arr[i]==0)
		        {
		            c++;
		        }
		    }
		    for(int i=0;i<c;i++)
		    {
		        arr[i]=0;
		    }
		    for(int i=c;i<n;i++)
		    {
		        arr[i]=1;
		    }
		    for(int i:arr)
		    {
		    	System.out.print(i+" ");
		    }
	}

}
//0 0 0 0 1 1 1 1 1 1 