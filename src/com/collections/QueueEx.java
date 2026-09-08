package com.collections;

import java.util.LinkedList;
import java.util.Queue;

public class QueueEx {

	public static void main(String[] args) {
		Queue<Integer>queue=new LinkedList<>();
		queue.add(5);
		queue.offer(10);
		//both add,offer add element to queue
		//but if element can not added add method throw illegal state exception
		//but offer method return false no exception
		queue.offer(20);
		queue.offer(30);
		System.out.println(queue.peek());//gets the first element
		System.out.println(queue.element()); //gets the first element
		//peak() return null if queue is empty
		//element() throw java.util.NoSuchElementException
		System.out.println(queue.poll());//remove the first element
		System.out.println(queue.remove());//remove the first element
		//poll() return null if queue is empty
		//remove() throw java.util.NoSuchElementException
		
		
	}

}
