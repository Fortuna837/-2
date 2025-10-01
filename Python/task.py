# ПРИМЕР бинарной кучи

import heapq

heap = []
heapq.heappush(heap, 5)
heapq.heappush(heap, 2)
heapq.heappush(heap, 8)

min_val = heapq.heappop(heap)
print(f"Минимальное значение: {min_val}")  
print(f"Оставшиеся элементы: {heap}")      

# ПРИМЕР Хеш-таблицы

student_grades = {}
student_grades["Анна"] = 5
student_grades["Иван"] = 4
student_grades["Мария"] = 5

print(f"Оценка Анны: {student_grades['Анна']}")
del student_grades["Иван"]

# ПРИМЕР Числа Фибоначчи

def fibonacci(n):
    if n <= 1:
        return n
    return fibonacci(n-1) + fibonacci(n-2)

print(f"10-е число Фибоначчи: {fibonacci(10)}")
