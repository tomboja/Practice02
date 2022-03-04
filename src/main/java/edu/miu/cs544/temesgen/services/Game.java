package edu.miu.cs544.temesgen.services;

/**
 * @ProjectName: Practice02
 * @Author: Temesgen D.
 * @Date: 3/3/22
 */

public class Game {
    private Vehicle vehicle;

    public Game(Vehicle vehicle) {
        this.vehicle = vehicle;
    }

    public void play() {
        vehicle.move();
    }

    @Override
    public String toString() {
        return "Game{" +
                "vehicle=" + vehicle +
                '}';
    }
}
