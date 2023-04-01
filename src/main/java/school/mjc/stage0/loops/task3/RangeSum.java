package school.mjc.stage0.loops.task3;

public class RangeSum {
    public void printSumInclusive(int firstBoarder, int secondBoarder) {
        for(int i = firstBoarder + 1; i <= secondBoarder; i++){
            firstBoarder = firstBoarder + i;
        }
        System.out.println(firstBoarder);
    }
}
