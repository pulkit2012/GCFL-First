package GCFL;

import java.util.Arrays;
import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;

public class RunnerUp {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int tc=sc.nextInt();
        sc.nextLine();
        while(--tc>-1){

            String s=sc.nextLine();
            char c[]=s.toCharArray();
            Arrays.sort(c);
            s=String.valueOf(c);
            TreeMap<Integer,String> m=new TreeMap<>();
            while(s.length() > 0)
            {
                int i1=s.length();
                String z=String.valueOf(s.charAt(s.length()-1));
                s=s.replace(z,"");
                m.put(i1-s.length(), z);
            }
            int i=1;
            for(Map.Entry<Integer,String> u: m.entrySet())
            {
                if(m.size()==1){
                    System.out.println("-1");
                    break; }

                else if(i==m.size()-1)
                    System.out.println(u.getValue());

                ++i;
            }
        }
    }
}
