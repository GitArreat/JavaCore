package Lesson1.test;

public class Players {
    String nickname;
    int damage;

    public String getNickname() {
        return nickname;
    }

    public int getDamage() {
        return damage;
    }

    public Players(String nickname, int damage) {
        this.nickname = nickname;
        this.damage = damage;
    }
}
