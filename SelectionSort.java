/*
 * Selection Sort:- After every iteration it will find the smallest element 
 * from the unsorted array and put it at the beginning.
 */
package sorting;

public class SelectionSort {

	public static void main(String[] args) {

		int a[]= {5,2,-1,6,3};
		int n=a.length;
		for(int i=0;i<n-1;i++)
		{
			int MinInd=i;
			for(int j=i;j<n;j++)
			{
				if(a[j]<a[MinInd])
				{
					MinInd=j;
				}
			}
			int temp=a[i];
			a[i]=a[MinInd];
			a[MinInd]=temp;
		}
		for(int i:a)
		{
			System.out.print(i+" ");
		}

	}

}
//-1 2 3 5 6 