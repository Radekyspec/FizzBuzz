public class Reduce {
    static boolean isEven(int i) {
        return i % 2 == 0;
    }

    static void stepsToZero(int num) {
        int steps = 0;
        while(num != 0) {
            if(isEven(num)) {
                num = num / 2;
            } else {
                num--;
            }
            steps++;
        }
        System.out.println(steps);
    }
    public static void main(String[] args) {
        stepsToZero(3);
    }
}
