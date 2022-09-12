import java.util.Scanner;
import java.util.HashSet;
public class Main {
     public static void main(String[] args){
         Scanner input = new Scanner(System.in);
         String str = input.nextLine();
         HashSet<Character> letters = new HashSet<>();
         String noDupes="";
         for (int i=0; i<str.length(); i++)
         {
             char c = str.charAt(i);
             if(!letters.contains(c))
             {
                 letters.add(str.charAt(i));
                 noDupes+=c;
             }
         }

         String bin;
         String result;
         int length = noDupes.length();
         for (int i=(int)Math.pow(2,length); i<Math.pow(2,length+1);i++)
         {
             result="";
             bin = Integer.toBinaryString(i).substring(1);
             System.out.println(bin);
             for(int j=0; j<bin.length();j++)
             {

                 if(bin.charAt(j)=='1')
                 {
                     result+=noDupes.charAt(j);
                 }

             }
             System.out.println(result);

         }

     }
}
