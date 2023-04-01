package school.mjc.stage0.loops.task3;

public class GreatestCommonDivisor {
    public void printGCD(int first, int second) {
        if (first == 0 && second > 0) {
            System.out.println(second);
        } else if (second == 0 && first > 0) {
            System.out.println(first);
        } else if(first == second) {
            System.out.println(first);
        } else {
            int j = first > second ? second : first;
            int returnInt = 1;
            for(int i = 1; i < j; i++){
                if(j % i == 0) {
                    returnInt = i;
                }
            }
            System.out.println(returnInt);
        }
    }
}
