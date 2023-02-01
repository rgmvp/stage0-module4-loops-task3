package school.mjc.stage0.loops.task3;

public class NinesSum {
    public void calculateSum(int lengthOfLastNumber) {

        int c = lengthOfLastNumber;
        int a = 0;
        int b = 9;
        int d = 9;
        for (int i = 0; i < c ; i++){
            if (lengthOfLastNumber == 1){
                a = 9;
                break;
            }
            a += d;
            d = d * 10 + 9;



        }
        System.out.println(a);


    }
}
