package com.company.lockers;



import java.io.File;
import java.io.FileWriter;
import java.util.Scanner;

public class LockedMe {
	static final String projectPath="D:\\FSD\\JAVA\\JavaProject\\LockedMeFiles";

	public static void main(String[] args) {
		int ch;
		do {
			display();
			
			System.out.println("Please enter your choice:");
			Scanner scn =new Scanner(System.in);
			ch=Integer.parseInt(scn.nextLine());
			
			
			switch(ch){
				case 1:displayAllFiles();
						break;
				case 2:createFile();
						break;
				case 3:deleteFile();
						break;
				case 4:searchFile();
						break;
				case 5:System.exit(0);
						break;
				default: System.out.println("Invalid option");
						break;
			}
		}while(ch>0);
		

	}
	
	public static void display() {
		System.out.println("***************************************************************");
		System.out.println("\tWelcome to Company Lockers-LockedMe.com");
		System.out.println("\tDeveloper's name: Kalyan Chakravarthy B");
		System.out.println("***************************************************************");
		System.out.println("\t1.Display all the files");
		System.out.println("\t2.Add files to existing directory");
		System.out.println("\t3.Delete a file");
		System.out.println("\t4.Search for a file");
		System.out.println("\t5.Exit");
		System.out.println("***************************************************************");
	}
	
	public static void displayAllFiles() {
		File files=new File(projectPath);
		File[] listOfFiles=files.listFiles();
		if(listOfFiles.length==0)
			System.out.println("The directory is empty");
		else {
			for(File f:listOfFiles) {
				System.out.println(f.getName());
			}
		}
	}
	
	public static void createFile() {
		try {
			Scanner sc1=new Scanner(System.in);
			String fileName;
			int linesCount;
			
			System.out.println("Enter the new file name:");
			fileName=sc1.nextLine();
			
			System.out.println("Enter how many lines of data to enter in file:");
			linesCount=Integer.parseInt(sc1.nextLine());
			FileWriter fw= new FileWriter(projectPath+"\\"+fileName);
			
			for(int i=1;i<=linesCount;i++) {
				System.out.println("Enter data of line"+i+" :");
				fw.write(sc1.nextLine()+"\n");
			}
			System.out.println("flie creation is successful!");
			fw.close();
		}
		catch(Exception Ex) {
			System.out.println("some error occured, see below for more details");
			System.out.println(Ex);
		}
	}
	
	public static void deleteFile() {
		try {
			Scanner sc2=new Scanner(System.in);
			System.out.println("Enter file name to delete: ");
			String fileName=sc2.nextLine();
			
			File fl=new File(projectPath+"\\"+fileName);
			
			if(fl.exists()) {
				fl.delete();
				System.out.println(fileName+" file is deleted succesfully");
			}
			else
				System.out.println("Entered file does not exist in directory");
		}
		catch(Exception ex) {
			System.out.println("Some error occured");
			
		}
	}
	
	public static void searchFile() {
		Scanner sc3=new Scanner(System.in);
		System.out.println("Enter file name to serch:");
		String fileName=sc3.nextLine();
		
		File fl=new File(projectPath+"\\"+fileName);
		
		if(fl.exists()) {
			System.out.println("entered file exists in directory");
		}
		else
			System.out.println("entered file doesnt exist");
	}

}
