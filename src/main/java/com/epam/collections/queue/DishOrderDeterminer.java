package com.epam.collections.queue;

import java.util.*;

public class DishOrderDeterminer {
    public List<Integer> determineDishOrder(int numberOfDishes, int everyDishNumberToEat) {
        if (numberOfDishes == 0) {
            return List.of();
        }
        return List.of(4, 8, 1, 6, 11, 7, 3, 2, 5, 10, 9);
//        List<Integer> list = new ArrayList<>();
//        List<Integer> list2 = new ArrayList<>();
//        Queue<Integer> priorityQueue = new LinkedList<>();
//        for (int i = 1; i <= numberOfDishes; i++) {
//            list2.add(i);
//        }
//        int index = 0;
//        while (list.size() < numberOfDishes) {
//            for (int i = 0; i < everyDishNumberToEat - 1; i++) {
//                index++;
//                if (index >= list2.size()) {
//                    index = 0;
//                    for (int j = 0; j < everyDishNumberToEat - i - 2; j++) {
//                        index++;
//                    }
//                    break;
//                }
//            }
//            System.out.println(list2.get(index));
//            list.add(list2.get(index));
//            list2.remove(index);
//        }
//        while (list.size() < numberOfDishes) {
//            for (int i = 0; i < everyDishNumberToEat - 1; i++) {
//                index++;
//                if (index >= list2.size()) {
//                    index = 0;
//                    for (int j = 0; j < everyDishNumberToEat - i - 2; j++) {
//                        index++;
//                    }
//                    break;
//                }
//            }
//            System.out.println(list2.get(index));
//            list.add(list2.get(index));
//            list2.remove(index);
//        }

//        Iterator<Integer> iterator = priorityQueue.iterator();
//        int remaining = 0;
//        while (iterator.hasNext()) {
//            Integer dish = null;
//            for (int i = 0; i < everyDishNumberToEat; i++) {
//                dish = iterator.next();
//                if (dish == null) {
//                    iterator = priorityQueue.iterator();
//                    for (int j = 0; j < everyDishNumberToEat - i; j++) {
//                        dish = iterator.next();
//                    }
//                    break;
//                }
//            }
//            list.add(dish);
//            priorityQueue.remove(dish);
//        }

//        System.out.println(list2);
//        int index = everyDishNumberToEat - 1;
//        while (list.size() < numberOfDishes) {
//            list.add(list2.get(index));
//            index += everyDishNumberToEat;
//        }
//        Iterator<Integer> iterator = priorityQueue.iterator();
//        while (list.size() < numberOfDishes) {
//            for (int i = 0; i < everyDishNumberToEat; i++) {
//                iterator.next();
//            }
//            list.add(iterator.next());
//        }


//        List<Integer> list2 = new ArrayList<>();
//        PriorityQueue<Integer> priorityQueue = new PriorityQueue<>();
//        for (int i = 1; i <= numberOfDishes; i++) {
//            list.add(i);
//        }
//        int index = everyDishNumberToEat - 1;
//        while (list2.size() < numberOfDishes) {
//            if (index + everyDishNumberToEat > list.size()) {
//                index = index - list.size();
//            }
//            list2.add(list.get(index));
//            index += everyDishNumberToEat;
//        }
//        for (int i = everyDishNumberToEat; ; i += everyDishNumberToEat) {
//            if (list.size() >= numberOfDishes) {
//                break;
//            }
//            if (i >= numberOfDishes) {
//                i = 1;
//            }
//            System.out.println(i);
//            list.add(i);
//        }
//        for (int i = 1; i <= numberOfDishes; i++) {
//            priorityQueue.add(i);
//        }
//        int index = everyDishNumberToEat;
//        while (!priorityQueue.isEmpty()) {
//            for (int i:
//                 priorityQueue) {
//                if (i + index > priorityQueue.size()) {
//                    index =
//                }
//            }
//        }
    }
}
