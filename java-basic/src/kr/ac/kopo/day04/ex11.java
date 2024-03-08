package kr.ac.kopo.day04;

public class ex11 {

	public static void main(String[] args) {
		
		for (int i = 1 ; i <= 9 ; i++) {
			if(i <= 5) {
			   for (int j = 1 ; j <= i ; j++) {
				    System.out.print('*');
			   }
			}  else {
		        for (int k = 1 ; k <= 10-i ; k++) {
		    	    System.out.print('*');
		        }
			}
			System.out.println();
            
		
       }
	}
}