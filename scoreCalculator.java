import java.util.*;

public class scoreCalculator {

    public List<String> stringToList(String bList) {
        List<String> x = new ArrayList<>();

        for (int i = 0; i < bList.length(); i++) {
            //Convert X's and -'s to 10 and zero to make it easier to add them to the total in our calculate() function
            if (bList.charAt(i) == '-')
                x.add("0");
            else if (bList.charAt(i) == 'X')
                x.add("10");
            else
                x.add("" + bList.charAt(i));
        }
        return x;
    }

    public int calculate(String input) {

        List<String> scores = stringToList(input);
        int total = 0;

        for (int j = 0; j < scores.size(); j++) {

            if (j >= scores.size() - 3) {
                if (scores.get(j).equals("/")) {
                    total += 10 - Integer.parseInt(scores.get(j + 1));
                } else
                    total += Integer.parseInt(scores.get(j));

            } else if (scores.get(j).equals("10")) {
                total += 10 + Integer.parseInt(scores.get(j + 1));
                if (scores.get(j + 2).equals("/")) {
                    total += 10 - Integer.parseInt(scores.get(j + 1));
                } else {
                    total += Integer.parseInt(scores.get(j + 2));
                }
            } else if (scores.get(j).equals("/")) {
                total += 10 - Integer.parseInt(scores.get(j - 1)) + Integer.parseInt(scores.get(j + 1));
            } else
                total += Integer.parseInt(scores.get(j));
        }

        return total;
    }
}
