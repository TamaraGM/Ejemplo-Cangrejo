import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class cangrejo here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class cangrejo extends Actor
{
    private Counter vidas;
    private Counter puntaje;
    
    public cangrejo()
    {
        puntaje = new Counter("Puntos: ");
        puntaje.setValue(0);
    }
    p
    public void act() 
    {
        super.move(4);
        if(Greenfoot.isKeyDown("right")){
        turn(3);
    } 
    if(Greenfoot.isKeyDown("left"))
    {
        turn(-3);
    }
    if(isTouching(Wrom.class))
    {
        removeTouching(Wrom.class);
        Greenfoot.playSound("eating.wav");
    }
    if(isTouching(Lobster.class))
    {
        vidas.setvaule(vidas.getValue()-1);
        setLocation(250,250);
        Label perdiste = new Label("Perdiste una vida",30);
        getWorld().addObject(perdiste,250,250);
        Greenfoot.delay(50);
        getWorld().removeObject(perdiste);
        getWorldOfType(cangrejo.class).accedeLangosta().setLocation(250,500);
    }
}  
}
