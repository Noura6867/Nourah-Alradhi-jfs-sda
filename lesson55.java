package project1;
import java.util.Scanner;
import java.util.ArrayList;
import java.util.Collections;
public class project1 {
public static void main(String[] args) {
System.out.println("Welcom in tiLockers Pvt. Ltd \t \t Developer by Nourah");	


menu list = new menu();
list.work();}}
class menu{
Scanner in = new Scanner(System.in);
ArrayList<String> list = new ArrayList<String>();

public void work() {
String name ;
int number ;

while(true) {
System.out.println("1.Menu");
System.out.println("2.Exit ");			
if (in.nextInt()==2) {
break;}else {
					
System.out.println(" ");
					
while(true) {
System.out.println("1.INSERT");
System.out.println("2.DELETE ");
System.out.println("3.SEARCH");
System.out.println("4.DISPLAY");
System.out.println("5.Exit");
System.out.println("Enter Your choice:");
number = in.nextInt();
System.out.println(" ");
						
if(number==1) {
							
System.out.println("enter tha file name :");
name = in.next();
System.out.println(" ");
							
if(add(list,name)) {
System.out.println("file has been inserted ");
								
}else {
System.out.println("this file name  exists");}}
						
else if(number==2) {
							
System.out.println("enter tha file name :");
name = in.next();
System.out.println(" ");
							
if(delete(list, name)) {
System.out.println("file has been deleted ");}
else {System.out.println("this file dose not exist");}}
else if(number==3) {
System.out.println("enter tha file name :");
name = in.next();
System.out.println(" ");
if(search(list, name)) {
	System.out.println("this file has been found in the list");}
else {System.out.println("the file was not found");}}
else if (number==4) {
if(display(list)) {}
else { System.out.println("no files  found");}}
else if (number==5) {
break;}	
System.out.println("\n");}}}}
		
public boolean add(ArrayList<String> list , String item) {
if(search(list,item)) {
return false;
}else {
list.add(item);
return true;}}
		
public boolean delete(ArrayList<String> list , String item) {
if(search(list,item)) {
list.remove(item);
return true;
}else {				
return false;}}
		
public boolean display(ArrayList<String> list) {
if(list.isEmpty()) {
return false;
}else {				
Collections.sort(list);
System.out.println("\n");
for(String s : list) {
System.out.println(s);}
System.out.println("\n");
return true;	}	}
		
public boolean search(ArrayList<String> list , String item) {
for(String s : list) {
if(s.equals(item)) {
return true;}}
return false;	}}