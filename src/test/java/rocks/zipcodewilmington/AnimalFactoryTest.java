package rocks.zipcodewilmington;

import org.junit.Assert;
import org.junit.Test;
import rocks.zipcodewilmington.animals.Cat;
import rocks.zipcodewilmington.animals.Dog;
import rocks.zipcodewilmington.animals.animal_creation.AnimalFactory;

import java.util.Date;

/**
 * @author leon on 4/19/18.
 */
public class AnimalFactoryTest {
    //TODO - Create Test for `Animal createDog(String name, Date birthDate)`
    //TODO - Create Test for `Animal createCat(String name, Date birthDate)`

    @Test
    public void createDogTest(){
        String name = "Dog";
        Date Bdate = new Date();
        Dog dog = AnimalFactory.createDog(name,Bdate);

        // When
        String getName = dog.getName();
        Date getBdate = dog.getBirthDate();

        // Then
        Assert.assertEquals(name, getName);
        Assert.assertEquals(Bdate, getBdate);
    }

    @Test
    public void createCatTest(){
        String name = "Cat";
        Date Bdate = new Date();
        Cat cat = AnimalFactory.createCat(name, Bdate);

        // When (we retrieve data from the cat)
        String getName = cat.getName();
        Date getBdate = cat.getBirthDate();

        // Then (we expect the given data, to match the retrieved data)
        Assert.assertEquals(name, getName);
        Assert.assertEquals(Bdate, getBdate);
    }

}
