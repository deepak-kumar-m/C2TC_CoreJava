package Collection_Framework;

import java.util.ArrayDeque;

public class ArrayDequeu {

	public static void main(String[] args) 
	{
		ArrayDeque<String> adq = new ArrayDeque<String>();
		
		adq.push("A");
		adq.push("B");
		adq.push("C");
		adq.push("D");
		
		System.out.println(adq);
		adq.pop();
		System.out.println(adq);
		adq.pop();
		System.out.println(adq);
		adq.pop();
		System.out.println(adq);
		adq.poll();
		System.out.println(adq);
		adq.offer("E");

	}

}
