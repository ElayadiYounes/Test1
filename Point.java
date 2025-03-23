public class Point {
     private float x=0;
     private float y=0;


     public Point(final float X , final float Y){
        this.x=X;
        this.y=Y;
    }
    public final float getElementX(){
        return this.x;
    }
    public final float getElementY(){
        return this.y;
    }
    public void translation(final float X , final float Y){
        this.x=X;
        this.y=Y;
        System.out.println("l'operation de transition est effectue !!!!");
    }
    public boolean asSame(Point p2){
        return (this.x==p2.x && this.y==p2.y);
    }
     public static void main(String[] args){
        Point p1= new Point(1, 2);
        Point p2 = new Point(3, 40);
        System.out.println("Les coordonnee de point 1 est : {"+p1.getElementX()+";"+p1.getElementY()+"}");
        System.out.println("Les coordonnee de point 2 est : {"+p2.getElementX()+";"+p2.getElementY()+"}");
        if (p1.asSame(p2)) {
            System.out.println("les deux points sont identique !!!");
        }
        else{
            System.out.println("les deux points ne sont pas identique !!!");
        }


     }
}