package edu.miu.cs544.temesgen.services;

/**
 * @ProjectName: Practice02
 * @Author: Temesgen D.
 * @Date: 3/3/22
 */

public class Car implements Vehicle{
    @Override
    public void move() {
        System.out.println("Moving at 50 mph");
    }
}
