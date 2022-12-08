package Lesson1.test;

public class Main {
    public static void main(String[] args) {
//    Players players1 = new Players("Malf",50);
//    Players players2 = new Players("Ili",100);
//    Players players3 = new Players("Cha",30);
//    Players players4 = new Players("Spin",30);

        Players[] players = {
                new Players("Malf", 30),
                new Players("Ili", 100),
                new Players("Cha", 30),
                new Players("Spin", 30)};
        Team team = new Team("Студенты", players);
        Boss boss = new Boss("Поддержка GeekBrains", 80);

        boss.doIt(team);
        String result = boss.doIt(team);
        System.out.println(result);
    }
}