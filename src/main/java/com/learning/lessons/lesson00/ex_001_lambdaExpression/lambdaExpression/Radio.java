package com.learning.lessons.lesson00.ex_001_lambdaExpression.lambdaExpression;

public class Radio implements ElectricityConsumer {

    private void playMusic() {
        System.out.println("Radio plays");
    }

    public void electricityOn(Object sender) {
        playMusic();
    }
}
