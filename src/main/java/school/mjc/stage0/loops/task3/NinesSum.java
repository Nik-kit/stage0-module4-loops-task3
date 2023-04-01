package school.mjc.stage0.loops.task3;

public class NinesSum {
    public void calculateSum(int lengthOfLastNumber) {
        int sum = 0;
        int t = 0;
        for(int i = 1; i <= lengthOfLastNumber; i++){
            t = t * 10 + 9;
            sum += t;
        }
        System.out.println(sum);
    }
}
