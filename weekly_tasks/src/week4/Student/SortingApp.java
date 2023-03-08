package week4.Student;

import java.util.*;
import java.util.stream.Collectors;

public class SortingApp {

    /*   1- Arrays.sort() || Collections.sort()
         2- Stream sorted() method
         3- List interface .sort() method
   */
    public static void main(String[] args) {

        Integer[] numsAsArr = {10, 46, 24, 20, 2, 56};
        System.out.println("numsAsArr = " + numsAsArr);


        List<Integer> numsAsList = new ArrayList<>(Arrays.asList(10, 46, 24, 20, 2, 56));
        System.out.println("numsAsList = " + numsAsList);
        Collections.sort(numsAsList);
        System.out.println("numsAsList = " + numsAsList);

        List<Student> studentList = studentGenerator();
        Collections.sort((studentList));
        System.out.println(studentList);
        List<Student> studentList2=studentList.stream().sorted().collect(Collectors.toList());

        studentList.sort(((o1,o2)->o1.id>o2.id ? 1:(o1.id<o2.id ? -1:0)));// you can use firstName ,lastName

        studentList.sort(Comparator.comparing(Student::getFirstName).thenComparing(Student::getId).reversed());
        System.out.println(studentList);


    }

    public static List<Student> studentGenerator() {

        ArrayList<Student> studentList = new ArrayList<>();
        studentList.add(new Student(5, "Joe", "Doe"));
        studentList.add(new Student(3, "Kevin", "Watts"));
        studentList.add(new Student(4, "Micheal", "Gibson"));
        studentList.add(new Student(2, "Alan", "Morris"));
        studentList.add(new Student(10, "Alan", "Wars"));
        return studentList;
    }
}
