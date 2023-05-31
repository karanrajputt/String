import java.util.HashMap;
import java.util.HashSet;
import java.util.Set;

public class alienDictionary {
    public String alienOrder(String []str)
    {
        if(str==null || str.length==0) return "";
        Map<Character,List<Character>>map = new HashMap<>();
        Set<Character>set=new HashSet<>();
        for(String s:str)
        {
            for(char ch: s.toCharArray())
               set.add(ch);
        }
        int []word=new int[26];
        for(int i=1;i<str.length;i++)
        {
            String prev=str[i-1];
            String cur = str[i];
            for(int k=0;k<prev.length()&& cur.length();k++)
            {
                Character c1=prev.charAt(k);
                Character c2=cur.charAt(k);
                if(c1!=c2)
                {
                    if(!map.containsKey(c1)){
                        List<Character>list= new 
                    }
                }
            }
        }
    }
}

