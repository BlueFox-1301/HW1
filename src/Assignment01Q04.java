import java.util.Arrays;

public class Assignment01Q04 {

    //method that swaps directions
    public static char switchDirection(char letter) {

        if (letter == 'L') {return 'R';}
        return 'L';

    }

    public static int[] switchPlaces(int[] array, int switchPoint) {

        int[] array2 = array.clone();
        int i = 0;
        while (switchPoint < array2.length) {
            array[i] = array2[switchPoint];
            i++;
            switchPoint++;
        }

        switchPoint = i;
        i = 0;

        while (i < array2.length - switchPoint) {
            array[switchPoint + i] = array2[i];
            i++;
        }

        return (array);
    }


    public static int[] shiftArrayCyclic(int[] array, int move, char direction) {
        
        //checking if letters are right
        if (direction != 'R' && direction != 'L') {return array;} 

        //checking if array isn't empty
        if (array.length == 0) {return array;}

        //looking for "real" step
        move %= array.length;

        //checking the state of move (and changing it if needed)
        if (move == 0) {return array;}
        else if (move < 0) {
            direction = switchDirection(direction);
            move *= -1;
        }

        int switchPoint = move;
        if (direction == 'R') {switchPoint = array.length - move;}

        return switchPlaces(array, switchPoint);

    }


    public static void main(String[] args) {
        System.out.println(Arrays.toString(
            shiftArrayCyclic(new int[]{1, 2, 3, 4, 5}, -1, 'R'))); // [2, 3, 4, 5, 1]
        System.out.println(Arrays.toString(
            shiftArrayCyclic(new int[]{1, 2, 3, 4, 5}, 1, 'R'))); // [5, 1, 2, 3, 4]
        System.out.println(Arrays.toString(
            shiftArrayCyclic(new int[]{1, 2, 3, 4, 5}, 1, 'r'))); // [1, 2, 3, 4, 5]
        System.out.println(Arrays.toString(
            shiftArrayCyclic(new int[]{1, 2, 3, 4, 5}, -2, 'g'))); // [1, 2, 3, 4, 5]
        System.out.println(Arrays.toString(
            shiftArrayCyclic(new int[]{1, 2, 3, 4, 5}, 3, 'L'))); // [4, 5, 1, 2, 3]
        System.out.println(Arrays.toString(
            shiftArrayCyclic(new int[]{1, 2, 3, 4, 5}, -3, 'L'))); // [3, 4, 5, 1, 2]
        System.out.println(Arrays.toString(
            shiftArrayCyclic(new int[]{0, 8, 9, 5, 6}, 6, 'L'))); // [8, 9, 5, 6, 0]
        System.out.println(Arrays.toString(
            shiftArrayCyclic(new int[]{}, 3, 'R'))); // []
    }
}