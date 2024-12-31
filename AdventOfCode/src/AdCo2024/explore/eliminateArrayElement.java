package AdCo2024.explore;

public class eliminateArrayElement {

	public static void main(String[] args) {
		int[] myArray = { 1, 2, 3, 4, 5, 6};
		// int skipLevel = 0;
		int[] newReport = new int[myArray.length - 1];
		
		// print the original array
		System.out.print("Initial report: ");
		for ( int i = 0; i < myArray.length; i++ )
			System.out.print(myArray[i] + " ");

		System.out.println();
		
		for ( int skipLevel = 0; skipLevel < myArray.length; skipLevel++ ) {
			int newReportIndex = 0;
			
			for ( int i = 0; i < myArray.length; i++ ) {
				if ( !(i == skipLevel) ) {
					newReport[newReportIndex] = myArray[i];
					newReportIndex++;
				}
			}
			
			for ( int x = 0; x <  newReport.length; x++ ) {
				System.out.print(newReport[x] +" ");
			}
	
			System.out.println();
			
		}
		
	}

}
