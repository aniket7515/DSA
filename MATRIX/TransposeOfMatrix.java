package GFGSELFPACED.MATRIX;

public class TransposeOfMatrix {
    public static void main(String[] args) {
        // the row converts into columns and and columns convert into row is called the transpose of a matrix

        int mat[][] = new int[][]
                {
                        { 10, 20, 30, 40 },
                        { 15, 25, 35, 45 },
                        { 27, 29, 37, 48 },
                        { 32, 33, 39, 50 }
                };
        transpose(mat);
        for(int i=0;i<mat.length;i++){
            for(int j=0;j<mat[i].length;j++){
                System.out.print(mat[i][j]+" ");

            }
            System.out.println(" ");
        }

    }
    public static void transpose(int mat[][]){
        int n=mat.length;
        for(int i=0;i<n;i++){
            for(int j=i+1;j<n;j++){
                int temp=mat[i][j];
                mat[i][j]=mat[j][i];
                mat[j][i]=temp;

            }
        }
    }
}
