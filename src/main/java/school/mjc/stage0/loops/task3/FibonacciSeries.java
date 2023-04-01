package school.mjc.stage0.loops.task3;

public class FibonacciSeries {
    public void printFibonacci(int lastFibonacci) {
        int lastInt = 0;
        int nowInt = 1;
        System.out.println(lastInt);
        System.out.println(nowInt);
        int result = 0;
        for(int i = 1; i < lastFibonacci - 1; i++){
            System.out.println(lastInt + nowInt);
            result = lastInt + nowInt;
            lastInt = nowInt;
            nowInt = result;
        }
    }
}
