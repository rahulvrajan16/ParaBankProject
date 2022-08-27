package programs;

import java.util.HashMap;

public class PorgramHashmap {
    public static void main(String[] args) {
        HashMap<String,String> obj = new HashMap<>();
        obj.put("name","Rahul");
        obj.put("DOB","06/11/1992");
        obj.clear();
        System.out.println(obj.get("name"));

        String str = "Welcome";
        for(int i=0;i<str.length();i++){
        if(str.charAt(i)=='a'||str.charAt(i)=='e'||str.charAt(i)=='i'||str.charAt(i)=='o'||str.charAt(i)=='u') {
            System.out.println("Given string contains:"+ str.charAt(i)+" at the index"+i);
        }
        }
    }
}
