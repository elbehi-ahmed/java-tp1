public class Parcours {

    public int icour ;
    public int jcour ;
    public int count ;
    public TableauEntier t ;

    public Parcours(TableauEntier T)
    {
        t = T ;
    }
    public boolean hasNext()
    {
        if((icour == t.getHeight() -1 ) && ((jcour + 1) == t.getWidth()))
        {
            return false ;
        }
        return true ;      
    }
    public void suivant()
    {
        if(hasNext())
        {
            icour++ ;
            jcour++ ;
        }
    }

    public int next()
    {
       
        suivant();
        return t.valueAt(icour,jcour) ;
    }

}