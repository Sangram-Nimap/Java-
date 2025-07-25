class Calculator {

    int add(int a, int b) {
        return a + b;
    }

    double add(double a, double b) {
        return a + b;
    }

    String add(String a, String b) {
        return a + b;
    }
}

public class Task6 {
    public static void main(String[] args) {
        Calculator calc = new Calculator();

        System.out.println("Integer Addition: " + calc.add(4, 34));
        System.out.println("Double Addition: " + calc.add(24.5, 32.5));
        System.out.println("String Concatenation: " + calc.add("Hello", " Ajay"));
    }
}
