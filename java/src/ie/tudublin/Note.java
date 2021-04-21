package ie.tudublin;

/**
 * Music note
 * 
 * @author Arshad shah
 * 
 */
class Note {

    // variables
    private char note = ' ';
    private int duration = 0;

    /**
     * Constructor for Note
     * 
     * @param note
     * @param duration
     */
    public Note(char note, int duration) {
        this.note = note;
        this.duration = duration;
    }

    public char getNote() {
        return note;
    }

    public int getDuration() {
        return duration;
    }

    public void setDuration(int duration) {
        this.duration = duration;
    }

    public void setNote(char note) {
        this.note = note;
    }

    @Override
    public String toString() {

        return "Note: " + this.note + "---" + "Duration: " + this.duration + "\n";
    }

}