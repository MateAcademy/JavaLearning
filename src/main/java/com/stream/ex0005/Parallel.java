package com.stream.ex0005;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.ForkJoinPool;
import java.util.function.BiConsumer;
import java.util.stream.Collectors;

/**
 * @author Sergey Klunniy
 */
public class Parallel {
    public static void main(String[] args) {
        List<Integer> integerList = new ArrayList<>() {{
            add(5);
            add(6);
            add(7);
            add(8);
            add(9);
            add(10);
            add(11);
            add(12);
        }};

        ForkJoinPool forkJoinPool = new ForkJoinPool(2);
//      forkJoinPool.submit(()->integerList.stream().parallel().
//             forEach(u ->System.out.println(Thread.currentThread().getName())));

//        List<Integer> list = forkJoinPool
//                .submit(()->integerList
//                        .stream()
//                        .parallel()
//                        .collect(ArrayList::new,
//                                (konteyner, element)-> konteyner.add(element),
//                                (T, U) -> T.addAll(U)));

        //integerList.stream().parallel().forEach(u ->System.out.println(Thread.currentThread().getName()));

    }
}
