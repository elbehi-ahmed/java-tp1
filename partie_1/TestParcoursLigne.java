package partie_1 ;
public class TestParcoursLigne {

    public static void main(String[] args) {
        // creation et remplissage de tab 
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
        Parcours p = new Parcours(t) ;

        System.out.println("le table : ");
        for(int i=0 ;i<h*w;i++)
        {
          System.out.println("value "+i+" : "+p.next()); 
        }

        if(p.hasNext()==false)
        {
            System.out.println("pas de valeur suivant");
        }
        System.out.println("the height is " + t.getHeight());
        System.out.println("t[2][2] = "+t.valueAt(2,2));
         
    }
}