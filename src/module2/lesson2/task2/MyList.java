package module2.lesson2.task2;

import java.lang.reflect.Array;
import java.util.Arrays;

public class MyList<E> {
    private E[] objects;
    private int size = 0;


    public MyList() {
        this.objects = (E[]) new Object[3];
        this.size = 0;
    }

    public boolean add(E object) {
        if (size == objects.length) {
            Object[] tempObjects;
            tempObjects = Arrays.copyOf(this.objects, this.objects.length * 2, this.objects.getClass());
            this.objects = (E[]) tempObjects;
        }
        this.objects[this.size] = object;
        this.size++;
        return true;
    }
    @Override
    public String toString() {
        return Arrays.toString(Arrays.copyOfRange(this.objects, 0, this.size));
    }

 


}
