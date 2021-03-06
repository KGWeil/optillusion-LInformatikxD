
import processing.core.PApplet;
import processing.core.PFont;

/**
 * Klasse Kaffeehaus.
 * Beschreibung: 
 *
 * @author (Ihr Name) 
 * @version (eine Versionsnummer oder ein Datum)
 */
public class Kaffeehaus extends PApplet
{    
    int s=40;
    int[] abstaende = {10, 20, 30, 20, 10, 20, 30, 20, 10, 20};
    /**
     * settings() Methode 
     * Fenstergröße size(int width, int height) und smooth(int level) muss hier eingestellt werden.
     */
    @Override
    public void settings()
    {
        size(600, 400);
    }        

    /**
     * Die setup() Methode wird einmal aufgerufen, wenn das Programm startet.
     * Hier werden Einstellungen wie die Hintergrundfarbe vorgenommen
     * und Medien wie Bilder und Schriftarten geladen.
     */
    @Override
    public void setup()
    {
        background (255);
        stroke(175);
        strokeWeight(2);
        parallelen();
        fill (0);
        zeichneallequadrate();
    }

    /**
     * zeichnet 10 parallelen horizontal (glaub ich xD)
     *
     */
    public void parallelen()
    {
        for (int i=0; i<10; i++){

            line(0, 0+i*s, 600, 0+i*s);
        }
    }

    public void zeichnequadrate(){
        for (int i=0; i<8; i++){
            square(10+i*s*2, 0, s);
        }
    }

    public void zeichneallequadrate(){ 
        for(int k=0; k<10; k++){
            for (int i=0; i<8; i++){
                square(10+i*s*2+ abstaende[k], 0+k*s, s);
            }
        }
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
        PApplet.main(new String[] {Kaffeehaus.class.getName() });
    }

}
