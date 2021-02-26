package com.company;

import java.util.Scanner;


	
	class main {

		public static void main(String[] args) {
			Scanner sc = new Scanner(System.in);

			System.out.println("How big do you want this Array to be?");
			int size;
			size = sc.nextInt();
			int position;
			int numberOfTimesRun = 0;
			int tempNumber;
			boolean sorted = false;
			int[] sortingArray = new int[size];
			for (int i = 0; i < sortingArray.length; i++) {
				System.out.println("Enter the value " + i);
				sortingArray[i] = sc.nextInt();
			}


			while (sorted == false) {
				sorted = true;
				for (int i = 0; i < sortingArray.length-1; i++) {
					if (sortingArray[i] > sortingArray[i + 1]) {
						tempNumber = sortingArray[i];
						sortingArray[i] = sortingArray[i+1];
						sortingArray[i+1] = tempNumber;
						sorted = false;
						numberOfTimesRun++;
					}

				}
			}
			for (int x=0; x<sortingArray.length; x++){
				System.out.println(sortingArray[x]);
			}
			System.out.println("algorithm ran: " + numberOfTimesRun + " of times\n");
			System.out.println("Enter the number you want too look up: ");

			BinarySearch ob = new BinarySearch();
			int n = sortingArray.length;
			int x = sc.nextInt();
			int result = ob.binarySearch(sortingArray, 0, n - 1, x);
			if (result == -1)
				System.out.println("Element not present");
			else
				System.out.println("Element found at index " + result + " = " +  sortingArray[result]);
		}

		static class BinarySearch {
			// Returns index of x if it is present in arr[l..
			// r], else return -1
			int binarySearch(int arr[], int l, int r, int x) {
				if (r >= l) {
					int mid = l + (r - l) / 2;

					// If the element is present at the
					// middle itself
					if (arr[mid] == x)
						return mid;

					// If element is smaller than mid, then
					// it can only be present in left subarray
					if (arr[mid] > x)
						return binarySearch(arr, l, mid - 1, x);

					// Else the element can only be present
					// in right subarray
					return binarySearch(arr, mid + 1, r, x);
				}

				// We reach here when element is not present
				// in array
				return -1;
			}
		}
	}



