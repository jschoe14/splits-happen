public class bowlingRunner {
    public static void main (String args[]){
        scoreCalculator calc = new scoreCalculator();

        System.out.println(calc.calculate("9-9-9-9-9-9-9-9-9-9-"));
        System.out.println(calc.calculate("XXXXXXXXXXXX"));
        System.out.println(calc.calculate("5/5/5/5/5/5/5/5/5/5/5"));
        System.out.println(calc.calculate("X7/9-X-88/-6XXX81"));
        System.out.println(calc.calculate("XX---XXXXXX-"));
        System.out.println(calc.calculate("--------------------"));


    }
}
