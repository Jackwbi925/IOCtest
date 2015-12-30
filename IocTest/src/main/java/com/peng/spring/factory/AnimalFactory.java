package com.peng.spring.factory;

import com.peng.spring.model.Animal;
import com.peng.spring.model.impl.Dog;
import com.peng.spring.model.impl.Duck;

/**
 * Created by Jack on 2015/12/30.
 */
public class AnimalFactory {
    public Animal getAnimal(String type) {
        switch (type){
            case "dog":
                return new Dog();
            case "duck":
                return new Duck();
        }
        return null;
    }
}
