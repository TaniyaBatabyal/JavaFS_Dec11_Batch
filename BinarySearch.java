package demo;

public class BinarySearch 
{

	public static void main(String[] args) 
	{
		int[] data=new int[] {23,45,56,66,78,89,95};
		int low=0;
		int high = data.length-1;
		int mid=(low+high)/2;
		int se=56;
		int pos=-1;
		
		while(low<=high)
		{
			 mid=(low+high)/2;
			if(se==data[mid])
		       {
			      pos=mid;
			      break;
		       }
		      else if(se<data[mid])
		      {
		    	  high=mid-1;
		      }
		      else 
		      {
		    	  low=mid+1;
		      }
		      
		}    
		
		if(pos>-1)
		System.out.println("element found at location "  + (pos+1));
		
		
		else
		{
			System.out.println("element not found");
		}
	}

}
