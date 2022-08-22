package com.project.arraysdemo;

public class MultiDimensionalArray {
	public static void main(String[] args) {
		int[][] array=new int[4][4];//declearation of multidimensional array
		int count=10;
		for(int i=0;i<array.length;i++) {
			for(int j=0;j<array.length;j++) {
				array[i][j]=count;
				count+=10;
			//count=count+10;	
			}
			
		}
		for(int i=0;i<array.length;i++) {
			for(int j=0;j<array[i].length;j++) {
				System.out.print(array[i][j]+" ");
			}
			System.out.println();
		}
	}

}
