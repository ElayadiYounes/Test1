import java.util.Arrays;

public class Notes {
     public static void main(String[] args) {
        float []notes={15,9,18,12,7};
        float []copieNotes;
        copieNotes= new float[notes.length];
        //solution num 1
        /*for(int i=0;i<notes.length;i++){
            copieNotes[i]=notes[i];
        }*/
        //solution num 2
        /*int i=0;
        for (float note : notes) {
            copieNotes[i++]=note;
        }*/
        System.arraycopy(notes, 0, copieNotes, 0, notes.length);
        for(float note : copieNotes){
            System.out.println(note);
        }
        //solution 1 par le boucle mais est un solution classique comapre x[i]avec y[i]
        
        //solution 2 : on utilise soit 
        if(Arrays.equals(notes, copieNotes))
        System.out.println(("les deux tableau sont identique !!!!"));
        else
        System.out.println("Les deux tableau ne sont pas identique !!!");
        //on peut pas utiliser operateur T1==T2 directement cas on compare dans ce cas les adresse memoire 
        

       
       

     }    
}