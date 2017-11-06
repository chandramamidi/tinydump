import java.util.ArrayDeque;
import java.util.HashMap;
import java.util.Map;

public class ExpParser {
    private Map<String,String> kv = null;  
    public ExpParser() {
        kv = new HashMap<>();
        kv.put("{","}");
        kv.put("(",")");
        kv.put("[","]");        
    }
    private String parseExpression(String str) {
        String result="BAD";
        int alen = str.length();
        ArrayDeque<String> dups = new ArrayDeque<>();
        
        for(int i=0; i < alen;i++) {
         String s = str.substring(i,i+1);
         
         if(kv.containsKey(s)) {
             dups.push(kv.get(s));
         }else{
             String a = dups.peek();
             if((a == null) || (!a.equals(s))) {
                 return result;
             }else{
                dups.pop();
             }
         }
        }
        
        if(!dups.isEmpty()) {
            result = "BAD";
        }else{
            result = "GOOD";
        }
        return result;
    }
    
    public void printStr(String x) {
        int blen = x.length();
        for(int k=0; k<blen;k++) {
            System.out.print(x.substring(k,k+1));
        }
    }
    
    public static void main(String args[]) {
        
        ExpParser me = new ExpParser();
        String s1 = "[{}]()]";//BAD
        String s2 = "[[{}]()]";//GOOD
        
        //me.printStr(s1);
        
        System.out.println("" + s1 + " : " + me.parseExpression(s1));
        System.out.println("" + s2 + " : " + me.parseExpression(s2));
        
        
    }
}
