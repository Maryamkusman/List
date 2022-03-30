///////////////////////////////////////////////////////////////////////////////
// Main Class File:    Assignment3.java
// File:               My2DList.java
// Quarter:            Cse8b Fall 2021
//
// Author:             Maryam Usman musman@ucsd.edu
// Instructor's Name:  Benjamin Ochoa
//this class computes several methods for a 2d array. 
public class My2DList {
    int[][] array;

    /**
     * No-arg constructor
     */
    public My2DList() {
        array = null;
    }

    public My2DList(int nRow, int nColumn) {
       array=new int[nRow][nColumn];
    }
//initialized array from constructor with row and column

    /**
     * Getter that retrives {@Code array} member variable
     * @return {@Code array} member variable
     */
    public int[][] getArray() {
        return array;
    }

    /**
     * Setter that mutates {@Code array} member variable
     * @param array {@Code array} member variable
     */
    public void setArray(int[][] newArray) {
        array = newArray;
    }
//this takes a 2d array and flips it horizontally 
    public void horizontalFlip(int[][] array) {
    	int[] flip;
        for (int i=0; i<array.length;i++) {
        	flip = array[i]; 
        	for(int j=0; j<array[i].length; j++) {
        		array[i][j] = flip[flip.length - j - 1]; 
        	}
        }
    }

    public void verticalFlip(int[][] array) {
        int[] turn;
        for (int i=0;i<array.length/2;i++) {
        	//for (int j=0;j<array[i].length;j++)
        		turn=array[i];
        		//int j;
				array[i]=array[array.length-i-1];
				array[array.length-i-1]=turn;
        }
    }

    public void transpose() {
        for (int i=0; i<array.length;i++) {
        	for (int j=0;j<array[i].length;j++) {
        		array[i][j]=array[j][i];
        	}
        }
        
        
    }

    public void rotate() {
       // int revolve;
      //  for(int i=0;i<array.length;i++) {
        	verticalFlip(array);
        	//for (int j=0; j<array[i].length;j++) {
        		//swap arrays horizontally
        		//array[i][j]=array[j][i];
        		transpose(); 
    }
}
