package arraySorting;

import java.util.Arrays;

public class Sandbox {

	public static void main(String[] args) {
		int []a= randomArray(400);
		long before= System.currentTimeMillis();
		bubbleSort(a);
		long after= System.currentTimeMillis();
		long difference= after-before;
		System.out.println("Took "+ difference+ " milliseconds");


		//once you make an array its final; you can't add anything to it
	}
	public static int[] bubbleSort(int []array){
		for (int j=0;j<array.length;j++){
			for (int i=0;i<array.length-1-j; i++){
				if ( array[i]> array[i+1])
					swap(array,i,i+1); 
			}
		}
		return array;
	}
	public static int[] swap(int[]array,int a, int b){
		int save= array[a];// save the value of array, otherwise next line will not work
		array[a]= array[b];
		array [b]=save;
		return array; 
	}

	public static int[]randomArray(int n){
		//Make an array of size n
		int[]array = new int [n];
		for (int i=0;i<array.length;i++){
			array[i]=(int)(Math.random()*Integer.MAX_VALUE);
		}
		return array;
	}
	public static int[] raziSort(int[]array){
		for (int round=0;round<array.length;round++){
			int saved = Integer.MAX_VALUE;
			int where= 0;
			for (int i=round; i <array.length;i++){
				if (array[i] < saved){
					saved= array[i];// this is saving the "biggest tree you've ever seen"
					where= i;

				}	
			}   
			swap(array,where,0);

		}
		return array;
	}
}

