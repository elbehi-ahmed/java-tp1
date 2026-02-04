package partie_3_4;

public class TestParcours {

    public static void main(String[] args) {
        System.out.println("creation de tab  : ");
        int h = 3;
        int w = 21;
        TableauEntier t = null;
        
        try
        {
            t = new TableauEntier(h, w);
        } 

        catch (TailleMaxError e) 
        {
            System.err.println(e.getMessage());
        }

        try {
            for (int i = 0; i < h; i++) {
                for (int j = 0; j < w; j++) {
                    t.setvalueAt(i, j, (int) (Math.random() * 100));
                }
            }
        } catch (IntValueError e) {
            System.err.println("ERREUR" + e.getMessage());
        }
        catch(NullPointerException e1)
        {
            System.err.println("ERREUR"+e1.getMessage());
        }

        Iterateur pl, pc, pi;
        pl = t.iterateur();
        t.configureIterator(1);
        pc = t.iterateur();
        t.configureIterator(2);
        pi = t.iterateur();
        try
        {
        System.out.println("parcour ligne");
        while(pl.hasNext()) 
         {
            
            System.out.println(pl.next());
        }
        
        System.out.println("parcour colonne");
         while (pc.hasNext()) 
            {
      
            System.out.println(pc.next());
        }
        
        System.out.println("parcour inverse");
        while (pi.hasNext()) 
            {
                System.out.println(pi.next());
            }
        
        System.out.println(t.valueAt(10, 10)); 
        }
        catch(ArrayIndexOutOfBoundsException e)
        {
            System.err.println("ERREUR"+e.getMessage());
        }
        
    }
}