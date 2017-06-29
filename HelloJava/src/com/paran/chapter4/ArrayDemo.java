package com.paran.chapter4;

public class ArrayDemo {
	public static void main(String[] args){
		int array[]=new int[9];
		for(int i=0;i<array.length;i++){
			array[i]=i;
			System.out.printf("%d", array[i]);
		}
		System.out.println("");
		ArrayDemo.reverseArray(array);
	}
	public static void reverseArray(int[] array){
		int array1[]=new int[9];
		for(int i =0; i<array.length;i++)
		{
			array1[i]=array.length-i;
			System.out.printf("%d", array1[i]);
		}
	}
	
}
