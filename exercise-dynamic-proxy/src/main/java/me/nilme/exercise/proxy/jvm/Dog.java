package me.nilme.exercise.proxy.jvm;

class Dog implements Animal {
    @Override
    public void eat() {
        System.out.println("The dog is eating");
    }
}