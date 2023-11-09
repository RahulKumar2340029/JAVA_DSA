package Generics;

import java.util.Arrays;

public class CustomGenArraylist<T> {
    private Object[] data;
    private static int DEFAULT_SIZE=3;
    private int size = 0;

    public CustomGenArraylist() {
        this.data = new Object[DEFAULT_SIZE];
    }
    public void add(T num){
        if (isFull()){
            resize();
        }
        data[size++] =num;
    }

    private void resize() {
        Object[] temp = new Object[data.length*2];
        for (int i = 0; i <data.length ; i++) {
            temp[i] = data[i];
        }
        data =temp;
    }
    public T remove(){
        T removed = (T)(data[--size]);
        return removed;
    }
    public int size(){
        return size;
    }
    public T get(int index){
        return (T)(data[index]);
    }
    public void set(int index,T value){
        data[index] = value;
    }

    @Override
    public String toString() {
        return "CustomArraylist{" +
                "data=" + Arrays.toString(data) +
                ", size=" + size +
                '}';
    }

    private boolean isFull() {
        return size == data.length;
    }

    public static void main(String[] args) {
        CustomGenArraylist<Integer> list = new CustomGenArraylist<>();
        list.add(1);
        list.add(5);
        list.add(12);
        list.add(100);
        System.out.println(list);


    }
}
