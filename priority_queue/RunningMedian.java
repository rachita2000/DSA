package priority_queue;
import java.util.*;
public class RunningMedian {

	public static void findMedian(int arr[])  {
	       if(arr.length==0) return;
	        PriorityQueue<Integer> maxQue=new PriorityQueue<>(Collections.reverseOrder()); //left part
	        PriorityQueue<Integer> minQue=new PriorityQueue<>(); //right part
	        
	    	maxQue.add(arr[0]);
	        System.out.print(arr[0]+" ");
	        for(int i=1;i<arr.length;i++)
	        {
	            if(maxQue.size()!=0 && minQue.size()==0)
	            {
	               maxQue.add(arr[i]);
	                minQue.add(maxQue.remove());
	                System.out.print((maxQue.peek()+minQue.peek())/2 +" ");
	            }
	            
	            else if(maxQue.size()!=0 && minQue.size()!=0)
	            {
	                int max=maxQue.peek();
	                int min=minQue.peek();
	                if(arr[i]<max)
	                	maxQue.add(arr[i]);
	                else
	                	minQue.add(arr[i]);
	                
	                max=maxQue.peek();
	                min=minQue.peek();
	                
	                if(minQue.size()==maxQue.size())
	                	System.out.print((max+min)/2 + " ");
	                 else if(maxQue.size()-minQue.size()>1)
	                {
	                	minQue.add(maxQue.remove());
	                	min=minQue.peek();
	                	max=maxQue.peek();
	                	System.out.print((max+min)/2 + " ");
	                }
	                else if(minQue.size()-maxQue.size()>1)
	                {
	                	maxQue.add(minQue.remove());
	                	min=minQue.peek();
	                	max=maxQue.peek();
	                	System.out.print((max+min)/2 + " ");
	                }
	                else if(maxQue.size()>minQue.size())
	                	System.out.print(maxQue.peek()+" ");
	                else if(minQue.size()>maxQue.size())
	                	System.out.print(minQue.peek()+" ");
	            }
	        }
	    
	    }


}
