import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class MyWorld here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class MyWorld extends greenfoot.World
{
    private cangrejo crab;
    private GreenfootSound musica;
    private Counter vidas;
    private Lobster lobster;
    
    public MyWorld(int numGusanos)
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(560, 560, 1); 
        crab = new cangrejo();
        this.addObject(crab,102,70);
        Tiempo tiempo = new Tiempo();
        this.addObject(tiempo,60,20);
        lobster= new Lobster();
        addObject(lobster, 243, 147);
        vidas= new Counter ("vidas: ");
        this.addObject(vidas,500,20);
        vidas.setValue(3);
        creaGusanos(numGusanos);
        //prepare(totalGusanos);
        musica = new GreenfootSound("ufo-t-balt.mp3");
    }
    public void started ()
    {
        musica.playLoop();
    }
    public void stopped ()
    {
       musica.pause();
    }

    private void prepare()
    {
        Lobster lobster = new Lobster();
        addObject(lobster,266,160);
        
    }
    public void creaGusanos(int n)
    {
        for (int i=0; i < n; i ++)
        {
            Wrom wrom;
            wrom = new Wrom();
            this.addObject(wrom,Greenfoot.getRandomNumber(499),Greenfoot.getRandomNumber(499));
        }
    }
    
     public void decrementaVidas()
   {
       int valor = vidas.getValue() - 1;
       vidas.setValue(valor);
       crab.setLocation(102,70);
       if(valor == 0)
       {
           Greenfoot.stop();
       }
       
   }
   
   public Lobster accedeLangosta()
   {
       return lobster;
   }
}
