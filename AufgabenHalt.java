
import processing.core.PApplet;
import processing.core.PFont;

/**
 * Klasse AufgabenHalt.
 * Beschreibung: 
 *
 * @author (Ihr Name) 
 * @version (eine Versionsnummer oder ein Datum)
 */
public class AufgabenHalt extends PApplet
{       
    /**
     * settings() Methode 
     * Fenstergröße size(int width, int height) und smooth(int level) muss hier eingestellt werden.
     */
    @Override
    public void settings()
    {
        size(1000, 1000);
    }        

    /**
     * Die setup() Methode wird einmal aufgerufen, wenn das Programm startet.
     * Hier werden Einstellungen wie die Hintergrundfarbe vorgenommen
     * und Medien wie Bilder und Schriftarten geladen.
     */
    @Override
    public void setup()
    {
        zeichneKreise();

    }

    public void zeichneQuadrate()
    {  
        for (int i=0; i<=10;i++) {
            square(10+i*50, 10, 50);

        }
    }

    
    public void zeichneKreise()
    {
        for (int i=0; i<=20; i++) {
            circle(500, 500, 460-i*25);      
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
        PApplet.main(new String[] {AufgabenHalt.class.getName() });
    }

}
