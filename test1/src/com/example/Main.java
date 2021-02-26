package com.example;

import java.util.Arrays;

public class Main {
	public static class MaxCounters{
		public int [] solution(int N, int[] A){
			int [] counter = new int[N];
			Arrays.fill(counter,0);
			int startLine = 0;
			int currentMax = 0;
			for (int i:A){
				int x = i - 1;
				if (i>N) startLine = currentMax;
				else if (counter[x]<startLine) counter[x] = startLine +1;
				else counter[x] +=1;
				if (i<N && counter[x] > currentMax)currentMax = counter[x];
			}
			for (int i = 0; i<counter.length; i++)
				if (counter[i] < startLine) counter[i] = startLine;
				return counter;

		}
	}

	public static void main(String[] args) {

		System.out.println(Arrays.toString(new MaxCounters().solution(5, new int[]{3,4,4,6,1,4,4})));
	}
}
