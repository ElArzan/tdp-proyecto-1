package launcher;

import entities.Student;
import gui.SimplePresentationScreen;

public class Launcher {
	public static void main(String [] args) {
        //Schedule a job for the event-dispatching thread:
        //creating and showing this application's GUI.
        javax.swing.SwingUtilities.invokeLater(new Runnable() {
            public void run() {
            	Student alumno = new Student(127411, "Arzan", "Enzo", "elarzan@gmail.com", "https://github.com/ElArzan/tdp-proyecto-1", "/images/MiFoto.jpeg");
            	SimplePresentationScreen s = new SimplePresentationScreen(alumno);
            	s.setVisible(true);
            }
        });
    }
}