public class Main {
    public static void main(String[] args) {
        int deposit = 1500;
        int bonusLimit = 100;
        int startingScore = 500;
        int bonus = deposit / bonusLimit;
        if (deposit < 1000) {
            bonus = 0;
        }
        int currentAccount = deposit + bonus + startingScore;
        System.out.println("Вы внесли " + deposit + "р. Вам начислено " + bonus + " бонусных рублей. Ваш баланс: " + currentAccount + "р.");
    }
}
