public class Main {
    public static void main(String[] args) {
        Game one = new Game();
        one.getLevel(1).goalReached();
        one.getLevel(1).setPoints(200);
        one.getLevel(2).goalReached();
        one.getLevel(2).setPoints(100);
        one.getLevel(3).goalReached();
        one.getLevel(3).setPoints(500);
        one.setBonus();
        System.out.println(one.getScore());


        Game two = new Game();
        two.getLevel(1).goalReached();
        two.getLevel(1).setPoints(200);
        two.getLevel(2).goalReached();
        two.getLevel(2).setPoints(100);
        two.getLevel(3).setPoints(500);
        System.out.println(two.getScore());


        Game three = new Game();
        three.getLevel(1).goalReached();
        three.getLevel(1).setPoints(200);
        three.getLevel(2).setPoints(100);
        three.getLevel(3).goalReached();
        three.getLevel(3).setPoints(500);
        three.setBonus();
        System.out.println(three.getScore());

        Game four = new Game();
        four.getLevel(1).setPoints(200);
        four.getLevel(2).goalReached();
        four.getLevel(2).setPoints(100);
        three.getLevel(3).goalReached();
        four.getLevel(3).setPoints(500);
        System.out.println(four.getScore());




        Game five = new Game();
        System.out.println(five.playManyTimes(4));
    }
}
