package app;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class DataHandler {

    private static final Lock lock = new ReentrantLock();

    public static int modify(int num){
        lock.lock();
        try {
            num = num * 3;
            return num;
        } finally {
            lock.unlock();
        }
    }
}
