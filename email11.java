package email;
import java.util.regex.*;    
import java.util.*;    
public class email11{  
    public static void main(String args[]){  
        ArrayList<String> emails = new ArrayList<String>();  
          
        emails.add("noura@domain.co.in");  
        emails.add("arwa@domain.com");  
        emails.add("amal@domain.com");  
        emails.add("sama@domain.co.in");  
        emails.add("lama@yahoo.com");  
        emails.add("ali@yahoo.com.");  
        emails.add("lana@yahoo..com");  
        emails.add("sana@yahoo.c");  
        emails.add("rama@yahoo.corporate");  
        emails.add("mona@domain.com");  
          
        String regex = "^[\\w!#$%&'*+/=?`{|}~^-]+(?:\\.[\\w!#$%&'*+/=?`{|}~^-]+)*@(?:[a-zA-Z0-9-]+\\.)+[a-zA-Z]{2,6}";  
         
        Pattern pattern = Pattern.compile(regex);  
        
        for(String email : emails){  
            
            Matcher matcher = pattern.matcher(email);  
            System.out.println(email +" : "+ matcher.matches()+"\n");  
        }  
    }  
}  