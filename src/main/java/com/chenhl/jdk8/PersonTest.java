package com.chenhl.jdk8;

import java.util.Arrays;
import java.util.List;
import java.util.function.BiFunction;
import java.util.stream.Collectors;

/**
 * @description: PersonTest
 * @author: TF019387 chenhonglei
 * @date: 2017/11/11 21:53
 */
public class PersonTest {

    public static void main(String[] args) {
        Person person1 = new Person("zhangsan", 20);
        Person person2 = new Person("lisi", 30);
        Person person3 = new Person("wangwu", 40);

        List<Person> people = Arrays.asList(person1, person2, person3);

        PersonTest personTest = new PersonTest();
//        System.out.println(personTest.getPersonByUsername("lisi", people));

//        System.out.println(personTest.getPersonByAge(25, people));

        BiFunction<Integer, List<Person>, List<Person>> biFunction = (paramAge, paramList) ->
                paramList.stream().filter(person -> person.getAge() >  paramAge).collect(Collectors.toList());

        System.out.println(personTest.getPersonByAge2(30, people, biFunction));
    }

    public List<Person> getPersonByUsername(String username, List<Person> people) {
        return people.stream().filter(person -> person.getUsername().equals(username)).collect(Collectors.toList());
    }

    public List<Person> getPersonByAge(int age, List<Person> people) {
        BiFunction<Integer, List<Person>, List<Person>> biFunction = (paramAge, paramList) ->
            paramList.stream().filter(person -> person.getAge() >  paramAge).collect(Collectors.toList());
        return biFunction.apply(age, people);
    }

    public List<Person> getPersonByAge2(int age, List<Person> people, BiFunction<Integer, List<Person>, List<Person>> biFunction) {
        return biFunction.apply(age, people);
    }
}
