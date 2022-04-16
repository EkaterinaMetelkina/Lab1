package com.company;
//Класс, отвечающий за вывод простых чисел в диапазне от 2 до 100 включительно
public class Primes {
    //Метод перебора чисел от 2 до 100 и вывод простых чисел из этого списка
    public static void main(String[] args){
        for (int i = 2; i <= 100; i++){
            if (isPrime(i)){
                System.out.println(i);
            }
        }
    }
    //Метод проверки на простое число
    public static boolean isPrime(int n){
        for (int i = 2; i < n; i++){
            if (n%i == 0){
                return(false);
            }
        }
        return(true);
    }
}
