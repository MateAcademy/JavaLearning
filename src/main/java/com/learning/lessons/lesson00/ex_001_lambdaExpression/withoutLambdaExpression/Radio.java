package com.learning.lessons.lesson00.ex_001_lambdaExpression.withoutLambdaExpression;

public class Radio implements ElectricityConsumer{

    private void playMusic() {
        System.out.println("Radio plays");
    }

    @Override
    public void electricityOn(Object sender) {
        playMusic();
    }
}
