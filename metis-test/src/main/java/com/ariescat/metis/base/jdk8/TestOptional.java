package com.ariescat.metis.base.jdk8;

import com.ariescat.metis.utils.Person;

import java.util.Optional;
import java.util.function.Function;

/**
 * @author Ariescat
 * @version 2020/11/4 17:15
 */
public class TestOptional {

    public static void main(String[] args) {
        Person jack = new Person(5, "Jack");

        Optional.of(jack).map(Person::getAge).map(Object::toString);
//        Optional.of(jack).map(Person::getAge).map(Integer::toString);
    }
}
