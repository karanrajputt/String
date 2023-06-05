import java.util.Scanner;

public class countPalindromic {
    public static int count(String s)
    {
        int len=s.length(),ans=0;
        for(int i=0;i<len;i++)
        {
            int j=i,k=i+1;
           while(j>=0&&k<len-1 && s.charAt(k++)==s.charAt(j--))  ans++;
                // ans+=(k-j)*(k-j+1)/2;
           j=i-1;k=i+1;
           while(j>=0&&  k<len && s.charAt(k++)==s.charAt(j--))  ans++;

        }
        return ans;
    }
    public static void main(String[] args) {
       /*  Scanner sc= new Scanner(System.in);
        String s=sc.nextLine();*/
        String str="abbaeae";
        System.out.println(count(str));
    }
}
