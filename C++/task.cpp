# ПРИМЕР бинарной кучи

#include <iostream>
#include <queue>
using namespace std;

int main() {
    priority_queue<int, vector<int>, greater<int>> minHeap;
    minHeap.push(5);
    minHeap.push(2);
    minHeap.push(8);
    cout << "Минимальное значение: " << minHeap.top() << endl;
    minHeap.pop();
    return 0;
}

# ПРИМЕР хеш-таблицы

  #include <iostream>
#include <unordered_map>
using namespace std;

int main() {
    unordered_map<string, int> student_grades;
    student_grades["Анна"] = 5;
    student_grades["Иван"] = 4;
    
    cout << "Оценка Анны: " << student_grades["Анна"] << endl;
    student_grades.erase("Иван");
    return 0;
}

# ПРИМЕР числа Фибоначчи

#include <iostream>
using namespace std;

int fibonacci(int n) {
    if (n <= 1) return n;
    return fibonacci(n-1) + fibonacci(n-2);
}

int main() {
    cout << "10-е число Фибоначчи: " << fibonacci(10) << endl;
    return 0;
}
