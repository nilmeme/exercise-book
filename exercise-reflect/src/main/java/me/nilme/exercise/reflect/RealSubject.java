package me.nilme.exercise.reflect;

class RealSubject implements Subject {

    public void Request() {
        System.out.println("真实的请求");
    }

    @Override
    public void hello(String world) {
        System.out.println("hello" + world);
    }
}