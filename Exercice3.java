import java.util.Arrays;

public class Exercice3 {
    public static void main(String[] args){
        if(args.length == 0){
        System.out.println("Le Tableau est Vide !!!!!");
          return;
        }
        else{
            int[] T = new int[args.length];
            for(int i=0;i<args.length;i++){
                T[i]=Integer.parseInt(args[i]);
            }
            Arrays.sort(T);
          for(int i=0;i<args.length;i++)
            System.out.println(T[i]);
        }
    }
}
    

