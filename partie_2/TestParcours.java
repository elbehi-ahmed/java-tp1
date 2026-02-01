package partie_2;

public class TestParcours 
{
    
    public static void main(String[] args) 
    {
        System.out.println("creation de tab  : ") ;
        int h = 3 ;
        int w = 3 ; 
        TableauEntier t = new TableauEntier(w,h) ;
        for(int i = 0 ; i< h; i++ )
        {
             for(int j = 0 ; j< w; j++ )
            {
                //System.out.println("t["+i+"]["+j+"] = ");
                t.setvalueAt(i, j, (int)(Math.random() * 100));
            }
        }
        ParcoursLigne pl = new ParcoursLigne(t) ;
        ParcoursColonne pc = new ParcoursColonne(t) ;
        ParcoursInverse pi = new ParcoursInverse(t) ;
        System.out.println("parcour ligne");
        for(int i = 0 ;i<w*h;i++)
        {
            System.out.println(pl.next()); 
        }
        System.out.println("parcour colonne");

        for(int i = 0 ;i<w*h;i++)
        {
            System.out.println(pc.next()); 
        }
        System.out.println("parcour inverse");

         for(int i = 0 ;i<w*h;i++)
        {
            System.out.println(pi.next()); 
        }
    
    }
}
