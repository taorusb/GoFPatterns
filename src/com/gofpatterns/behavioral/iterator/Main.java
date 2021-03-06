package com.gofpatterns.behavioral.iterator;

public class Main {
    public static void main(String[] args) {
        String[] names = {"Arrowsmith", "Atlas shrugged", "Dear friend"};

        Library library = new Library(names);
        Iterator iterator = library.getIterator();

        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }
    }
}
