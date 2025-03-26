public class Main {
    public static void main(String[] args) {
        //case 1
        int[] points = {200, 100, 500};
        boolean[] goals = {true, true, true};
        Game case1 = new Game(points, goals, true);
        System.out.println(case1.getScore());

        //case2
        points = new int[] {200, 100, 500};
        goals = new boolean[] {true, true, false};
        case1 = new Game(points, goals, false);
        System.out.println(case1.getScore());

        //case3
        points = new int[] {200, 100, 500};
        goals = new boolean[] {true, false, true};
        case1 = new Game(points, goals, true);
        System.out.println(case1.getScore());

        //case4
        points = new int[] {200, 100, 500};
        goals = new boolean[] {false, true, true};
        case1 = new Game(points, goals, false);
        System.out.println(case1.getScore());
    }
}
