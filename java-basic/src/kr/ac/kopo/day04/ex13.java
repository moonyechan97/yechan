package kr.ac.kopo.day04;

public class ex13 {
	
	public static void main(String[] args) {
		
	     for (int i = 1  ; i <= 9 ; i++) {
	    	 if (i <= 5) {
	    		 for (int j = 1 ; j <= i-1 ; j++) {
	    	         System.out.print(' ');
	    		 }
	    	     for (int j = 1 ; j <= 6-i ; j++) {
	    			 System.out.print('*');
	    		   }
	    		 
	    	 } else {
	    	     for (int j = 1 ; j <= 9-i ; j++) {
	    				 System.out.print(' ');
	    			 }
	    	     for (int j = 1 ; j <= i-4 ; j++) {
	    				 System.out.print('*');
	    			 }
	    		 }
	    	 
	
	    		 System.out.println();
	     }
	}
}
