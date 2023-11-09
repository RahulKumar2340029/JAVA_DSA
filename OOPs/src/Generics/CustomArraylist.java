package Generics;

import java.util.Arrays;

public class CustomArraylist {
    private int[] data;
    private static int DEFAULT_SIZE=3;
    private int size = 0;

    public CustomArraylist() {
        this.data = new int[DEFAULT_SIZE];
    }
    public void add(int num){
        if (isFull()){
            resize();
        }
        data[size++] =num;
    }

    private void resize() {
        int[] temp = new int[data.length*2];
        for (int i = 0; i <data.length ; i++) {
            temp[i] = data[i];
        }
        data =temp;
    }
    public int remove(){
        int removed = data[--size];
        return removed;
    }
    public int size(){
        return size;
    }
    public int get(int index){
        return data[index];
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
        CustomArraylist list = new CustomArraylist();
        list.add(45);
        list.add(56);
        list.add(58);
        list.add(49);
        System.out.println(list);
        list.remove();
        System.out.println(list);
    }


}
