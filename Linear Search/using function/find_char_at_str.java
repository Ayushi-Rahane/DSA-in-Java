public class find_char_at_str {

    static int linear_search(String s, char key){
        if(s.length()==0){
            return -1;
        }
        else{
            for(int i=0;i<s.length();i++){
                if(key == s.charAt(i)){
                    return i;
                }
            }
        }
        return -1;
    }
    public static void main(String[] args){
        String s = "This is ayushi";
        char key='a';

        int i = linear_search(s,key);
        if(i==-1){
            System.out.println(key+" not found");
        }
        else{
            System.out.println(key+" found at index "+i);
        }
    }
}
