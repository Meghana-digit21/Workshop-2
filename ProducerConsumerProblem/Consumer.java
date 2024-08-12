package ProducerConsumerProblem;

import java.util.concurrent.BlockingQueue;

class Consumer implements Runnable {
    private final BlockingQueue<Integer> queue;
    private final int id;

    public Consumer(BlockingQueue<Integer> queue, int id) {
        this.queue = queue;
        this.id = id;
    }

    @Override
    public void run() {
        try {
            while (true) {
                int consumed = consume(queue.take());
                System.out.println("Consumer " + id + " consumed: " + consumed);
                Thread.sleep(150);
            }
        } catch (InterruptedException e) {
            System.out.println("Consumer " + id + " was interrupted.");
            Thread.currentThread().interrupt();
        } catch (Exception e) {
            System.out.println("Consumer " + id + " encountered an error: " + e.getMessage());
        }
    }

    private int consume(int value) throws Exception {
        if (value == 7) {
            throw new Exception("Failed to consume value: " + value);
        }
        return value;
    }
}


