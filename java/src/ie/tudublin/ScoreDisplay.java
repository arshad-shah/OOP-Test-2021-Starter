package ie.tudublin;

import java.util.ArrayList;
import java.lang.Character;
import java.lang.String;

import processing.core.PApplet;

public class ScoreDisplay extends PApplet {
	String score = "DEFGABcd";
	// String score = "D2E2F2G2A2B2c2d2";
	// String score = "DEF2F2F2EFA2A2B2AFD2E2D2D2D2";
	// String score = "D1E1F2F2F2E1F1A2A2B2A1F1D2E2D2D2D2";

	// note class instances
	ArrayList<Note> Notes = new ArrayList<Note>();
	Note n;

	/**
	 * Loads the score onto the Array list
	 * 
	 * @param score The score to be loaded in String format
	 */
	public void loadScore() {

		// variables
		char note = ' ';
		int duration = 0;

		for (int i = 0; i < score.length(); i++) {
			char value = score.charAt(i);
			Boolean digit = Character.isDigit(value);
			if (digit == true) {
				// change into number and store in separate arraylist
				duration = value - '0';
				// System.out.println("Duration value: " + duration);
			} else if (digit == false) {
				note = value;
				// System.out.println("Note: " + note);
			}
			if (duration != 0) { // make notes
				n = new Note(note, duration);
				Notes.add(n);
				duration = 0;
			}
		}
	}

	/**
	 * Prints the Array list of notes to Standard output
	 */
	public void printScore(ArrayList<Note> notes) {

		// print header
		System.out.println("\nNote	  Duration	  Type\n");

		for (int i = 0; i < notes.size(); i++) {
			Note note = Notes.get(i);
			int time = note.getDuration();
			if (time == 1) {
				System.out.println(note.toString() + "		Quaver\n");
			} else {
				System.out.println(note.toString() + "		Crotchet\n");
			}
		}
	}

	/**
	 * Draws the stave lines
	 */
	public void staveLines(float halfHeight) {
		strokeWeight(3);

		line(0, halfHeight, width, halfHeight);
		line(0, halfHeight - 25, width, halfHeight - 25);
		line(0, halfHeight + 25, width, halfHeight + 25);
		line(0, halfHeight - 50, width, halfHeight - 50);
		line(0, halfHeight + 50, width, halfHeight + 50);
	}

	public void settings() {
		size(1000, 500);
	}

	public void setup() {

		// load array list
		loadScore();
		// print score
		printScore(Notes);
	}

	public void draw() {
		background(255);
		float halfHeight = height / 2;

		// draw lines
		staveLines(halfHeight);

		// draw notes
	}

	void drawNotes() {

	}
}
