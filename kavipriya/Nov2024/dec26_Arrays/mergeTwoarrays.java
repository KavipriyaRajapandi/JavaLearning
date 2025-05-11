import java.util.Arrays;
class mergeTwoarrays 
{
	public static void main(String[] args) 
	{
		System.out.println("Hello World!");
		int a[]={4,5,6,2};
		int b[]={7,8,3,1};
		int result[]=solve(a,b);
		System.out.println(Arrays.toString(result));
	}

	public static int[] solve(int[] a,int[] b) 
	{

		int result[]=new int[a.length+b.length];
		for(int i=0;i<a.length;i++){   // 0... a.len-1
			
			result[i]=a[i];
		}

		for(int i=0,j=a.length;j<result.length;j++,i++){  //a.len .....result.leng
			System.out.println(" "+b[i]);
			result[j]=b[i];
		}


		return result;
	}
}
