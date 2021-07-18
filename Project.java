package Project;
import java.io.File;
import java.util.*;


public class Project {
	private int fileno;
	private String filename;
	Project(int fileno , String filename){
		this.fileno = fileno;
		this.filename = filename;
	}
	public int getFileno() {
		return fileno;
	}
	public String getFilename() {
		return filename;
	}
	public String toString(){
		return fileno + ""+ filename;
	}
	}
	class CRUDDemo{
		public static void main(String[] args) {
			System.out.println("Welcom in tiLockers Pvt. Ltd \t \t Developer by Nourah");
			List<File> c=new ArrayList<File>();
			Scanner s = new Scanner(System.in);
			Scanner s1 =new Scanner(System.in);
			int ch;
			do {
				System.out.println("1.INSERT");
				System.out.println("2.DISPLAY");
				System.out.println("3.SEARCH");
				System.out.println("4.DELETE");
				System.out.println("5.UPDATE");
				System.out.println("Enter Your choice:");
				ch = s.nextInt();
				switch(ch) {
				case 1:
				System.out.println("Enter fileno : ");
				int fno = s.nextInt();
				System.out.println("Enter filename : ");
				String fname = s1.nextLine();
				c.add(new File (fnameint fno,String fname));
				break;
				
				case 2 :
				System.out.println("--------------");
				Iterator<File> i = c.iterator();
				while(i.hasNext()) {
					File e =i.next();
					System.out.println(e);
				}
				System.out.println("--------------");
				break;
				
				case 3 :
					boolean found = false;
					System.out.println("Enter fileno to search :");
					int fileno =s.nextInt();
					System.out.println("--------------");
					 i = c.iterator();
					while(i.hasNext()) {
						File e =i.next();
						if(((Project) e).getFileno()== fileno) {
							
						System.out.println(e);
						found = true;
					}
					
					if(!found) {
						System.out.println("record not found");
					}
					System.out.println("--------------");
					break;
					}
					case 4 :
						found = false;
						System.out.println("Enter fileno to delete :");
						fileno =s.nextInt();
						System.out.println("--------------");
						 i = c.iterator();
						while(i.hasNext()) {
							File e =i.next();
							if(((Project) e).getFileno()== fileno) {
								
							i.remove();
							found = true;
						}
						if(!found) {
							System.out.println("record not found");
						}else { 
							System.out.println("record is deleted successfully..!");
						}
					System.out.println("--------------");
					break;
			}
						
					case 5 :
						found = false;
						System.out.println("Enter fileno to update :");
						fileno =s.nextInt();
						System.out.println("--------------");
						 ListIterator<File>li=c.listIterator();
						while(li.hasNext()) {
							File e =li.next();
							if(((Project) e).getFileno()== fileno) {
								
							System.out.println("enter new file name");
							filename=sl.nextLine();
							System.out.println("enter new file no");
							fileno=s.nextLine();
							li.set(new File (int fileno,String filename));
							found = true;
						}
						if(!found) {
							System.out.println("record not found");
						}else { 
							System.out.println("record is updated successfully..!");
						}
					System.out.println("--------------");
					break;
			}
					while (ch!= 0);
				}				}}
			
			
			
	

	
	
      
			
			