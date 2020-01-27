public class Spiral {

   public static void main(String[] args) {
        int n = 7;
        int[][] spiral = new int[n][n];
        int x = 1;
        int count = 0;
        // у массивов с нечетной размерностью при таком обходе остается пустым самый средний элемент, следовательно заполняем его отдельно
        if(n % 2 != 0){
            spiral[Math.round(n/2)][Math.round(n/2)] = n * n;
        }
        while(count < Math.round(n/2)){
            for(int i = count; i < (n - count) - 1; ++i) spiral[count][i] = x++; // проход слева направо
            for(int i = count; i < (n - count) - 1 ; ++i) spiral[i][(n - count) - 1] = x++; // проход сверху вниз
            for(int i = (n - count) - 1; i > count; --i) spiral[(n - count) - 1][i] = x++; // проход справа налево
            for(int i = (n - count) - 1; i > count; --i) spiral[i][count] = x++; // проход снизу вверх
            count++;
        }
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print(spiral[i][j] + "\t");
            }
            System.out.println();
        }
    }
}

