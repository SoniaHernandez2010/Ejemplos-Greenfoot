import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Pelota here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Pelota extends Actor
{
    private int incx;
    private int incy;
    
    public Pelota()
    {
        incx = 10;
        incy = 10;
    }
    
    @Override
    public void act() 
    {
        // Consulta las coordenadas actuales heredadas de actor
        int posx = this.getX();
        int posy = this.getY();
        
        // Calculamos las nuevas coordenadas
        int nuevox = posx + incx;
        int nuevoy = posy + incy;
        
        // Accedemos al mundo para conocer su tamaño
        World mundo = this.getWorld();
        if(nuevox > mundo.getWidth())
        {
            incx = -incx;
        }
        if(nuevoy > mundo.getHeight())
        {
            incy = -incy;
        }
        if(nuevoy < 0)
        {
            incy = -incy;
        }
        if(nuevox < 0)
        {
            incx = -incx;
        }
        
        // Cambiamos de posicion a la pelota
        this.setLocation(nuevox, nuevoy);
    }    
}
