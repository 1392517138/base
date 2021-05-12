package com.wangyi.async.chapter03;

import java.util.concurrent.CompletableFuture;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import java.util.function.Supplier;

/**
 * @author piwenjing
 */
public class Test {
    private static final int AVALIABLE_PROCESSOR = Runtime.getRuntime().availableProcessors();

    public static void main(String[] args) {
        ThreadPoolExecutor b1 = new ThreadPoolExecutor(AVALIABLE_PROCESSOR, AVALIABLE_PROCESSOR * 2, 1,
                TimeUnit.MINUTES, new LinkedBlockingQueue<>(5));
        CompletableFuture<String> completableFuture = CompletableFuture.supplyAsync(new Supplier<String>() {
            @Override
            public String get() {
                return null;
            }
        });
    }
}