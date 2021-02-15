public class Main {

    public static void meterDatos (int [][] matriz ){
        int contador=0;
        for (int i=0;i<matriz.length;i++){
            for (int j=0;j<matriz[i].length;j++){
              contador += matriz[i][j];
            }
        }
        for(int i=0;i< matriz.length;i++){
            for (int j=0;j<matriz[i].length;j++){
                System.out.print(matriz[i][j]+" ");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        int [][] matriz = {{2,3,4}, {3,4,2}};

        meterDatos(matriz);

    }
}
