package main;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Random;
import java.util.Scanner;

/**
 * 
 * @author JCY
 *
 */
public class Main {
	
	/**
	 * Funci�n main que llama a la funci�n principal 'start'
	 * @param args
	 */
	public static void main(String[] args) {
		try {
			Engine engine = new Engine();
			engine.start();
		} catch (IOException e) {
			System.out.println("Error - Main: " + e.getMessage());
		}
	}
}
