//Count possible triangles 
package sorting;

public class Problem5 {

	public static void main(String[] args) {

		int a[]= {6 ,4, 9, 7 ,8};
		int n=a.length;
		int count=0;
		for(int i=0;i<n-2;i++)
		{
			for(int j=i+1;j<n-1;j++)
			{
				for(int k=j+1;k<n;k++)
				{
					if(a[i]+a[j]>a[k]&&a[i]+a[k]>a[j]&&a[j]+a[k]>a[i])
					{
						count++;
					}
				}
			}
		}
		System.out.println(count);

	}

}
//10
