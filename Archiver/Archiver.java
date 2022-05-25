public class Archiver {
    public static void main(String[] args) {
        if (args.length == 0) {
            System.out.println("Пустая строка, введите строку.");
            System.exit(1);
        }
        String str = args[0];
        char[] chars = str.toCharArray();

        int count = 0;
        char prev = ' ';
        String result = "";

        for (int i = 0; i < chars.length; ++i) {
            char current = chars[i];
            if (i == 0) {
                count++;
                prev = current;
            } else {
                if (compare(current, prev)) {
                    count++;
                } else {
                    result = result + "" + formatOutput(count, prev);
                    count = 1;
                }
            }
            prev = current;
            if (i + 1 == chars.length) {
                result = result + "" + formatOutput(count, prev);
            }
        }
        System.out.println(result);
    }

    static boolean compare(char current, char prev) {
        if (current == prev)
            return true;
        else {
            return false;
        }
    }

    static String formatOutput(int count, char prev) {
        String output = "";
        if (count == 1) {
            output = String.format("%s%s", output, prev);
        } else {
            output = String.format("%s%d%s", output, count, prev);
        }
        return output;
    }
}
