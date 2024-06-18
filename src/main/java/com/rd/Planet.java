package com.rd;

public enum Planet {
    Mercury(1, 50, 1000, 18),
    Venus(2, 100, 500, 45),
    Earth(3, 150, 1300, 20),
    Mars(4, 200, 1800, 8),
    Jupiter(5, 300, 2700, 33),
    Saturn(6, 400, 3200, 44),
    Uranus(7, 450, 2700, 22),
    Neptune(8, 570, 900, 7);

    private final int ProximityToTheSunRanking;
    private final int DistanceFromSun;
    private final int RadiusofPlanet;
    private final int RotationTime;

    Planet(int ProximityToTheSunRanking, int DistanceFromSun, int RadiusofPlanet, int RotationTime) {
        this.ProximityToTheSunRanking = ProximityToTheSunRanking;
        this.DistanceFromSun = DistanceFromSun;
        this.RadiusofPlanet = RadiusofPlanet;
        this.RotationTime = RotationTime;
    }
    public int getProximityToTheSunRanking() {
        return ProximityToTheSunRanking;
    }
    public int getDistanceFromSun() {
        return DistanceFromSun;
    }
    public int getRadius() {
        return RadiusofPlanet;
    }
    public int getRotationTime() {
        return RotationTime;
    }
}
