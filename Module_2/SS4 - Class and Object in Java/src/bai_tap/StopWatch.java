package bai_tap;

import java.util.Scanner;
import java.util.ServiceConfigurationError;

public class StopWatch {
    long startTime, endTime;


    public long getEndTime() {
        return this.endTime;
    }

    public long getStartTime() {
        return this.startTime;
    }

    public void start() {
        this.startTime = System.currentTimeMillis();
    }

    public void stop() {
        this.endTime = System.currentTimeMillis();
    }

    private long getElapsedTime() {
        return (endTime - startTime);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        StopWatch stopWatch = new StopWatch();
        stopWatch.start();
        System.out.println(stopWatch.startTime);
        for (int i = 0; i < 5; i++) {
            scanner.nextInt();
        }
        stopWatch.stop();
        System.out.println(stopWatch.endTime);
        System.out.println(stopWatch.getElapsedTime());
    }
}
