import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class groupAnagramsTogether {
    public static void print(String []str)
    {
        Map<String,List<String>>map= new HashMap<>();
        for(String s:str)
        {
             char [] ca=s.toCharArray();
             Arrays.sort(ca);
             String keyWord= new String(ca);
             if(map.containsKey(keyWord)){
             map.get(keyWord).add(s);
             }
             else{
                List<String> list=new ArrayList<>();
                list.add(s);
                map.put(keyWord,list);
             }
        }

        for(String s:map.keySet()){
            List<String>value= map.get(s);
            if(value.size()>1)
            System.out.println(value);
        }
    }
    public static void main(String[] args) {
        String arr[]={"cat","dog","tac","god"};
        print(arr);
    }
}