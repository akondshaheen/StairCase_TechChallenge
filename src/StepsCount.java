public class StepsCount {

    public int StaircaseBottomUp(int StepsNumber, int[] ways) {

        int[] stepsNumberContainer = new int[StepsNumber + 1];
        stepsNumberContainer[0] = 1;

        if (StepsNumber == 0)
            return 1;

        for (int i = 1; i <= StepsNumber; i++) {
            int total = 0;

            for (int way : ways) {
                if (i - way >= 0)
                    total += stepsNumberContainer[i - way];
            }
            stepsNumberContainer[i] = total;
        }
        return stepsNumberContainer[StepsNumber];
    }
}
