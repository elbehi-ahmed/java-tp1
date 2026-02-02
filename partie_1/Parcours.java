package partie_1 ;
public class Parcours 
{
    public int icour ;
    public int jcour ;
    public int count ;
    public TableauEntier t ;

    public Parcours(TableauEntier T) {
        t = T;
    }

    public boolean hasNext()
    {
        return !(icour == t.getHeight() - 1 && jcour == t.getWidth() - 1) ;
    }

    public void suivant() {
        if (hasNext()) {

            if (jcour < t.getWidth() - 1) {
                jcour++;
            } else {

                icour++ ;
                jcour = 0 ;
            }
        }
    }

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