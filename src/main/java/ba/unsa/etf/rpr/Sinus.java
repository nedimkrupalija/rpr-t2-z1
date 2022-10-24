package ba.unsa.etf.rpr;

public class Sinus {
    private double sinus;
    public double getSinus(int n)
    {
        double s=0;
        int stepen=n;
        int faktorijel=1;
        for(int i=0;i<5;i++)
        {
            s = s + ((double) stepen)/faktorijel;
            stepen = stepen * (-1) * n *n;
            faktorijel = faktorijel * (2*(i+1))*(2*(i+1)+1);
        }
        return s;
    }
}
