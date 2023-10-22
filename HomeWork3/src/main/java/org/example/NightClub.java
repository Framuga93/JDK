package org.example;

import java.util.Iterator;

public class NightClub<T extends Person> implements Iterable<T> {
    private T[] community;

    public NightClub(T[] community) {
        this.community = community;
    }

    public void haveRest() {
        for (T t : community)
            t.haveRest();
    }

    @Override
    public Iterator<T> iterator() {
        return new ParamIterator<T>();

    }

    class ParamIterator<T extends Person> implements Iterator<T> {
        private int index = 0;


        @Override
        public boolean hasNext() {
            return index < community.length;
        }

        @Override
        public T next() {
            return (T) community[index++];
        }
    }
}

