class logicalorop{
    public static void main(String[] args) {
        int x=10, y=5, z=30;
        if(x<y||(++x<z)){
            System.err.println("The condition is executed successfullllyy");
        }else{
           System.err.println("else block executed");
     }
    System.err.println("value of x: "+x);
    ++x;
    System.err.println("x: "+x);
    }
}