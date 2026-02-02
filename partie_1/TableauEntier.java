package partie_1 ;
public class TableauEntier {

    private int [] [] t ;
    int width ;
    int height ;

    public TableauEntier(int w , int h )
    {
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
    public void setvalueAt(int c , int l ,int value)
    {
        t[c][l] =value ;

    }
    public int getHeight() {
        return height;
    }
    public int getWidth() {
        return width;
    }
}