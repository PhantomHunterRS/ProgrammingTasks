package Chapter1;

/**
 * PHANTOMHUNTER
 **/
public class Task4 {
    public void realnumb (double a, double b){
        double avr = (a + b)/2;
        System.out.println("Среднее арифметическое число равно " + avr);
        double geom = Math.pow((a*b),1.0/2);
        double geom1 = Math.sqrt((a*b));
        System.out.println("Среднее геометрическое число равно " + geom );
        System.out.println("Среднее геометрическое число равно " + geom1);
    }
}
