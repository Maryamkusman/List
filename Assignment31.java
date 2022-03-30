public class Assignment31 {

///////////////////////////////////////////////////////////////////////////////
//Title:              Assignment 3
//Files:              Assignemnt 3, My 2D list, My List
//Quarter:            (Cse 8b) Fall 2021
//
//Author:             Maryam Usman
//Email:              musman@ucsd.edu
//Instructor's Name:  Benjamin Ochoa
	//this is the main class where unit tests are created and ran with reference to the precious classes
    private static boolean testMyListAppend() {
        MyList1 list = new MyList1(2);

        for (int i = 0; i < 3; i++) {
            list.append(i);
        }
        if (list.array.length != 4) {
            System.out.println("Array length is incorrect!");
            return false;
        }
        if (list.size != 3) {
            System.out.println("MyList size is incorrect!");
            return false;
        }
        for (int i = 0; i < 3; i++) {
            if (list.array[i] != i) {
                System.out.println("Values after append are unexpected!");
                return false;
            }
        }
        return true;
    }
    /*
    private static boolean testMyListAppend1() {
        MyList1 list = new MyList1(6);

        for (int i = 0; i < 6; i++) {
            list.append(i);
        }
        if (list.array.length != 7) {
            System.out.println("Array length is incorrect!");
            return false;
        }
        if (list.size != 7) {
            System.out.println("MyList size is incorrect!");
            return false;
        }
        for (int i = 0; i < 6; i++) {
            if (list.array[i] != i) {
                System.out.println("Values after append are unexpected!");
                return false;
            }
        }
        return true;
    }
    */
    
    private static boolean testMyListPop() {
    	MyList1 list1= new MyList1();
    	for (int i=0;i<3;i++) {
    		list1.append(i);
    		}
		if (list1.pop() !=1) {
    		System.out.println("pop value is incorrect");
    		return false;
    	}
		return true;
    		
    }
    
    
    private static boolean testMyListGet() {
    	MyList1 list2=new MyList1(2);
    	for (int i = 0; i < 3; i++) {
            list2.get(i);
        }
        if (list2.array.length != 2) {
            System.out.println("Array length is incorrect!");
            return false;
        }
        if (list2.size != 0) {
            System.out.println("MyList size is incorrect!");
            return false;
        }
       // for (int i = 0; i < 3; i++) {
           // if (list2.array[i] != i) {
           //     System.out.println("Values after append are unexpected!");
            //    return false;
         //   }
    	 
    	 //}
    	return true;
    }
    public static boolean unitTests() {
        if (!testMyListAppend()) {
            return false;
        }
        if (!testMyListPop()) {
        	return false;
        }
        if (!testMyListGet()) {
        	return false;
        }
        // TODO: add at least two testers
      // if (!testMyListAppend1()) {
        //	return false;
        //}
        return true;
    }

    public static void main(String[] args) {
        if (unitTests()) {
            System.out.println("unitTests() passed.");
        }

    }
}
