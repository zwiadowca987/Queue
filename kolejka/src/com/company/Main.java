package com.company;

import java.util.PriorityQueue;
import java.util.Queue;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        //creating Queue
        Queue<Integer> myIntQueue = new PriorityQueue<>();


        //adding five elements
        myIntQueue.add(1);
        myIntQueue.add(2);
        myIntQueue.add(8);
        myIntQueue.add(4);
        myIntQueue.add(5);

        //showing first element
        System.out.println("First element of this Queue:");
        System.out.println(myIntQueue.peek());

        //getting new element
        Scanner input = new Scanner(System.in);

        System.out.println("Give me a number:");
        int number = input.nextInt();

        System.out.println("Your number: " + number);

        myIntQueue.add(number);

        System.out.println("New first element of this Queue: ");
        System.out.println(myIntQueue.peek());

        myIntQueue.remove();

        //showing the size of queue
        System.out.println("Size of Queue: ");
        System.out.println(myIntQueue.size());
    }
}
