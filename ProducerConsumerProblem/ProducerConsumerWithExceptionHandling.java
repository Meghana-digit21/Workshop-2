package ProducerConsumerProblem;

import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.BlockingQueue;

public class ProducerConsumerWithExceptionHandling {
    public static void main(String[] args) {
        BlockingQueue<Integer> queue = new ArrayBlockingQueue<>(5);

        Producer producer1 = new Producer(queue, 1);
        Producer producer2 = new Producer(queue, 2);
        Consumer consumer1 = new Consumer(queue, 1);
        Consumer consumer2 = new Consumer(queue, 2);

        Thread producerThread1 = new Thread(producer1);
        Thread producerThread2 = new Thread(producer2);
        Thread consumerThread1 = new Thread(consumer1);
        Thread consumerThread2 = new Thread(consumer2);

        producerThread1.start();
        producerThread2.start();
        consumerThread1.start();
        consumerThread2.start();

        try {
            producerThread1.join();
            producerThread2.join();
            consumerThread1.join();
            consumerThread2.join();
        } catch (InterruptedException e) {
            System.out.println("Main thread was interrupted.");
        }
    }
}
