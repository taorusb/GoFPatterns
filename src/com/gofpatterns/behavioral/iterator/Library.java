package com.gofpatterns.behavioral.iterator;

public class Library implements Collection {

    private String[] booksNames;

    public Library(String[] booksNames) {
        this.booksNames = booksNames;
    }

    public String[] getBooksNames() {
        return booksNames;
    }

    public void setBooksNames(String[] booksNames) {
        this.booksNames = booksNames;
    }

    @Override
    public Iterator getIterator() {
        return new BooksIterator();
    }

    private class BooksIterator implements Iterator {

        private int index;

        @Override
        public boolean hasNext() {
            if (index < booksNames.length) {
                return true;
            }
            return false;
        }

        @Override
        public Object next() {
            return booksNames[index++];
        }
    }
}
