package Chapter1;

/**
 * PHANTOMHUNTER
 **/
public class Task8 {
    public void Perimetr(double r,int n){
        double perimetr = 2*n*r*Math.sin((Math.PI/n));
        System.out.printf("Перимент правильного %d - угольника равна %g,\nсторона этого многоугольника равна %g\n",n,perimetr,perimetr/n);
    }
}
