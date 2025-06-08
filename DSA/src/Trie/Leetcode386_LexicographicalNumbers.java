package Trie;

import java.util.ArrayList;
import java.util.List;
import java.util.PriorityQueue;

public class Leetcode386_LexicographicalNumbers {

	public static void main(String[] args) {
		int n=14;
		System.out.println(lexicalOrder(n));

	}
	
	// Using PriorityQueue(min-heap)
	public static List<Integer> lexicalOrder(int n) {
        PriorityQueue<Integer> pq=new PriorityQueue<>((a,b)-> String.valueOf(a).compareTo(String.valueOf(b)));

        for(int i=1;i<=n;i++){
            pq.offer(i);
        }
        List<Integer> sortedLex=new ArrayList<>();
        while(!pq.isEmpty()){
            sortedLex.add(pq.poll());
        }
        return sortedLex;

    }

}
