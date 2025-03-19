public class Exercice2 {

    public static void main(String[] args) {
        //creation les deux tableau 
        double[] noteMath;
        double[] notePhysique;
        //l'allocation dynamique 
        noteMath = new double[5];
        notePhysique = new double[5];
        //initialisation note maths
        noteMath[0]=18.5;
        noteMath[1]=9;
        noteMath[2]=12;
        noteMath[3]=16.5;
        noteMath[4]=10;
        //initialisation note physique
        notePhysique[0]=16.5;
        notePhysique[1]=15;
        notePhysique[2]=11.5;
        notePhysique[3]=13;
        notePhysique[4]=17.5;
        //declaration et initialisation 
        double[] coeff={3,2};
        //Test programme 

       int indexOfGreat = Exercice2.GreatEtud(noteMath , notePhysique, coeff[0], coeff[1]);
       if(indexOfGreat<0)
       System.out.println("le tableau est Vide !!!!");
       else{
       System.out.println("La meilleur note dans la possition numero : "+(indexOfGreat+1));
       System.out.println("note physique : "+notePhysique[indexOfGreat]);
       System.out.println("note Math : "+noteMath[indexOfGreat]);
       System.out.println("moyenne : "+Exercice2.moyenne(noteMath[indexOfGreat], notePhysique[indexOfGreat], coeff[1], coeff[0]));
       }
    }
    public static double moyenne(double noteMath, double notePhysique, double coeffMath, double coeffPhysique){
        double result = 0;
        result= noteMath*coeffMath + notePhysique *coeffPhysique;
        result/=(coeffMath+coeffPhysique);

     return result;
    }
    public static int GreatEtud(double[] noteMath , double[] notePhysique, double coeffMath ,double coeffPhysique){
        int index=-1;
        double maxMoyenne=-1;
        for(int i=0;i<5;i++){
            double result = Exercice2.moyenne(noteMath[i], notePhysique[i], coeffMath, coeffPhysique);
            if(result>=maxMoyenne){
                maxMoyenne=result;
                index=i;
            }
            
        }
        
        return index;
    }
}