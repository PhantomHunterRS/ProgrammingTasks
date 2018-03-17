package Chapter1;

/**
 * PHANTOMHUNTER
 **/
public class Task7 {
    public void Mixing(double v1,double v2, double t1, double t2){
        double vOverall = v1+v2;
        double taverage = (v1*t1+v2*t2)/(v1+v2);
        System.out.printf("Объем воды равен %g, Температура воды получилась %g",vOverall,taverage);
    }
}
