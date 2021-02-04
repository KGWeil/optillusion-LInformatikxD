
import processing.core.PApplet;
import processing.core.PFont;

public class uebungen3 extends PApplet
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
        //iddle(10,10,0,true);
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
        fill(white);

        for (int j=0; j<12; j++){
            for (int i=0; i<24; i++){
                if(i<6||i>17||j<3||j>8){  //6-6 o l  17-17 u r
                    square(25+i*40, 25+j*80, 10); //obere linke ecke jede 1. 
                    farbe=farbwechsel(farbe);
                    fill(farbe);
                    square(25+i*40, 65+j*80, 10);//unter rechte ecke jede 1.
                    farbe=farbwechsel(farbe);
                    fill(farbe);
                    square(45+i*40, 45+j*80, 10);//oben links jede 2.
                    farbe=farbwechsel(farbe);
                    fill(farbe);
                    square(45+i*40, 85+j*80, 10);//unten rechts jede 2.
                } 
                else
                { 
                }
            }
        }
    }

    public void middle(int x, int y, int farbe, boolean links)
    {
        fill(black);
        for (int j=0; j<6; j++){
            for (int i=0; i<6; i++){
                square(260+i*80, 260+j*80, 40); 
                // farbe=farbwechsel(farbe);
                // fill(farbe);
                // square(260+i*80, 300+j*80, 40);
                // farbe=farbwechsel(farbe);
                // fill(farbe);
                // square(45+i*40, 45+j*80, 10);
                // farbe=farbwechsel(farbe);
                // fill(farbe);
                // square(45+i*40, 85+j*80, 10);
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
        PApplet.main(new String[] {uebungen3.class.getName() });
    }

}
