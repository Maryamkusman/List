///////////////////////////////////////////////////////////////////////////////
// Main Class File:    Assignment3.java
// File:               MyList.java
// Quarter:            Cse8b Fall 2021
//
// Author:             Maryam Usman musman@ucsd.edu
// Instructor's Name:  Benjamin Ochoa
//
//this class computes several methods for a 1 dimensional array
public class MyList1 {
    int[] array;
    int size;

    /**
     * No-arg constructor
     */
    public MyList1() {
        array = new int[1];
    }
    /**
     * this takes a 1d array and sets a value for the length of the array 
     * @param array
     */
    public MyList1(int capacity) {
        array=new int[capacity];
       // System.out.println(array[3]);
        if (capacity <1) {
        	array=new int [1];
        }
        else 
        	array= new int [capacity];
        //array[1]=4;
        size=0;
    }
    

    /**
     * 
     * 
     */
    public int[] getArray() {
        return array;
    }

    /**
     * Getter that retrives {@Code size} member variable
     * @return {@Code size} member variable
     */
    public int getSize() {
        return size;
    }

    /**
     * Setter that mutates {@Code array} member variable
     * @param array {@Code array} member variable
     */
    public void setArray(int[] newArray) {
        array = newArray;
    }

    /**
     * Setter that mutates {@Code size} member variable
     * @param size {@Code size} member variable
     */
    public void setSize(int newSize) {
        size = newSize;
    }


    public void append(int x) {
        if (x<0) 
        	x=Math.abs(x);
        size++;
        if (array.length < size) {
        	int[] array2 =new int[array.length *2];
        	System.arraycopy(array, 0, array2 ,0, array.length);
        	array=array2;
        }
       array[size-1]=x;
        
    }

    public int pop() {
        if (size==0) {
        	return -1;
        }
        else {
        	size--;
        	return (array[size-1]);
        }
    }

    public int get(int i) {
        if(i<0 || i>=size)
        		return -1;
        return array[i];
    }

    public int index(int x) {
        for (int i=0;i<size;i++) {
        	if (array[i]==x) {
        		return i;
        	}
        }
        return -1;
    }

}