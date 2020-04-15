package me.nilme.exercise.java.design.demo;

import me.nilme.exercise.design.CompositeSpecification;

// 有房
public class HasHousesSpecification extends CompositeSpecification {

      @Override
      public boolean isSatisfiedBy(Object params) {
            Men m = (Men)params;
            return m.houses > 0;
      }
}