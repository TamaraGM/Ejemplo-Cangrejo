import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class MyWorld here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class MyWorld extends greenfoot.World
{

    /**
     * Constructor for objects of class MyWorld.
     * 
     */
    public MyWorld()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(560, 560, 1); 
        Tiempo tiempo = new Tiempo();
        this.addObject(tiempo,60,20);
        //prepare();
    }

    /**
     * Prepare the world for the start of the program.
     * That is: create the initial objects and add them to the world.
     */
    private void prepare()
    {
        Lobster lobster = new Lobster();
        addObject(lobster,266,160);
        Wrom wrom = new Wrom();
        addObject(wrom,476,108);
        Wrom wrom2 = new Wrom();
        addObject(wrom2,187,69);
        Wrom wrom3 = new Wrom();
        addObject(wrom3,488,275);
        Wrom wrom4 = new Wrom();
        addObject(wrom4,45,167);
        Wrom wrom5 = new Wrom();
        addObject(wrom5,502,511);
        Wrom wrom6 = new Wrom();
        addObject(wrom6,38,305);
        Wrom wrom7 = new Wrom();
        addObject(wrom7,346,38);
        Wrom wrom8 = new Wrom();
        addObject(wrom8,83,48);
        Wrom wrom9 = new Wrom();
        addObject(wrom9,36,503);
        Wrom wrom10 = new Wrom();
        addObject(wrom10,232,500);
        cangrejo cangrejo = new cangrejo();
        addObject(cangrejo,257,361);
        Wrom wrom11 = new Wrom();
        addObject(wrom11,385,232);
        Wrom wrom12 = new Wrom();
        addObject(wrom12,408,416);
        Wrom wrom13 = new Wrom();
        addObject(wrom13,133,391);
        Wrom wrom14 = new Wrom();
        addObject(wrom14,158,239);
    }
}
