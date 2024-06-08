public class Main{
    public static void main(String[] args) {
        
        System.out.println("\n--------Shah Hunain(23K-3032)--------\n");

        Integer m1[][]={
                {1,2},
                {3,4},
                {5,6}
            };

        Matrix m = new Matrix<>(3, 2);
        m.setM(m1);
        m.display();

        Integer m2[][]={
            {0,1},
            {3,2},
            {5,4}
        };
        m.sum(m2, 3, 2);
        m.difference(m2, 3, 2);
        m.multiply(m2, 3, 2);

        Integer m3[][]={
            {1,2},
            {3,4},
        };

        Matrix<Integer> M = new Matrix<>(2, 2);
        M.setM(m3);

        Integer m4[][]={
            {0,1},
            {3,2},
        };
        M.multiply(m4, 2, 2);

    }
}