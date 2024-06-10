package com.example.kunduz_ermekova_2_hw32;

import java.util.ArrayList;

public class Players {
    private int numbers;
    private String name;
    private ArrayList<Integer> points = new ArrayList<>();

    public Players(int numbers, String name) {
        this.numbers = numbers;
        this.name = name;
        this.points = generateRandomPoints();
    }

    public int getNumbers() {
        return numbers;
    }

    public void setNumbers(int numbers) {
        this.numbers = numbers;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public ArrayList<Integer> getPoints() {
        return points;
    }

    public void setPoints(ArrayList<Integer> points) {
        this.points = points;
    }

    private ArrayList<Integer> generateRandomPoints() {
        ArrayList<Integer> points = new ArrayList<>();
        for (int i = 0; i < 5; i++) {
            points.add((int) (Math.random() * 100));
        }
        return points;


    }

    @Override
    public String toString() {
        return "Players{" +
                "numbers=" + numbers +
                ", name='" + name + '\'' +
                ", points=" + points +
                '}';
    }
}