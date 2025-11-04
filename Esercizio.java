public class Esercizio {
    
    public static void esercizio1() {
        int [][] miaMatrice = new int[3][5];
        miaMatrice[1][0] = 7;
        miaMatrice[1][1] = 7;
        miaMatrice[1][2] = 7;
        miaMatrice[1][3] = 7;
        miaMatrice[1][4] = 7;
        UtilsMatrice.visualizza(miaMatrice);
    }
    
    public static void esercizio2() {
        int j;
        int [][] miaMatrice = new int [3][5];
        for (j=0; j<=4; ++j) {
            miaMatrice[1][j] = 7;
        }
        UtilsMatrice.visualizza(miaMatrice);
    }
    
    public static void esercizio3() {
        int i;
        int [][] miaMatrice = new int [3][5];
        for (i=0; i<=2; ++i) {
            miaMatrice[i][3] = 7;
        }
        UtilsMatrice.visualizza(miaMatrice);
    }
    
    public static void main(String[] args) {

        System.out.println();
        System.out.println("ESERCIZIO 1: ");
        System.out.println("----- ----- -----");
        esercizio1();
        
        System.out.println();
        System.out.println("ESERCIZIO 2: ");
        System.out.println("----- ----- -----");
        esercizio2();
        
        System.out.println();
        System.out.println("ESERCIZIO 3: ");
        System.out.println("----- ----- -----");
        esercizio3();
    }
}