public class TestParcoursLigne {

    
    public static void main(String[] args) {
        // creation et remplissage de tab 
        int h = 3 ;
        int w = 3 ; 
        TableauEntier t = new TableauEntier(w,h) ;
        for(int i = 0 ; i< 3; i++ )
        {
             for(int j = 0 ; j< 3; j++ )
            {
                //System.out.println("t["+i+"]["+j+"] = ");
                t.setvalueAt(i, j, (int)(Math.random() * 100));
            }
        
        }
        Parcours p = new Parcours(t) ;

        System.out.println("le table : ");
        for(int i=0 ;i<9;i++)
        {
          System.out.println("value "+i+" : "+p.next()); 
        }

        if(p.hasNext()==false)
        {
            System.out.println("pas de valeur suivant");
        }
        System.out.println("the height is " + t.getHeight());
        
        
        
    }
}