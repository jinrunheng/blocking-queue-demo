package com.github.blockingqueuedemo;

import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.BlockingQueue;

public class Main {
    public static void main(String[] args) {
        // 阻塞队列的最大长度为 10
        BlockingQueue<Integer> queue = new ArrayBlockingQueue<>(10);
        // 一个生产者,最多生产 100 个数据
        new Thread(new Producer(queue)).start();

        // 三个消费者线程
        new Thread(new Consumer(queue)).start();
        new Thread(new Consumer(queue)).start();
        new Thread(new Consumer(queue)).start();
    }
}
