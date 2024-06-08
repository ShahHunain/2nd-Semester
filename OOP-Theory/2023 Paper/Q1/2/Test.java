class Test{
    private static int count;

    Test fun(){
        count++;
        System.out.println(count);
        return this;
    }

    public static void main(String[] args) {
        Test t = new Test();
        t.fun().fun().fun().fun();
        Test t2 = new Test();
        t2.fun().fun().fun().fun();
    }
}