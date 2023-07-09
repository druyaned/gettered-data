package com.github.druyaned.gettered;

import java.time.LocalDate;

/**
 * A simple car-class to test {@link Gettered} annotation.
 * 
 * @author druyaned
 */
@Gettered
public class Car {
    
    private final String name;
    private final LocalDate made;
    
    public Car(String name, LocalDate made) {
        this.name = name;
        this.made = made;
    }

}
