package school.mjc.stage0.loops.task3;

public class GreatestCommonDivisor {
    public void printGCD(int first, int second) {
        while (first != second){
            if (first > second){
                first -= second;
            }
            else {
                second -= first;
            }

        }
        System.out.println(first);
    }
}
