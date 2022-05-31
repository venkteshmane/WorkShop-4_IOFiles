package com.UC13;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.*;


public class InputOutputStreams {
	public static void main(String[] args) {
		createFile();
		getFileInformation();
		writingToFile();
		readFile();

		}
public static void createFile() {
File file = new File("C:\\Users\\user\\Desktop\\WorkShop4\\WorkShop-4.txt");
try {
if(file.createNewFile()){
System.out.println("File Created "+file.getName());
}else{
System.out.println("File exist "+file.getName());
}
} catch (IOException e) {
e.printStackTrace();
}

}

public static void getFileInformation() {
File file = new File("C:\\Users\\user\\Desktop\\WorkShop4\\WorkShop-4.txt");
if(file.exists()) {
System.out.println("File name " + file.getName());
System.out.println("Readable " + file.canRead());
System.out.println("Writable " + file.canWrite());
System.out.println("Excecutable " + file.canExecute());
System.out.println("Absolute path " + file.getAbsolutePath());
System.out.println("path " + file.getPath());
System.out.println("path " + file.length());
}
}
public static void writingToFile(){
File file = new File("C:\\Users\\user\\Desktop\\WorkShop4\\WorkShop-4.txt");
try {
FileWriter fileWriter = new FileWriter(file);
String contentOfFile="Hi welcome to AddressBook. " +
"This is ";
fileWriter.write(contentOfFile);
fileWriter.close();
} catch (IOException e) {
e.printStackTrace();
}
}

public static void readFile(){
File file = new File("C:\\Users\\user\\Desktop\\WorkShop4\\WorkShop-4.txt");
try {
Scanner scanner = new Scanner(file);
while(scanner.hasNextLine()){
String readLine = scanner.nextLine();
System.out.println(readLine);
}
} catch (FileNotFoundException e) {
e.printStackTrace();
}
}
}