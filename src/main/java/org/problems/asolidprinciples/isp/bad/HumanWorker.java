package org.problems.asolidprinciples.isp.bad;

public class HumanWorker implements Worker {

    @Override
    public void work() {
        System.out.println("Human worker is working");
    }

    @Override
    public void eat() {
        System.out.println("Human worker is eating");
    }
}
