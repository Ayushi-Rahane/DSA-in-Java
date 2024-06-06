import java.util.*;
public class find_charcter {
  public static void main(String[] args){
    String s = "Linear in Java";
//    System.out.println(find_char(s,'a'));
    System.out.println(Arrays.toString(s.toCharArray())); 
    System.out.println(s.toCharArray());
    System.out.println(s);
  }    

  static String find_char(String s, char c){
    int f=0,pos=0;
    for(int i=0;i<s.length();i++){
        if(c == s.charAt(i)){
            f=1; 
            pos=i;
        }
    }
    if(f==1){
        return c+" found at position "+pos;
    }
    else{
        return c+" not found";
    }
    

  }
}
