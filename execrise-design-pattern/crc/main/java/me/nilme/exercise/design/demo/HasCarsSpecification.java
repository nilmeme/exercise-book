package me.nilme.exercise.design.demo;

import me.nilme.exercise.design.CompositeSpecification;

// 有车
public class HasCarsSpecification extends CompositeSpecification {

    @Override
    public boolean isSatisfiedBy(Object params) {
        Men m = (Men) params;
        return m.cars > 0;
    }
}