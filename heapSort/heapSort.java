package heapSort;

public class heapSort {
	
	public void heapSort(int[] unsortedList)
	{
	    int length = unsortedList.length;
	 
	    for (int i = length/2-1; i >= 0; i--)
	        heapify(unsortedList, length, i);
	 
	    for (int i=length-1; i>=0; i--)
	    {
	        int temp = unsortedList[0];
	        unsortedList[0] = unsortedList[i];
	        unsortedList[i] = temp;
	 
	        heapify(unsortedList, i, 0);
	    } 
	} 
	 
	public void heapify(int[] unsortedList, int length, int i)
	{
	    int largest = i;
	    int left = 2*i + 1;
	    int right = 2*i + 2;
	 
	    if (left < length && unsortedList[left] > unsortedList[largest])
	        largest = left;
	        
	    if (right < length && unsortedList[right] > unsortedList[largest])
	        largest = right;

	    if (largest != i)
	    {
	        int temp2 = unsortedList[i];
	        unsortedList[i] = unsortedList[largest];
	        unsortedList[largest] = temp2;

	        heapify(unsortedList, length, largest);
	    } 
	} 
	}

