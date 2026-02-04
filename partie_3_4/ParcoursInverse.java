package partie_3_4;

public class ParcoursInverse extends Parcours 
{
    ParcoursInverse(TableauEntier T)
    {
        super(T) ;
        icour = t.height -1  ;
        jcour = t.width  -1 ;
    }
    @Override
    public boolean hasNext()
    {
        return !(icour == 0 && jcour == 0 ) ;
    }
    @Override
    public void suivant()
    {
        if (hasNext())
        {
           if( jcour == 0)
            {
                jcour = t.width -1  ;
                icour-- ;
            } 
            else
            {
                jcour-- ;
            }
        }
    }

}
