package App;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
public class App{
public static void main(String[] args) throws FileNotFoundException {	
	String text = "hello everyone,this is java FSD course";
	try{
	FileWriter writer = new FileWriter("demo.txt");
	writer.write(text);
	writer.flush();
	writer.close();
	}catch(Exception e) {
	e.getStackTrace();
}
 try {
	            FileReader reader = new FileReader("demo.txt");
	            FileWriter writer = new FileWriter("hi world.txt");
	            int c = 0;
	            while((c = reader.read()) !=-1){
	                writer.write(c);
	                writer.flush(); }
	            writer.append(" in progress.");
	            writer.close();
	            reader.close();
	            System.out.println("....Done...."); }   
	        catch (Exception e){
	            e.printStackTrace(); } }}