package com.neuedu.api.object0806.thread02;



public class StorageTest {
    public static void main(String[] args) {
        Storage storage=new Storage();
        Producer producer=new Producer(storage);
        Consumer consumer=new Consumer(storage);

        producer.start();
        consumer.start();
    }
}
