package Lesson6_Test;

public class ClassArrays {

    public int[] getDigitAfterLast4(int[] array) throws RuntimeException {
        int x = 0;
        int y = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i] == 4) {
                x = i;
                y++;
            }
        }
        int[] newArray = new int[array.length - x - 1];
        if (y == 0) {
            throw new RuntimeException("В массиве не содержится ни одной цифры 4");
        } else {
            for (int i = 0; i < array.length - x - 1; i++) {
                newArray[i] = array[x + 1 + i];
                System.out.println(newArray[i]);
            }
        }
        return newArray;
    }

    public boolean isOneAndFourInArray(int[] array){
        boolean isOne = false;
        boolean isFor = false;
        for(int i : array){
            if(i == 1 ){
                isOne = true;
            } else if(i == 4){
                isFor = true;
            } else
                return false;
            }
        boolean result = isOne & isFor;
        System.out.println(result);
        return result;
    }
}