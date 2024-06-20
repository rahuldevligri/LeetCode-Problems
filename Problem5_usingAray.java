import java.util.Arrays;

public class Problem5_usingAray {
    public static void main(String[] args) {
        int[] seats = { 1, 4, 5, 9 };
        int[] students = { 2, 1, 3, 6 };
        Arrays.sort(seats);
        Arrays.sort(students);
        int moves = 0;
        for (int i = 0; i < seats.length; i++) {
            moves += seats[i] - students[i];
            System.out.println(moves);
        }
        System.out.println(moves);
    }
}
