package Arrays;

public class Leetcode73_SetMatrixZeroes {

	public static void main(String[] args) {
		int[][] matrix = { { 1, 1, 1 }, { 1, 0, 1 }, { 1, 1, 1 } };
		//Better-Approach
		setZeroes(matrix);
		//Optimised-Approach
		setZeroesOptimised(matrix);

		int m = matrix.length;
		int n = matrix[0].length;

		for (int i = 0; i < m; i++) {
			for (int j = 0; j < n; j++) {
				System.out.print(matrix[i][j]+" ");
			}
			System.out.println();
		}

	}
	
	//Better- Approach
	public static void setZeroes(int[][] matrix) {
		int m = matrix.length;
		int n = matrix[0].length;
		int[] row = new int[m];
		int[] col = new int[n];

		for (int i = 0; i < m; i++) {
			for (int j = 0; j < n; j++) {
				if (matrix[i][j] == 0) {
					row[i] = 1;
					col[j] = 1;
				}
			}
		}

		for (int i = 0; i < m; i++) {
			for (int j = 0; j < n; j++) {
				if (row[i] == 1 || col[j] == 1) {
					matrix[i][j] = 0;
				}
			}
		}
	}
	
	// Optimised Approach
	public static void setZeroesOptimised(int[][] matrix) {
        int m=matrix.length;
        int n=matrix[0].length;
        int col0=1;

        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                if(matrix[i][j]==0){
                   matrix[i][0]=0;

                   if(j!=0){
                    matrix[0][j]=0;
                   }
                   else{
                    col0=0;
                   }
                }
            }
        }

        for(int i=1;i<m;i++){
            for(int j=1;j<n;j++){
                if(matrix[i][j]!=0){

                    if(matrix[0][j]==0 || matrix[i][0]==0){
                        matrix[i][j]=0;
                    }
                }
            }
        }
        if(matrix[0][0]==0){
            for(int j=0;j<n;j++){
                matrix[0][j]=0;
            }
        }
        if(col0==0){
            for(int i=0;i<m;i++){
                matrix[i][0]=0;
            }
        }
    }

}
