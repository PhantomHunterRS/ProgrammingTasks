package Chapter1;

/**
 * PHANTOMHUNTER
 **/
public class Task2 {
    public void RealNumbers(double a, double b){
        double realNumb = (Math.abs(a) - Math.abs(b))/(1 + Math.abs(a*b));
        System.out.println("Числовое значение выражения (|x| - |y|)/(1+|x*y|) равно " +realNumb);
    }
}
