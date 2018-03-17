package Chapter1;

/**
 * PHANTOMHUNTER
 **/
public class Task5 {
    public void RealNumb2(double a,double b){
        double avr = (Math.abs(a) + Math.abs(b))/2;
        System.out.println("Среднее арифметическое число равно " + avr);
        double geom = Math.pow((Math.abs(a*b)),1.0/2.0);
        System.out.println("Среднее геометрическое число равно " + geom );
    }
}
