package com.gofpatterns.behavioral.mediator;

import java.util.List;

public class FirstChannel implements Press {

    private List<Person> personList;
    private Person president;

    public void setPersonList(List<Person> personList) {
        this.personList = personList;
    }

    public void setPresident(Person president) {
        this.president = president;
    }

    @Override
    public void notify(String info, Person person) {
        personList.stream()
                .filter(x -> !x.equals(person))
                .forEach(x -> x.listen(info));
        president.listen(info);
    }
}
