package school.mjc.stage0.loops.task3;

public class NinesSum {
    public void calculateSum(int lengthOfLastNumber) {

        int a = 9;
        int b = 11;
        for (int i = 0; i < lengthOfLastNumber; i++){
            a += 9 * b;
            b *= 10 + 1;


        }
        System.out.println(a);


    }
}
