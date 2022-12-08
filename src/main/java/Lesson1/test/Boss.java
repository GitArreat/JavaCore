package Lesson1.test;

public class Boss {
    String nameBoss;
    String result;
    int hpBoss;

    public String getNameBoss() {
        return nameBoss;
    }

    public int getHpBoss() {
        return hpBoss;
    }

    public Boss(String nameBoss, int hpBoss) {
        this.nameBoss = nameBoss;
        this.hpBoss = hpBoss;
    }
    public String doIt(Team team){
        System.out.println("БОЙ НАЧИНАЕТСЯ");
        result = "Команда " + team.getTeamName() + " атакует\n " ;
        for ( Players players:team.getPlayers()) {
        result += "Игрок " + players.getNickname() + " бьёт босса " + getNameBoss() + " \n";
        int value = players.getDamage();
        action(value);
        }

    return result;
    }


    public void action(int value){
        if (value > hpBoss){
            result += result +  "Босс " + getNameBoss() + " повержен!!!\n";
        }
        else result = result + "Босс " + getNameBoss() + " победил!!\n";
    }
}
