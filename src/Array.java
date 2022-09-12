import java.util.Arrays;
public class Array {
    public static void main(String[] args) {
        //Arrays
        int age = 30;
        int physics = 97;
        int chem = 93;
        int math = 53;


        int[] marks = new int[3];
        marks[0] = 97;
        marks[1] = 93;
        marks[2] = 53;
//        System.out.println(marks[2]);
        //length
//        System.out.println(marks.length);

        //sort
        System.out.println(marks[0]);
        Arrays.sort(marks);
        System.out.println(marks[0]);
    }
}
