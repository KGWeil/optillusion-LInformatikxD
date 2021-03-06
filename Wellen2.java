
import processing.core.PApplet;
import processing.core.PFont;


public class Wellen2 extends PApplet
{   int green=0xff1caf37;
    int white=255;
    /**
     * settings() Methode 
     * Fenstergröße size(int width, int height) und smooth(int level) muss hier eingestellt werden.
     */
    @Override
    public void settings()
    {
        size(700, 700);
    }        

    /**
     * Die setup() Methode wird einmal aufgerufen, wenn das Programm startet.
     * Hier werden Einstellungen wie die Hintergrundfarbe vorgenommen
     * und Medien wie Bilder und Schriftarten geladen.
     */
    @Override
    public void setup()
    {
        background(255);
        strokeWeight(0);
        zeichneQuadrate(10, 10, 0, true);
        innereQuadrate(10,10,white,true);
        
    }

    /**
     * Methode zeichneQuadrat
     *
     * @param x x-koordinate
     * @param y y-koordinate
     * @param farbe füllfarbe des quadrats
     * @param links falls links true: kreise links; falls links false: kreise rechts
     */
    public void zeichneQuadrate(int x, int y, int farbe, boolean links)
    {
        fill(28,175,56);
        for (int j=0; j<11; j++){
            for (int i=0; i<11; i++){
                square(0+i*100, 0+j*100, 50);
                square(50+i*100, 50+j*100, 50);
            }
        }
    }

    /**
     * Die Methode wird nach der setup() Methode aufgerufen
     * und führt den Code innerhalb ihres Blocks fortlaufend aus,
     * bis das Programm gestoppt oder noLoop() aufgerufen wird.
     */

    public void innereQuadrate(int x, int y, int farbe, boolean links)
    {
        fill(farbe);
        for (int j=0; j<11; j++){
            for (int i=0; i<11; i++){
                square(5+i*100, 5+j*100, 40); 
                square(55+i*100, 55+j*100, 40);
                farbe=farbwechsel(farbe);
                fill(farbe);
                square(55+i*100, 5+j*100, 40);
                square(5+i*100, 55+j*100, 40);
                farbe=farbwechsel(farbe);
                fill(farbe);
            }
        }
    }

    public int farbwechsel(int farbe)
    { 
        if (farbe==white) {
            return green;

        } else{
            return white;
        
        }

    }

    /**
     * Mit der main()-Methode wird das Programm gestartet.
     *
     */    
    public static void main(String _args[]){ 
        PApplet.main(new String[] {Wellen2.class.getName() });
    }

}
