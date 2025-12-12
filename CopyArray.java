import java.util.Arrays;
class CopyArray
{
	public static int[] test(int[]a)
	{
		int[]b=new int[a.length];
		for (int i=0;i<=a.length-1;i++) {
			b[i]=a[i];
		}
		return b;
	}
	public static void main(String[] args) 
	{
		int []a={10,20,30,40};
	System.out.println(Arrays.toString(test(a)));  //we can use foreach loop also for print 
    }
}