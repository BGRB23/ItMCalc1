import java.util.Scanner;

public class Main {

    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);
        String d = scanner.nextLine();

        System.out.println(calc(d));
    }

    public static String calc(String input) throws Exception {
        int znak = 0;
        int numbers = 0;
        String itog;
        String[] dr = input.split(" ");
        StringBuilder sb = new StringBuilder(input);

        for (String s : dr) {
            if (s.equals("+") || s.equals("-") || s.equals("/") || s.equals("*")) {
                znak++;
            } else {
                numbers++;
            }
        }
        if (znak != 1) {
            throw new Exception("throws Exception //т.к. формат математической операции не удовлетворяет заданию - два операнда и один оператор (+, -, /, *)");
        } else if (numbers != 2) {
            throw new Exception(" //т.к. строка не является математической операцией");
        } else if (Integer.parseInt(dr[0]) <= 1 || Integer.parseInt(dr[0]) > 10 || Integer.parseInt(dr[2]) <= 0 || Integer.parseInt(dr[2]) > 10) {
            throw new Exception();
        } else {
            itog = switch (dr[1]) {
                case "-" -> String.valueOf(Integer.parseInt(dr[0]) - Integer.parseInt(dr[2]));
                case "+" -> String.valueOf(Integer.parseInt(dr[0]) + Integer.parseInt(dr[2]));
                case "*" -> String.valueOf(Integer.parseInt(dr[0]) * Integer.parseInt(dr[2]));
                case "/" -> String.valueOf(Integer.parseInt(dr[0]) / Integer.parseInt(dr[2]));
                default -> throw new Exception("throws Exception //т.к. строка не является математической операцией");
            };
        }
        return itog;
    }
}