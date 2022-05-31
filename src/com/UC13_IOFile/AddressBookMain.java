package com.UC13_IOFile;

import java.util.*;
public class AddressBookMain {
public static Scanner sc = new Scanner(System.in);
private static AddressBook addressBook = new AddressBook();
public Map<String,AddressBook> addressBookListMap = new HashMap<>();
	
	public static void main(String[] args) {
		 System.out.println("Welcome to addresbook");
		 boolean flag = true;
		 while(flag) {
			 System.out.println("Select following options");
			 System.out.println("1.Write Data into file");
			 System.out.println("2.Read Data from console");
			 String addressBookName = null;
			 
			 System.out.println("Enter the Choice: ");
	            int option = sc.nextInt();
	            switch (option){
	                case 1:
	                    System.out.println("Enter the Name of Address Book: ");
	                    addressBookName = sc.next();
	                        break;
	                case 2:
	                	System.out.println("Write Data from console");
	                	addressBook.writeData(addressBookName);
	                	break;
	                case 3:
	                	System.out.println("Read Data into File");
	                	addressBook.readData(addressBookName);
	                	break;
	                case 4:
	                	System.out.println("Exit");
	                	flag = false;
	                	break;
			 }
		 }
	}
}
