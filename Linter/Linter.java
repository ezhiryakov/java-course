public class Linter {
    public static void main(String[] args) {
        if (args.length == 0) {
            System.out.println("Пустая строка, введите строку");
            System.exit(1);
        }

        String str = args[0];

        for (int i = 0; i < str.length()/2; ++i) {
            str = formatOutput(str);
        }
        if (str.length() != 0) {
            System.out.println("False");
        }
        else {
            System.out.println("True");
        }
    }
    static String formatOutput(String str){
        str = str.replace("{}", "");
        str = str.replace("[]", "");
        str = str.replace("<>", "");
        str = str.replace("()", "");
        return str;
    }
}
