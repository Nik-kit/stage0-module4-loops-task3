package school.mjc.stage0.loops.task3;

public class DigitsSum {
    public void printDigitsSum(int t){
        int r = 0;
        for(int i = Math.abs(t); i != 0; i /= 10){
            r += (i % 10);
        }
        System.out.println(r);
    }
}
