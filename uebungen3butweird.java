 
import processing.core.PApplet;
import processing.core.PFont;

public class uebungen3butweird extends PApplet
{   int black=0;
    int white=255;
    /**
     * settings() Methode 
     * Fenstergröße size(int width, int height) und smooth(int level) muss hier eingestellt werden.
     */
    @Override
    public void settings()
    {
        size(1000,1000);
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
        fill(black);
        for (int j=0; j<12; j++){
            for (int i=0; i<12; i++){
                square(20+i*80, 20+j*80, 40);
                square(60+i*80, 60+j*80, 40);
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
            return black;

        } else{
            return white;

        }

    }

    /**
     * Mit der main()-Methode wird das Programm gestartet.
     *
     */    
    public static void main(String _args[]){ 
        PApplet.main(new String[] {uebungen3butweird.class.getName() });
    }

}
