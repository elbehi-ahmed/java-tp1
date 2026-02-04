package partie_3_4;

public class ParcoursColonne extends Parcours
{

    ParcoursColonne(TableauEntier T)
    {
        super(T) ;
    }
    @Override
    public void suivant() {
    if (hasNext()) 
    {

        if (icour < t.getHeight() - 1) {
            icour++;
        } else {

            jcour++ ;
            icour = 0 ;
        }
    }
    }



    

   

    

    
}