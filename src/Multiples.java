public class Multiples {
    static void multipleOf3And5(int i) {
        boolean divisibleBy3 = i % 3 == 0;
        boolean divisibleBy5 = i % 5 == 0;
        if(divisibleBy3 || divisibleBy5) {
            System.out.println(i);
        }
    }
    public static void main(String[] args) {
        for(int i = 1; i < 1000; i++) {
            multipleOf3And5(i);
        }
    }
}
