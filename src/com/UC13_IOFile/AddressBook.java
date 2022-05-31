package com.UC13_IOFile;

import java.nio.file.Files;
import java.nio.file.Paths;
import java.io.File;
import java.io.IOException;
import java.util.*;

public class AddressBook {
	public static Scanner sc = new Scanner(System.in);
    public ArrayList<Contact> contactList = new ArrayList<>();
	public void writeData(String writeAddressBookName) {
	    StringBuffer buffer = new StringBuffer();
	    contactList.forEach(addressBook -> {
	        String dataString = addressBook.toString().concat("\n");
	        buffer.append(dataString);
	    });
	    try {
	        Files.write(Paths.get("C:\\Users\\user\\Desktop\\WorkShop4\\WorkShop-4.txt"), buffer.toString().getBytes());

	    } catch (IOException x) {

	    }
	}
	    public void readData(String readAddressBookName) {
	        try {
	            Files.lines(new File("C:\\Users\\user\\Desktop\\WorkShop4\\WorkShop-4.txt").toPath()).map(line -> line.trim()).forEach(line -> System.out.println(line));

	        } catch (IOException x) {

	        }
	    }
	}
