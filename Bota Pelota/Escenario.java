import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class MyWorld here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Escenario extends World
{

    /**
     * Constructor for objects of class MyWorld.
     * 
     */
    public Escenario()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(600, 400, 1, true); 
        prepare();
    }

    @Override
    public void act()
    {
        if(Greenfoot.mouseClicked(this))
        {
            System.out.println("Click en el mundo");
            /*MouseInfo raton = Greenfoot.getMouseInfo();
            System.out.println("Coordenadas x = " + raton.getX() + " , y = " + raton.getY();*/
        }
    }

    /**
     * Prepare the world for the start of the program.
     * That is: create the initial objects and add them to the world.
     */
    private void prepare()
    {
        Jugador jugador = new Jugador();
        addObject(jugador,291,259);
        Pelota pelota = new Pelota();
        addObject(pelota,122,107);
        Pelota pelota2 = new Pelota();
        addObject(pelota2,355,118);
        Pelota pelota3 = new Pelota();
        addObject(pelota3,511,211);
        jugador.setLocation(284,299);
        jugador.setLocation(300,363);
        pelota.setLocation(102,124);
        pelota2.setLocation(284,128);
        pelota3.setLocation(483,123);
        Disparo disparo = new Disparo();
        addObject(disparo,307,322);
        disparo.setLocation(298,319);
        disparo.setLocation(300,319);
        removeObject(disparo);
    }
}
