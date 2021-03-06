package me.nilme.exercise.java.design;

public class OrSpecification extends CompositeSpecification {

      private final Specification b;
      private final Specification a;

      public OrSpecification(Specification a, Specification b) {
            this.a = a;
            this.b = b;
      }
     
      @Override
      public boolean isSatisfiedBy(Object params) {
            return a.isSatisfiedBy(params) || b.isSatisfiedBy(params);
      }
}