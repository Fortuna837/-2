# ПРИМЕР бинарной кучи

import java.util.PriorityQueue;

public class Main {
    public static void main(String[] args) {
        PriorityQueue<Integer> minHeap = new PriorityQueue<>();
        minHeap.add(5);
        minHeap.add(2);
        minHeap.add(8);
        System.out.println("Минимальное значение: " + minHeap.peek());
        minHeap.poll();
    }
}

# ПРИМЕР Хеш-таблицы

  import java.util.HashMap;

public class Main {
    public static void main(String[] args) {
        HashMap<String, Integer> studentGrades = new HashMap<>();
        studentGrades.put("Анна", 5);
        studentGrades.put("Иван", 4);
        
        System.out.println("Оценка Анны: " + studentGrades.get("Анна"));
        studentGrades.remove("Иван");
    }
}

# ПРИМЕР числа Фибоначчи

public class Main {
    public static int fibonacci(int n) {
        if (n <= 1) return n;
        return fibonacci(n-1) + fibonacci(n-2);
    }
    
    public static void main(String[] args) {
        System.out.println("10-е число Фибоначчи: " + fibonacci(10));
    }
}
