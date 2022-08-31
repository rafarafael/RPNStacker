import java.io.IOException;
import java.util.Scanner;
import java.util.Stack;

public class RPNStacker {
    public static void main(String[] args) throws IOException{
        Stack<String> pilha = new Stack<String>();
        String x;
        try (Scanner entrada = new Scanner(System.in)) {
            while (entrada.hasNextLine()) {
                x = entrada.nextLine();
                if (isInteger(x)) {
                    pilha.push(x);
                } else if (x.equals("*")) {
                    int a = Integer.parseInt(pilha.pop());
                    int b = Integer.parseInt(pilha.pop());
                    x = String.valueOf(a * b);
                    pilha.push(x);
                } else if (x.equals("/")) {
                    int a = Integer.parseInt(pilha.pop());
                    int b = Integer.parseInt(pilha.pop());
                    x = String.valueOf(a / b);
                    pilha.push(x);
                } else if (x.equals("+")) {
                    int a = Integer.parseInt(pilha.pop());
                    int b = Integer.parseInt(pilha.pop());
                    x = String.valueOf(a + b);
                    pilha.push(x);
                } else if (x.equals("-")) {
                    int a = Integer.parseInt(pilha.pop());
                    int b = Integer.parseInt(pilha.pop());
                    x = String.valueOf(a - b);
                    pilha.push(x);
                }
        }
        } catch (NumberFormatException e) {
            e.printStackTrace();
        }
            System.out.println(pilha.pop());
    }

    public static boolean isInteger(String str) {
        return str.matches("-?\\d+");
    }
}



