package demo;

public class nCr_nPr 
{
	public static int factorial(int n)
	{
        int i=1,fact=1;
		
		for(i=1;i<=n;i++)
	       fact=fact*i;
	        return fact;
	}
	
	public static int nCr(int n,int r) 
	{
		int combination = factorial(n)/(factorial(n-r)*factorial(r));
		return combination;
	}
	
	public static int nPr(int n,int r) 
	{
		int permutation = factorial(n)/factorial(n-r);
		return permutation;
	}

	public static void main(String[] args) 
	{
		System.out.println(factorial(5));
		System.out.println(nCr(3,2));
		System.out.println(nPr(3,2));
		
		

	}

}
