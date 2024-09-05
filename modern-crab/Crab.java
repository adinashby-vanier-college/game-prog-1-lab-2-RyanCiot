// WARNING: This file is auto-generated and any changes to it will be overwritten
import lang.stride.*;
import greenfoot.*;

/**
 * 
 */
public class Crab extends Actor
{

    /* (World, Actor, GreenfootImage, Greenfoot and MouseInfo)*/

    /**
     * Act - do whatever the Crab wants to do. This method is called whenever the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act()
    {
        move(2);
        if (Greenfoot.isKeyDown("right")) {
            turn(3);
        }
        move(2);
        if (Greenfoot.isKeyDown("left")) {
            turn(3);
        }
        move(2);
        Actor Worm = getOneObjectAtOffset(0, 0, Worm.class);
        if (Worm != null) {
            getWorld().removeObject(Worm);
        }
    }
}
