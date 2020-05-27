/*
 * Bubble Sort:- If the right element is greater than the left element, swap.
 * 				 If there are 'n' elements the it will take 'n-1' iterations
 * 				 to sort the array(not always). After every iteration the largest
 * 				 element will be at the end. So there is no need to sort the last
 * 			     elements as they are already sorted. So, we need to run the
 * 				 inner loop till n-1-i;
 */
package sorting;

public class BubbleSort {

	public static void main(String[] args) {

		int a[]= {4,9,-1,6,-9,0,3};
		int n=a.length;
		for(int i=0;i<n-1;i++)  
		{
			boolean sort=true;
			for(int j=0;j<n-1-i;j++)
			{
				if(a[j+1]<a[j])
				{
					int temp=a[j+1];
					a[j+1]=a[j];
					a[j]=temp;
					sort=false;
				}
			}
			if(sort)
				break;
		}
		for(int item:a)
		{
			System.out.print(item+" ");
		}
	}

}
//-9 -1 0 3 4 6 9 