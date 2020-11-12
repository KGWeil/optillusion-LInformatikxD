
import processing.core.PApplet;

/**
 * Klasse Figuren.
 * Beschreibung: Hier sollen mehrere vorgegebene Figuren gezeichnet werden.
 *
 * @author Simon Gebert 
 * @version Feb2020
 */
public class Figuren extends PApplet
{       
    /**
     * settings() Methode 
     * Fenstergröße size(int width, int height) und smooth(int level) muss hier eingestellt werden.
     */
    @Override
    public void settings()
    {
        size(500, 1250); // Festlegen der Fenstergröße
    }        

    public void zeichneBildC() {
        rect (50, 50, 400, 400);
        ellipse (250, 250, 325, 325);
        ellipse (250, 250, 250, 250);
        ellipse (250, 250, 175, 175);
        ellipse (250, 750, 400, 400);
    }

    //***** Zusatzaufgabe bzw. Hausaufgabe *************
    public void zeichneBildA() {
        ellipse (250, 250, 400, 400);
        rect (50, 450, 400, 400);
        triangle(250, 850, 50, 1200, 450, 1200);
    }

    /**
     * Die setup() Methode wird einmal aufgerufen, wenn das Programm startet.
     * Hier werden Einstellungen wie die Hintergrundfarbe vorgenommen
     * und Medien wie Bilder und Schriftarten geladen.
     */
    @Override
    public void setup()
    {
        // zeichneBildC(); // Aufruf deiner Methode
        zeichneBildA();
    }

    /**
     * Mit der main()-Methode wird das Programm gestartet.
     *
     */    
    public static void main(String _args[]){ 
        PApplet.main(new String[] {Figuren.class.getName() });
    }

}
