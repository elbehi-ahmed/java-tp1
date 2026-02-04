package partie_3_4;

public class TableauEntier {

    private int [] [] t ;
    int width ;
    int height ;
    public static final int ITERATEUR_LIGNE = 0 ;
    public  static final int ITERATEUR_COLONNE = 1 ;
    public  static final int  ITERATEUR_INVERSE = 2 ;
    private int iteratorType = ITERATEUR_LIGNE;
    
    public TableauEntier(int w , int h ) throws TailleMaxError
    {
        if(w>20 || h>20)
            throw new TailleMaxError("la taille max de tab est depasse");
        
        height = h ;
        width = w ;
        t = new int[w][h] ;
    }

    public TableauEntier(int [][] T )
    {
        t = T ;
    }
     public int  valueAt(int c , int l)
    {
        return  t[c][l] ;

    }
    public void setvalueAt(int c , int l ,int value) throws IntValueError
    {
        if (value != (int)value)
        {
            throw new IntValueError("les valeur de tab doivent etre entier") ;
        }

        t[c][l] =value ;

    }
    public int getHeight() {
        return height;
    }
    public int getWidth() {
        return width;
    }

    public void configureIterator(int type)
    {
        iteratorType =type ;
    }
    Iterateur iterateur()
    {
        Iterateur p = null ;
        switch (iteratorType) {
            case 0:
                p= new ParcoursLigne(this) ;
                break ;
            case 1:
                p=new ParcoursColonne(this) ;
                break ;
            case 2:
                p=new ParcoursInverse(this) ;
                break ;
            default:
                break;
        }
        return p ;
    }
}