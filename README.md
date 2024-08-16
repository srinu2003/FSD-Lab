# FSD-Lab
Full Stack Development Lab Course

Lab 1: Installing Eclipse IDE and Java

Q. Program to print even numbers from 1 to 10
```java
class EvenOneToTen {
    public static void main(String[] args) {
        for (int i = 1; i <= 10; i++) {
            if (i % 2 == 0) {
                System.out.println(i);
            }
        }
    }
}
```
Output:
```
2
4
6
8
10
```
```java
class EvenOneToTen {
    public static void main(String[] args) {
        System.out.println("Even numbers from 1 to 10 are:");
        System.out.println("2\n4\n6\n8\n10");
    }
}
```
Output:
```
Even numbers from 1 to 10 are:
2
4
6
8
10
```
Q. Program to print odd numbers from 1 to 10
```java
class OddOneToTen {
    public static void main(String[] args) {
        for (int i = 2; i <= 10; i+=2) {
            System.out.println(i);
        }
    }
}
```
Output:
```
2
4
6
8
10
```