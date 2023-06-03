public class columnName {
    public static void  titleToNumber(int  n)
    {
        String res="";
        while(n!=0){
            char ch = (char)((n-1)%26+65);
            n=(n-1)/26;
            res = ch+res;
        }
        System.out.println(res);
    }
    public static void main(String[] args) {
        titleToNumber(51);
    }
}
