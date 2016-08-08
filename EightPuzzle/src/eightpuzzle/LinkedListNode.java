/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package eightpuzzle;

/**
 *
 * @author Scott
 */

public class LinkedListNode
{
	private Object data;
	private LinkedListNode next;
	
	public LinkedListNode(Object data)
	{
		this.data=data;
		next = null;
	}
	
	public LinkedListNode getNext()
	{
		return next;
	}
	
	public void setNext(LinkedListNode next)
	{
		this.next = next;
	}
	
	public Object getData()
	{
		return data;
	}
	
	public void setData(Object data)
	{
		this.data = data;
	}
}

