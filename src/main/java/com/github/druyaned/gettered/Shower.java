package com.github.druyaned.gettered;

import java.time.LocalDate;
import java.time.Month;

/**
 * This project is created to test {@link Gettered} annotation
 * and its {@link Compiler}; to run <b>enter the following commands</b>
 * in the {@code Terminal} app while being in the project directory:
 * <pre>
 * java -jar gettered-1.0.jar;
 * java -cp target/classes com.github.druyaned.gettered.Shower;
 * </pre>
 * 
 * @author ed
 */
public class Shower {
    
    public static void main(String[] args) {
        Car[] cars = new Car[] {
            new Car("Mercedes C-Class", LocalDate.of(2020, Month.DECEMBER, 24)),
            new Car("Audi A5", LocalDate.of(2021, Month.MAY, 27))
        };
        Person[] persons = new Person[] {
            new Person("Ivan", LocalDate.of(2000, Month.JANUARY, 12), 174),
            new Person("Sasha", LocalDate.of(2001, Month.FEBRUARY, 3), 174)
        };
        System.out.println("Cars:");
        for (int i = 0; i < cars.length; ++i) {
            LocalDate made = cars[i].getMade();
            System.out.printf("%d: name=%s, made=%tY-%tb-%td\n",
                    i, cars[i].getName(), made, made, made);
        }
        System.out.println("Persons:");
        for (int i = 0; i < persons.length; ++i) {
            LocalDate birthDate = persons[i].getBirthDate();
            System.out.printf("%d: name=%s, birthDate=%tY-%tb-%td, heightCm=%d\n",
                    i, persons[i].getName(), birthDate, birthDate, birthDate,
                    persons[i].getHeightCm());
        }
    }
    
}
