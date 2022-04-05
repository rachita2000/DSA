package priority_queue;
import java.util.*;
public class Max_PQ {

	private ArrayList<Integer> heap;
	
	Max_PQ(){
		heap=new ArrayList<>();
	}
	boolean isEmpty() {
		return heap.size() == 0;
	}

	int getSize() {
		return heap.size();
	}

	int getMax() {
		if(isEmpty())
            return Integer.MIN_VALUE;
		return heap.get(0);
	}

	void insert(int element) {
		heap.add(element);
		int child_idx=heap.size()-1;
		int parent_idx=(child_idx-1)/2;
		
		while(child_idx>0)
		{
			if(heap.get(child_idx) > heap.get(parent_idx))
			{
				int tmp=heap.get(parent_idx);
				heap.set(parent_idx, heap.get(child_idx));
				heap.set(child_idx, tmp);
				
				child_idx=parent_idx;
				parent_idx=(child_idx-1)/2;
			}
			else
				return;
		}
	}

	int removeMax() {
		if(isEmpty())
			return Integer.MIN_VALUE;
		int max=heap.get(0);
		heap.set(0, heap.get(heap.size()-1));
		heap.remove(heap.size()-1);
		int parent_idx=0;
		int maxind=parent_idx;
		int leftchild=(2*parent_idx)+1;
		int rightchild=(2*parent_idx)+2;
		
		while(leftchild < heap.size())
		{
			if(heap.get(leftchild) > heap.get(maxind))
				maxind=leftchild;
			if(rightchild < heap.size() && heap.get(rightchild) > heap.get(maxind))
				maxind=rightchild;
			if(maxind==parent_idx)
				break;
			else
			{
				int tmp=heap.get(parent_idx);
				heap.set(parent_idx, heap.get(maxind));
				heap.set(maxind, tmp);
				
				parent_idx=maxind;
				leftchild=(2*parent_idx)+1;
				rightchild=(2*parent_idx)+2;
			}
		}
		
		return max;
	}
}
