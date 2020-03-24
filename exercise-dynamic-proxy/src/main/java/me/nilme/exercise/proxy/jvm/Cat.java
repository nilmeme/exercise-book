package me.nilme.exercise.proxy.jvm;

class Cat implements Animal {
    @Override
    public void eat() {
        System.out.println("The cat is eating");
    }
}