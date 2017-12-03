package cn.abelib.collection;

import java.util.Iterator;

/**
<<<<<<< HEAD
 * Created by abel-huang on 2016/12/25.
=======
 * Created by huangjianjin on 2016/12/25.
>>>>>>> 245eb44931ba0001767e05c615c1e630842b2ec3
 */
public class Stack<Item> implements Iterable<Item>{
    private Item[] a=(Item[])new Object[1];
    private int N=0;
    public Stack(){}

    private void resize(int max){
        Item[] temp=(Item[])new Object[max];
        for(int i=0;i<a.length;i++){
            temp[i]=a[i];
        }
        a=temp;
    }

    public boolean isEmpty(){
        return N==0;
    }

    public void push(Item item){
        if(N==a.length){
            resize(2*a.length);
        }
        a[N++]=item;
    }

    public Item pop(){
        Item item=a[--N];
        a[N]=null;
        if(N>0&&N==a.length/4){
            resize(a.length/2);
        }
        return item;
    }

    public Item peek(){
        Item item=a[N-1];
        return item;
    }

    public int size(){
        return N;
    }


    public Iterator<Item> iterator() {
        return new Itr();
    }

    private class Itr implements Iterator<Item> {
        private int i=N;
        @Override
        public boolean hasNext() {
            return i>0;
        }
        @Override
        public Item next() {
            return a[--i];
        }
        public void remove(){}
    }
 }