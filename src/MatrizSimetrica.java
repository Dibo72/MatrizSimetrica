public class MatrizSimetrica {
    public static void main(String[] args) {
        int[][] matriz = new int[3][3];
        boolean simetrico = true;

        for(int i = 0; i < matriz.length; i++){
            for(int j = 0; j < matriz[i].length; j++){
                matriz[i][j] = (int)(Math.random()*10);
            }
        }

        for(int i = 0; i < matriz.length; i++){
            for(int j = 0; j < matriz[i].length; j++){
                if (matriz[i][j] != matriz[j][i]){
                    simetrico = false;
                }
            }
        }
        System.out.println("Matriz:");
        System.out.println();
        for (int i = 0; i < matriz.length; i++){
            for (int j = 0; j < matriz[i].length; j++){
                System.out.print(matriz[i][j] + " ");
            }
            System.out.println();
        }
        System.out.println();

        if(simetrico){
            System.out.println("Matriz simetrica");
        }else {
            System.out.println("Matriz no simetrica");
        }
    }
}