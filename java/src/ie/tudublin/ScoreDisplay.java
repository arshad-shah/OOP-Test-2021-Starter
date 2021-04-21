package ie.tudublin;

import java.util.ArrayList;
import java.lang.Character;
import java.lang.String;

import processing.core.PApplet;

public class ScoreDisplay extends PApplet {
	// String score = "DEFGABcd";
	// String score = "D2E2F2G2A2B2c2d2";
	// String score = "DEF2F2F2EFA2A2B2AFD2E2D2D2D2";
	String score = "D1E1F2F2F2E1F1A2A2B2A1F1D2E2D2D2D2";

	// note class instances
	ArrayList<Character> Notes = new ArrayList<Character>();
	Note notes;

	/**
	 * Loads the score onto the Array list
	 * 
	 * @param score The score to be loaded in String format
	 */
	public void loadScore() {
		for (int i = 0; i < score.length(); i++) {
			char value = score.charAt(i);
			Notes.add(value);
		}
	}

	/**
	 * Prints the Array list of notes to Standard output
	 */
	public void printScore(ArrayList<Character> notes) {

		// print header
		System.out.println("\nNote		Duration	Type\n");

		// print the Array list chars
		for (Character note : notes) {
			Boolean digit = Character.isDigit(note);
			if (digit == true) {
				// change into number and store in separate arraylist
				int num = note - '0';

				System.out.printf("		%d", num);
				// type printout
				if (num == 1) {
					System.out.printf("		Crotchet\n");
				} else if (num == 2) {
					System.out.printf("		Quaver\n");
				}
			} else {
				System.out.printf(" %c", note);
			}
		}
	}

	public void settings() {
		size(1000, 500);

		//// How to convert a character to a number
		// char c = '7'; // c holds the character 7 (55)
		// int i = c - '0'; // i holds the number 7 (55 - 48)
		// println(i);
	}

	public void setup() {

		// load array list
		loadScore();
		// notes = new Note(key, display)
		printScore(Notes);

	}

	public void draw() {
		background(255);

	}

	void drawNotes() {

	}
}
