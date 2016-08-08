/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package eightpuzzle;


public class PriorityQueue extends Queue
{
	
	public PriorityQueue()
	{
		super();
	}
	
	public void priorityEnqueue(Comparable<BoardState> item)
	{
		if(this.isEmpty()) {
			this.enqueue(item);
			return;
		}
		BoardState arr[] = new BoardState[this.size()];
		int i=0;
		while(!this.isEmpty()){
			arr[i++] = (BoardState) this.dequeue();
		}
		boolean insert = false;
		for(int j=0;j<arr.length;j++){
			if(!insert && item.compareTo(arr[j])<=0){
				this.enqueue(item);
				insert = true;
			}
			this.enqueue(arr[j]);
		}
	} 

	public Comparable<BoardState> find(Comparable<BoardState> item)
	{
		BoardState result = null;
		BoardState arr[] = new BoardState[this.size()];
		int i=0;
		while(!this.isEmpty()){
			arr[i++] = (BoardState)this.dequeue();
		}
		for(int j=0;j<arr.length;j++){
			if(item.compareTo(arr[j]) == 0) result = arr[j];
			this.enqueue(arr[j]);
		}
		return result;
	} 

}

