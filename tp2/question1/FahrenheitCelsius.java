package question1;


public class FahrenheitCelsius {

    /**
     * le point d'entr�e de cette application, dont le commentaire est �
     * compl�ter
     * 
     * @param args
     *            ...
     */
    public static void main(String[] args) {
        // pour tous les param�tres de la ligne de commande
        int fahrenheit = 0;
        float celsius = 0;
         
       for(int i = 0; i<args.length; i++){
       fahrenheit = java.lang.Integer.parseInt(args[i]);
       celsius = fahrenheitEnCelsius(fahrenheit);
       //r = ((int)resultat*10)/10.0
       System.out.println(fahrenheit + "\u00B0F \t-> " + "\t" + ((int)(celsius*10)/10.0) + "\u00B0C");
        }     
      
       }                                                                      
    
        /**
        * la m�thode � compl�ter.
        * 
        * @param f
        *            la valeur en degr� Fahrenheit
        * @return la conversion en degr� Celsius
        */
    //La formule de conversion : �C = 5/9 * (�F -32)
     public static float fahrenheitEnCelsius(int f){
        float c = (float)5/9*(f-32);
        return c; 
     }
}
