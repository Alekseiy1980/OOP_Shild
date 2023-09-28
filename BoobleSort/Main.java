import java.util.Random;

public class Main {
    public static void main(String[] args) {
        int array[] = new int[10];
        Random rand = new Random();
        for (int i = 0; i <array.length; i++) {
            array[i] = rand.nextInt(1,100);
        }
        System.out.println("Созданный массив ");
        for (int i = 0; i < array.length;i++) {
            System.out.print(array[i] + " ");
        }

        int tmp ;
        for(int i = 0; i < array.length; i++) {

            for(int j = 0; j < array.length-1; j++) {

                if(array[j]>array[j+1]) {
                    tmp = array[j];
                    array[j] = array[j+1];
                    array[j+1] = tmp;

                }
            }
        }
        System.out.println("\nОтсартированный массив");

        for(int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }

        System.out.println("Создаем двумерный массив \n\n");
        int table [][] = new int[10][20];
        for(int i = 0; i < 10; i ++){
            for(int j = 0; j < 20; j++){
                table[i][j] = rand.nextInt(100);
            }
        }
        for(int i = 0; i < 10; i ++){
            for(int j = 0; j < 20; j++){
                System.out.print(table[i][j] + " ");
            }
            System.out.println();
        }

        System.out.println("Сортируем двумерный массив");

        for(int i = 0 ; i < 10; i++){
            for(int j = 0; j < 20 ; j ++ )
            {
                for(int y = 0; y < 10; y++){
                    for (int z = 0; z<20;z++){
                        if(table[i][j] > table[y][z]){
                            tmp = table[i][j];
                            table[i][j] = table[y][z];
                            table[y][z] = tmp;
                        }
                    }
                }
            }
        }


        for(int i = 0; i < 10; i ++){
            for(int j = 0; j < 20; j++){
                System.out.print(table[i][j] + " ");
            }
            System.out.println();
        }
    }
}
