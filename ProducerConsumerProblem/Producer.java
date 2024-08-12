package ProducerConsumerProblem;

import java.util.concurrent.BlockingQueue;

class Producer implements Runnable {
    private final BlockingQueue<Integer> queue;
    private final int id;

    public Producer(BlockingQueue<Integer> queue, int id) {
        this.queue = queue;
        this.id = id;
    }

    @Override
    public void run() {
        try {
            for (int i = 0; i < 10; i++) {
                int produced = produce(i);
                System.out.println("Producer " + id + " produced: " + produced);
                queue.put(produced);
                Thread.sleep(100);
            }
        } catch (InterruptedException e) {
            System.out.println("Producer " + id + " was interrupted.");
            Thread.currentThread().interrupt();
        } catch (Exception e) {
            System.out.println("Producer " + id + " encountered an error: " + e.getMessage());
        }
    }

    private int produce(int value) throws Exception {
        if (value == 5) {
            throw new Exception("Failed to produce value: " + value);
        }
        return value;
    }
}

