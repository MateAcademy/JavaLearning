package com.stream.ex0005;

interface Executable {
    int executed(int x, int y);
}


class Runner {
    public int run(Executable ex) {
        ex.executed(5, 10);
        return 5 + 10;
    }
}

//Что такое (Integer::sum)?
public class Test {
    public static void main(String[] args) {
        Runner runner = new Runner();

        int  t = runner.run(Integer::sum);
        System.out.println(t);

    }
}



