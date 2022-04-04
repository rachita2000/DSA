package priority_queue;

import java.util.ArrayList;

public class PQ {

	private ArrayList<Integer> heap;

	public PQ() {
		heap = new ArrayList<Integer>();
	}

	boolean isEmpty() {
		return heap.size() == 0;
	}

	int size() {
		return heap.size();
	}

	int getMin() throws PriorityQueueException {
		if (isEmpty()) {
			// Throw an exception
			throw new PriorityQueueException();
		}
		return heap.get(0);
	}

	void insert(int element) {
		heap.add(element);
		int childIndex = heap.size() - 1;
		int parentIndex = (childIndex - 1) / 2;

		while (childIndex > 0) {
			if (heap.get(childIndex) < heap.get(parentIndex)) {
				int temp = heap.get(childIndex);
				heap.set(childIndex, heap.get(parentIndex));
				heap.set(parentIndex, temp);
				childIndex = parentIndex;
				parentIndex = (childIndex - 1) / 2;
			} else {
				return;
			}
		}
	}

	int removeMin() throws PriorityQueueException {
		if (isEmpty()) {
			// Throw an exception
			throw new PriorityQueueException();
		}
        int min=heap.get(0);
        heap.set(0, heap.get(heap.size()-1));
        heap.remove(heap.size()-1);
        int parentind=0;
        int minind=parentind;
        int leftind=1, rightind=2;
        
        while(leftind< heap.size())
        {
            if(heap.get(parentind) > heap.get(leftind))
                minind=leftind;
            if(rightind < heap.size() && heap.get(rightind) < heap.get(minind))
                minind=rightind;
            if(minind==parentind)
                break;
            else
            {
                int tmp=heap.get(parentind);
                heap.set(parentind, heap.get(minind));
                heap.set(minind, tmp);
                parentind=minind;
                leftind= (2* parentind)+1;
                rightind= (2* parentind)+2;
            }
        }
        return min;
	}
}

class PriorityQueueException extends Exception {

}
