package com.stream;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class LambdasMain {
//задача сортировка массива:

    public static void main(String[] args) {
        String[] colors = {"green", "brown", "ablack", "blue", "pink", "grey", "a1"};

        Player player1 = new Player("Alex", 100);
        Player player2 = new Player("Igor", 100);
        Player player3 = new Player("Viktor", 800);
        Player player4 = new Player("John", 91);

        Player[] players = {player1, player2, player3, player4};

        Arrays.sort(colors);
        System.out.println(Arrays.toString(colors));

        Arrays.sort(colors, new Comparator<String>() {
            @Override
            public int compare(String s1, String s2) {
                System.out.println("Hello world");
                return s1.charAt(s1.length() - 1) - s2.charAt(s2.length() - 1);
            }
        });

        Arrays.sort(colors, (String s1, String s2) -> {
            System.out.println("Hello world");
            return s1.charAt(s1.length() - 1) - s2.charAt(s2.length() - 1);
        });

        System.out.println(Arrays.toString(colors));

//      List<String> collect = Arrays.stream(colors).sorted((a, b) -> a.length() - b.length()).collect(Collectors.toList());
//      System.out.println(collect);

//TODO: если мы то же самое сделаем с Player?

//      Arrays.sort(players);  //ClassCastException, не можем привести Player к Comparable

        Arrays.sort(players, new Comparator<Player>() {
            @Override
            public int compare(Player p1, Player p2) {
                return p1.score - p2.score;
//              return p2.score - p1.score;
            }
        });

        Arrays.sort(players, new Comparator<Player>() {
            @Override
            public int compare(Player p1, Player p2) {
                if ((p2.score - p1.score) != 0) {
                    return p2.score - p1.score;
                } else {
                    return p1.name.compareTo(p2.name);
                }

            }
        });

        System.out.println(Arrays.toString(players));

//мы знаем что такое метод, функция это что-то похожее, лямбда выражение это пример анонимной фу-ии.
// Как джава определяет какой функциональный интерфейс мы используем?
// до стрелки это параметры метода, после стрелки - тело метода, иннер анинимный класс
    }

    private static class Player {
        private String name;
        private int score; //количество набранных очков

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public int getScore() {
            return score;
        }

        public void setScore(int score) {
            this.score = score;
        }

        public Player(String name, int score) {
            this.name = name;
            this.score = score;
        }
    }
}
