
import processing.core.PApplet;
import processing.core.PFont;

/**
 * Klasse Wellen1.
 * Beschreibung: 
 *
 * @author (Ihr Name) 
 * @version (eine Versionsnummer oder ein Datum)
 */
public class Wellen1 extends PApplet
{   int s=100;
    int d=25;
    /**
     * settings() Methode 
     * Fenstergröße size(int width, int height) und smooth(int level) muss hier eingestellt werden.
     */
    @Override
    public void settings()
    {
        size(800, 400);
    }        

    /**
     * Die setup() Methode wird einmal aufgerufen, wenn das Programm startet.
     * Hier werden Einstellungen wie die Hintergrundfarbe vorgenommen
     * und Medien wie Bilder und Schriftarten geladen.
     */
    @Override
    public void setup()
    {
        strokeWeight(0);
        zeichneQuadrat(10, 10, 0, true);
    }
  
    /**
     * Methode zeichneQuadrat
     *
     * @param x x-koordinate
     * @param y y-koordinate
     * @param farbe füllfarbe des quadrats
     * @param links falls links true: kreise links; falls links false: kreise rechts
     */
    public void zeichneQuadrat(int x, int y, int farbe, boolean links)
    {
        fill(farbe);
        square(x, y, s);
        fill(255);
        circle(x+s/8, y+s/8, s/4); 
        circle(x+s/8, y+s-s/8, s/4);
        circle(x+s-s/8, y+s/8, s/4);
        circle(x+s-s/8, y+s-s/8, s/4);
    }
    
    /**
     * Die draw() Methode wird nach der setup() Methode aufgerufen
     * und führt den Code innerhalb ihres Blocks fortlaufend aus,
     * bis das Programm gestoppt oder noLoop() aufgerufen wird.
     */
    @Override
    public void draw()
    {

    }

    /**
     * Mit der main()-Methode wird das Programm gestartet.
     *
     */    
    public static void main(String _args[]){ 
        PApplet.main(new String[] {Wellen1.class.getName() });
    }

}
