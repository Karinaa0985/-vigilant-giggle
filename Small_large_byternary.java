class Small_large_byternary{

    public static void main(String[] args){
        int a=10,b=20,c=30;
        int maximum=(a>b)?(a>c?a:c):(b>c?b:c);
        System.out.println("largest of all is "+maximum);
        int minimum=(a<b)?(a<c?a:c):(b<c?b:c);
        System.out.println("Smallest of all is "+minimum);
}
}