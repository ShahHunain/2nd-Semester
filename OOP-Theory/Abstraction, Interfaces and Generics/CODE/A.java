class A<T> {
    private T x;
    A( T x1){
        this.x=x1;
    }
   public T getX(){
        return this.x;
    }

    public <T> void print(T data) {
        System.out.println("Generics Method:");
        System.out.println("Data Passed: " + data);
    }
    public static <E> void display(E[] arr) {
        for (E element : arr){
            System.out.printf("%s" ,element);
        }


    }

}
