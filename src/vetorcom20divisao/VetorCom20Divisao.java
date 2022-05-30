
package vetorcom20divisao;

/**
 *
 * @author Fabinhu
 */
public class VetorCom20Divisao {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        
        int vetorCom20[]={2,67,5,15,7,3,45}; //possui 6 elementos atualmente
        int maiorValor=0;
        
        for(int contador=0;contador < vetorCom20.length;contador++){
            if(vetorCom20[contador] > maiorValor)
                maiorValor = vetorCom20[contador];
          }
        System.out.println(maiorValor);
    }
    
}
