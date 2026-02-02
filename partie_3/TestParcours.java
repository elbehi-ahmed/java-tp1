package partie_3;

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

        Iterateur pl , pc , pi ;
        pl = t.iterateur()  ;
        t.configureIterator(1);
        pc = t.iterateur()  ;
        t.configureIterator(2);
        pi = t.iterateur()  ;


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
        System.out.println(pl.getClass());
    
    }
    
}

    
