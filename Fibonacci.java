public class Fibonacci {
    static int of(int i) { //int装不下返回值，但是按题目要求要返回int
        int a = 1;
        int b = 1;
        int temp;
        if(i == 1 || i == 2)
            return 1;
        for(int j = 3; j <= i; j++){
            temp = a + b;
            a = b;
            b = temp;
        }
        return b;

    }

    public static void main(String[] args) {
        for (int i = 1; i < 201; i++) {
            System.out.println("Fibonacci.of(" + i + ") == "+Fibonacci.of(i));
        }
    }

}
