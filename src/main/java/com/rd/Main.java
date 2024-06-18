package com.rd;

public class Main {
    public static void main(String[] args) {
        for (Planet planet : Planet.values()) {
            System.out.println("Planet: " + planet);
            System.out.println("Proximity To The Sun Ranking: " + planet.getProximityToTheSunRanking());
            System.out.println("Distance from Sun: " + planet.getDistanceFromSun() + " million km");
            System.out.println("Radius of Planet: " + planet.getRadius() + " km");
            System.out.println("Rotation Time of Planet: " + planet.getRotationTime()  + "\n");
        }
    }
}