package school.mjc.stage0.loops.task3;

public class RangeSum {
    public void printSumInclusive(int firstBoarder, int secondBoarder) {
        int a = firstBoarder;
        int b = secondBoarder;
        int sum = 0;
        for(int i = a; i <= b; i++){
            sum += i;
        }
        System.out.println(sum);
    }
}
