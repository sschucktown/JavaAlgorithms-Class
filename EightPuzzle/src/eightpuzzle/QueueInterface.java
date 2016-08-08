/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package eightpuzzle;


public interface QueueInterface 
{
	public int size();
	public boolean isEmpty();
	public Object front() throws EmptyQueueException;
	public Object dequeue() throws EmptyQueueException;
	public void enqueue(Object item);
}

