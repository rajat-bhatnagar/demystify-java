package com.thoughtworks.corejava.generics;

/**
 * Created by rajatbhatnagar on 1/24/16.
 */
public abstract class Fruit implements Comparable<Fruit> {
    protected String name;
    protected int size;

    public Fruit(String name, int size) {
        this.name = name;
        this.size = size;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Fruit)) return false;

        Fruit fruit = (Fruit) o;

        if (size != fruit.size) return false;
        if (name != null ? !name.equals(fruit.name) : fruit.name != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = name != null ? name.hashCode() : 0;
        result = 31 * result + size;
        return result;
    }

    public int compareTo(Fruit that){
        return  this.size < that.size ?  -1 :
                this.size == that.size ? 0 : 1;
    }

}
