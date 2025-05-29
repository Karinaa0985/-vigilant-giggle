class Ntimes_call_method{
    void hello()
    {
        System.out.println("Hello java by hello method");
    }
    public static void main(String[] args) {
        Ntimes_call_method n1=new Ntimes_call_method();
        int ntimes=10;
        for(int i=1;i<ntimes;i++){
            n1.hello();
        }
    }
}