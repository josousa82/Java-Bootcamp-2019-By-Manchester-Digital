package com.manchesterdigital.challenges.studentschallenges;

import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class Main {

    public static void main(String[] args) {

        Student st1 = new Student("Jose", "English", 45);
        Student st2 = new Student("Aaron", "French", 76);
        Student st3 = new Student("April", "German", 57);
        Student st4 = new Student("Assad", "English", 90);
        Student st5 = new Student("Tom", "French", 78);
        Student st6 = new Student("Andrew", "English", 34);
        Student st7 = new Student("Sponge Bob", "German", 67);

        List<Student> students = List.of(st1, st2, st3, st4, st5, st6, st7);

        List<Student> studentsResultGerman = students.stream()
                .filter(student -> student.getClassType().equalsIgnoreCase("German"))
                .filter(student -> student.getName().toUpperCase().startsWith("A"))
                .filter(student -> student.getScore() > 50)
                .collect(Collectors.toList());

        List<Student> studentsResultEnglish = students.stream()
                .filter(student -> student.getClassType().equalsIgnoreCase("English"))
                .filter(student -> student.getName().toUpperCase().startsWith("A"))
                .filter(student -> student.getScore() > 50)
                .collect(Collectors.toList());

        List<Student> studentsResultFrench = students.stream()
                .filter(student -> student.getClassType().equalsIgnoreCase("French"))
                .filter(student -> student.getName().toUpperCase().startsWith("A"))
                .filter(student -> student.getScore() > 50)
                .collect(Collectors.toList());

        studentsResultGerman.stream()
                .map(Student::toString)
                .forEach(System.out::println);

        studentsResultEnglish.stream()
                .map(Student::toString)
                .forEach(System.out::println);

        studentsResultFrench.stream()
                .map(Student::toString)
                .forEach(System.out::println);

        System.out.println(extractStudentsUsingPredicate(students, "German", 40));


    }

    // Refactor

  /*  private static List<Student> extractStudents(List<Student> students, String subject, Integer minScore) {
        return students.stream()
                .filter(student -> student.getClassType().equalsIgnoreCase(subject))
                .filter(student -> student.getScore() > minScore)
                .filter(student -> (student.getName().startsWith("A") || student.getName().startsWith("S")))
                .collect(Collectors.toList());
    }*/


    private static List<Student> extractStudentsUsingPredicate(List<Student> students, String subject, Integer minScore) {
        return students.stream()
                .filter(studentFilter(subject, minScore))
                .collect(Collectors.toList());
    }

        private static Predicate<Student> studentFilter (String subject, Integer minScore){
            return student -> student.getClassType().equalsIgnoreCase(subject) &&
                    student.getScore() > minScore &&
                    (student.getName().startsWith("A") || student.getName().startsWith("S"));
        }

}
