package Lambdas;

public class Main {
    public static void main(String[] args) {
        NumFact numFact = n -> {
            int result = 1;
            for (int i = 1; i <= n; i++) {
                result = result*i;
            }
            return result;
        };
        System.out.println(numFact.func(5));
    }
}

interface NumFact{
    int func(int n);
}
