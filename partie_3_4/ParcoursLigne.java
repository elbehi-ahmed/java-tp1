package partie_3_4;

public class ParcoursLigne extends Parcours
{
    ParcoursLigne(TableauEntier T)
    {
        super(T) ;
    }
       
    public void suivant() {
    if (hasNext()) {

        if (jcour < t.getWidth() - 1) 
        {
            jcour++;
        }   
        else {
            icour++ ;
            jcour = 0 ;
            }
        }
    }

    

}
