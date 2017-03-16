import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)
import java.util.List;

/**
 * Write a description of class Jugador here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Jugador extends Actor
{
    private boolean disparando;
    
    public Jugador ()
    {
        disparando = false;
    }
    
    @Override
    public void act() 
    {
        // si se presiona flecha derecha
        if(Greenfoot.isKeyDown("right"))
        {
            // muevete a la derecha
            this.setLocation(this.getX() + 5, this.getY() );
        }
        
        // si presiona flecha izquierda
        if(Greenfoot.isKeyDown("left"))
        {
            // muevete a la derecha
            this.setLocation(this.getX() - 5, this.getY() );
        }
        
        // si presiona barra de espacio
        if(Greenfoot.isKeyDown("space") && !disparando)
        {
            // agrega un disparo
            Disparo disparo = new Disparo() ;
            World mundo = this.getWorld();
            mundo.addObject(disparo, this.getX(), this.getY());
            disparando = true;
        }
        
        // revisar cuantos disparos hay en el mundo
        World mundo = this.getWorld();
        List lista = mundo.getObjects(Disparo.class);
        if(lista.isEmpty())
        {
            disparando = false;
        }
    }    
}
