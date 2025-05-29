class Assigngrade_ternary{
    public static void main(String[] args) {
        int a=80;
        String grade= (a<=50)?"C":(50<a&&a<75)?"B":"A";
        System.err.println(grade);
    }
}