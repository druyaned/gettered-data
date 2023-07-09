package com.github.druyaned.gettered;

import java.time.LocalDate;

/**
 * A simple person-class to test {@link Gettered} annotation.
 * 
 * @author druyaned
 */
@Gettered
public class Person {
    
    private final String name;
    private final LocalDate birthDate;
    private int heightCm = 180;
    
    public Person(String name, LocalDate birthDate, int height) {
        this.name = name;
        this.birthDate = birthDate;
        this.heightCm = height;
    }
            
}
