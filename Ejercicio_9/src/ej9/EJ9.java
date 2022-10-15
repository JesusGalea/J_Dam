package ej9;

import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

public class EJ9 {

	public static void main(String[] args) {
		
		FileWriter file = null;
        PrintWriter pw = null;
        
        try {
        	file = new FileWriter(".//prueba.txt");
        	pw = new PrintWriter(file);
        	
        	pw.println("Hola soy Jesus");
        	
        } catch(Exception e) {
        	e.printStackTrace();
        } finally {
        	
        		try {
        			if (null != file) {
					file.close();
        			}
				} catch (IOException e2) {
					
					e2.printStackTrace();
				}
        	}
        }

	}


