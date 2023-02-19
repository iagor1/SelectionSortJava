import java.util.Scanner;
public class App {
    public static void main(String[] args) throws Exception {
        int[] v = FazLista();
        MenorDeTodos(v);
        SelectionSort(v);
    }


    public static int[] FazLista(){
        int size;
        System.out.print("Enter Array Size : ");
        Scanner scan = new Scanner(System.in);  
        size = scan.nextInt();  
        scan.close();
        int[] vetor = new int[size];

       for (int i = 0; i < vetor.length; i++) {
          vetor[i] = (int) (Math.random()*vetor.length);
       }

       System.out.println("lista desordenada");
       for(int i = 0; i < vetor.length; i++){
        System.out.println(vetor[i]);
       }

       return vetor;

    }
    
    public static int[] SelectionSort(int[] vetor){
        //selection sort
       int posicao_menor, aux;
       for(int i =0; i<vetor.length; i++){
            posicao_menor = i; 
            for(int j = i +1; j<vetor.length; j++){
                if(vetor[j]< vetor[posicao_menor]){
                    posicao_menor = j;
                } 
            }
            aux = vetor[posicao_menor]; // equivale ao menor de todos
            vetor[posicao_menor] = vetor[i]; //joga o menor pro começo
            vetor[i] = aux; //
        }
       
        System.out.println("lista ordenada");
       for(int i = 0; i < vetor.length; i++){
        System.out.println(vetor[i]);
       }
       return vetor;
    }

    public static int[] MenorDeTodos(int[] vetor){
        int maisBarato = 0;
        for(int atual =0; atual <= vetor.length -1; atual++){
            if(vetor[atual] < vetor[maisBarato]){
                maisBarato = atual;
            }
        }
        System.out.println("O mais barato é : " + vetor[maisBarato]);
        return vetor;
    }


    private static int buscaMenor(Produto[] produtos) {
        int maisBarato = 0;
        for(int atual =0; atual <= produtos.length -1; atual++){
            if(produtos[atual].getPreco() < produtos[maisBarato].getPreco()){
                maisBarato = atual;
            }
        }
        System.out.println("O mais barato é : " + produtos[maisBarato].getPreco());
        return maisBarato;
    }
}
