public class Matrix <T extends Number> {

    int rows;
    int columns;

    T[][] m;

    Matrix(int rows, int columns) {
        this.rows = rows;
        this.columns = columns;
        this.m= (T[][]) new Number[rows][columns];
    }
    
    public void setM(T[][] m) {
        this.m=m;
    }

    public T getMElement(int indexR, int indexC){
        return m[indexR][indexC];
    }

    public void setMElement(T value, int indexR, int indexC){
        this.m[indexR][indexC]=value;
    }
    
    public void display(){
        System.out.println("The matrix is: ");
        for(int i=0; i<rows; i++){
            for(int j=0; j<columns; j++){
                System.out.print(" "+m[i][j]+"\t");
            }
            System.out.println();
        }
    }

    public void displayResultMatrix(T[][] matrix){
        System.out.println("The matrix is: ");
        for(int i=0; i<rows; i++){
            for(int j=0; j<columns; j++){
                System.out.print(" "+matrix[i][j]+"\t");
            }
            System.out.println();
        }
    }

    public void sum(T[][] matrix , int r, int c){
        T[][] result = (T[][]) new Number[rows][columns];
        if(this.rows==r){
            if(this.columns==c){
                for(int i=0; i<r; i++){
                    for(int j=0; j<c; j++){
                        result[i][j]= (T) (Double.valueOf(m[i][j].doubleValue()+matrix[i][j].doubleValue()));
                    }
                }
                displayResultMatrix(result);
            }
            else{
                System.out.println("ROWS and COLUMNS both should be same for addition for matrices");
        }
        }
        else{
            System.out.println("ROWS and COLUMNS both should be same for addition for matrices");
    }
    }

    public void difference(T[][] matrix , int r, int c){
        T[][] result = (T[][]) new Number[rows][columns];
        if(this.rows==r){
            if(this.columns==c){
                for(int i=0; i<r; i++){
                    for(int j=0; j<c; j++){
                        result[i][j]= (T) (Double.valueOf(m[i][j].doubleValue()-matrix[i][j].doubleValue()));
                    }
                }
                displayResultMatrix(result);
            }
            else{
                System.out.println("ROWS and COLUMNS both should be same for subtraction of matrices");
            }
        }
        else{
                System.out.println("ROWS and COLUMNS both should be same for subtraction of matrices");
        }
    }

    public void multiply(T[][] matrix, int r, int c) {
        if (this.columns != r){
            System.out.println("Number of columns in the first matrix must be equal to the number of rows in the second matrix for multiplication.");
        }
        else{
            T[][] result = (T[][]) new Number[this.rows][this.columns];
            for (int i = 0; i < this.rows; i++) {
                for (int j = 0; j < matrix[0].length; j++) {
                    T sum = (T) Double.valueOf(0);
                    for (int k = 0; k < this.columns; k++) {
                        sum = (T) Double.valueOf(sum.doubleValue() + this.m[i][k].doubleValue() * matrix[k][j].doubleValue());
                    }
                    result[i][j] = sum;
                }
            }
            displayResultMatrix(result);
        }
    }

}