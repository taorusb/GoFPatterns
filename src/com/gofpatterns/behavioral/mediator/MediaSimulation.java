package com.gofpatterns.behavioral.mediator;

import java.util.ArrayList;
import java.util.List;

public class MediaSimulation {
    public static void main(String[] args) {

        FirstChannel firstChannel = new FirstChannel();
        List<Person> personList = new ArrayList<>();
        President president = new President(firstChannel, "Vova");

        personList.add(new SimpleManOfThePeople("Jonny", firstChannel));
        personList.add(new SimpleManOfThePeople("Carl", firstChannel));
        personList.add(new SimpleManOfThePeople("Anthony", firstChannel));

        firstChannel.setPresident(president);
        firstChannel.setPersonList(personList);

        president.speak("Hello world!");
    }
}
