package oop.exercises;
import java.util.Scanner;
/*
 * UCF cop3330 Summer 2021 Assignment 1 solutions
 * Copyright 2021 Keondez Robinson
 */
public class Main
{
    public static void main(String[] args)
    {
        int people, pizzas, pieces, rem, slices, totalSlices;
        Scanner input;

        input = new Scanner(System.in);

        System.out.print("How Many people? ");
        people = input.nextInt();
        System.out.print("How many pizzas do you have? ");
        pizzas = input.nextInt();
        System.out.print("How many slices per pizza? ");
        slices = input.nextInt();

        totalSlices = (pizzas * slices);

        System.out.println(people + " people with " + pizzas + " pizzas " + "(" + totalSlices + " slices)");

        pieces = (pizzas * slices) / people;
        rem = (pizzas * slices) % people;

        System.out.println("Each person gets " + pieces + " pieces of pizza. ");
        System.out.println("There are " + rem + " leftover pieces. ");
    }
}
