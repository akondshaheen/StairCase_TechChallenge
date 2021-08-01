public class Main {

    public static void main(String[] args) {
        int [] ways = {1, 2, 3};
        StepsCount stepsCount = new StepsCount();
        int results = stepsCount.StaircaseBottomUp(5,ways);

        System.out.println(results);
    }
}
