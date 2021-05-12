

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int i,j;
		int n=8;
		
		//Initializing grid 2D array
		GridCell[][] gridArr = new GridCell[n][n];
		for(i=0;i<n;i++) {
			for(j=0;j<n;j++) {
				gridArr[i][j] = new GridCell();
			}
		}
		
		
		
		System.out.println("Displaying grid:");
		for(i=0;i<n;i++) {
			for(j=0;j<n;j++) {
				System.out.println(gridArr[i][j].toString());
			}
		}
	}

}
