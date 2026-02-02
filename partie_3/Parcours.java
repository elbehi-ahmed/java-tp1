package partie_3 ;
public abstract class Parcours implements Iterateur
{

    protected  int icour ;
    protected  int jcour ;
    protected  int count ;
    protected TableauEntier t ;

    public Parcours(TableauEntier T) {
        t = T;
    }

    public boolean hasNext()
    {
        return !(icour == t.getHeight() - 1 && jcour == t.getWidth() - 1) ;
    }

    public abstract void suivant() ;
   
    

    public int next() {
        int valeur;
        
        if (count == 0) {

            valeur = t.valueAt(icour, jcour);
        } else {
            suivant();
            valeur = t.valueAt(icour, jcour);
        }

        count++;
        return valeur;
    }
}
