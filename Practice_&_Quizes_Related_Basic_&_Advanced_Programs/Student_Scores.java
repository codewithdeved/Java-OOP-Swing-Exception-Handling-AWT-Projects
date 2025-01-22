// Write a program that reads (fictitious) student test scores in the
// range 0 through 100 and print the following statistics to two decimal
// places:
// The average (mean) score.
// The student with the highest score.
// The student with the lowest score.
// The number of students whose score equal or exceed the average.
// For each student:
// The difference between the average score and the student’s score (this
// can be either positive or negative).
// The grade letter where
// A is a score of 90 or greater.
// B is a score of 80 through 89.99.
// C is a score of 70 through 79.99
// D is a score of 60 through 69.

public class Student_Scores {
    public static void main(String[] args) {

        System.out.println("Name: Tayyab Ali. RollNo: 2024S-BSET-003.");

        int totalTestScores = 100;

        int[] student1TestScores = { 15, 35, 22, 20, 10 },
                student2TestScores = { 10, 5, 35, 8, 20 },
                student3TestScores = { 20, 2, 15, 8, 10 };

        int student1AverageScore = 0,
                student2AverageScore = 0,
                student3AverageScore = 0;

        for (int i = 0; i < student1TestScores.length; i++) {
            student1AverageScore += student1TestScores[i];
        }

        for (int i = 0; i < student2TestScores.length; i++) {
            student2AverageScore += student2TestScores[i];
        }

        for (int i = 0; i < student3TestScores.length; i++) {
            student3AverageScore += student3TestScores[i];
        }

        double student1Percentage = (student1AverageScore / (double) totalTestScores) * 100;

        double student2Percentage = (student2AverageScore / (double) totalTestScores) * 100;

        double student3Percentage = (student3AverageScore / (double) totalTestScores) * 100;

        if (student1AverageScore >= student2AverageScore && student1AverageScore >= student3AverageScore) {

            System.out.println("Student 1 has the highest score (" + student1AverageScore + ").");

        } else if (student2AverageScore >= student1AverageScore && student2AverageScore >= student3AverageScore) {

            System.out.println("Student 2 has the highest score (" + student2AverageScore + ").");

        } else {

            System.out.println("Student 3 has the highest score (" + student3AverageScore + ").");

        }

        if (student1AverageScore <= student2AverageScore && student1AverageScore <= student3AverageScore) {

            System.out.println("Student 1 has the lowest score (" + student1AverageScore + ").");

        } else if (student2AverageScore <= student1AverageScore && student2AverageScore <= student3AverageScore) {

            System.out.println("Student 2 has the lowest score (" + student2AverageScore + ").");

        } else {

            System.out.println("Student 3 has the lowest score (" + student3AverageScore + ").");

        }

        if (student1AverageScore >= totalTestScores) {

            System.out.println("Student 1 has exceeded the total average score (" + student1AverageScore + ").");

        } else if (student2AverageScore >= totalTestScores) {

            System.out.println("Student 2 has exceeded the total average score (" + student2AverageScore + ").");

        } else {

            System.out.println("Student 3 has exceeded the total average score (" + student3AverageScore + ").");

        }

        printGrade("Student 1", student1Percentage);
        printGrade("Student 2", student2Percentage);
        printGrade("Student 3", student3Percentage);

    }

    public static void printGrade(String studentName, double percentage) {

        if (percentage >= 90) {

            System.out.println(studentName + " has got A Grade.");
            System.out.printf("Percentage: %.2f", percentage);
            System.out.println();

        } else if (percentage >= 80) {

            System.out.println(studentName + " has got B Grade.");
            System.out.printf("Percentage: %.2f", percentage);
            System.out.println();

        } else if (percentage >= 70) {

            System.out.println(studentName + " has got C Grade.");
            System.out.printf("Percentage: %.2f", percentage);
            System.out.println();

        } else if (percentage >= 60) {

            System.out.println(studentName + " has got D Grade.");
            System.out.printf("Percentage: %.2f", percentage);
            System.out.println();

        } else {

            System.out.println(studentName + " has got E Grade.");
            System.out.printf("Percentage: %.2f", percentage);

        }

    }

}

// Version 1 by Myself

// public class LabTaskNine {

// public static void main(String[] args) {

// System.out.println("Name: Tayyab Ali. RollNo: 2024S-BSET-003.");

// int totalTestScores = 100;

// int[] student1TestScores = { 15, 35, 18, 40, 25 },
// student2TestScores = { 10, 5, 35, 8, 20 },
// student3TestScores = { 20, 2, 15, 8, 10 };

// int student1AverageScore = 0,
// student2AverageScore = 0,
// student3AverageScore = 0;

// for (int i = 0; i < student1TestScores.length; i++) {
// student1AverageScore += student1TestScores[i];
// }

// for (int i = 0; i < student2TestScores.length; i++) {
// student2AverageScore += student2TestScores[i];
// }

// for (int i = 0; i < student3TestScores.length; i++) {
// student3AverageScore += student3TestScores[i];
// }

// double student1Percentage = (student1AverageScore / totalTestScores) * 100,
// student2Percentage = (student2AverageScore / totalTestScores) * 100,
// student3Percentage = (student3AverageScore / totalTestScores) * 100;

// if (student1AverageScore >= student2AverageScore && student1AverageScore >=
// student3AverageScore) {
// System.out.println("Student 1 has the highese score (" + student1AverageScore
// + ").");
// } else if (student2AverageScore >= student1AverageScore &&
// student2AverageScore >= student3AverageScore) {
// System.out.println("Student 2 has the highest score (" + student2AverageScore
// + ").");
// } else {
// System.out.println("Student 3 has the highest score (" + student3AverageScore
// + ").");
// }

// if (student1AverageScore <= student2AverageScore && student1AverageScore <=
// student3AverageScore) {
// System.out.println("Student 1 has the lowest score (" + student1AverageScore
// + ").");
// } else if (student2AverageScore <= student1AverageScore &&
// student2AverageScore <= student3AverageScore) {
// System.out.println("Student 2 has the lowest score (" + student2AverageScore
// + ").");
// } else {
// System.out.println("Student 3 has the lowest score (" + student3AverageScore
// + ").");
// }

// if (student1AverageScore >= totalTestScores) {
// System.out.println("Student 1 has exceed the total average score (" +
// student1AverageScore + ").");
// System.out.printf("Percentage: %.2f", student1Percentage);
// } else if (student2AverageScore >= totalTestScores) {
// System.out.println("Student 2 has exceed the total average score (" +
// student2AverageScore + ").");
// System.out.printf("Percentage: %.2f", student2Percentage);
// } else {
// System.out.println("Student 3 has exceed the total average score (" +
// student3AverageScore + ").");
// System.out.printf("Percentage: %.2f", student3Percentage);
// }

// if (student1Percentage >= 90) {
// System.out.println("Student 1 have got A Grade.");
// } else if (student1Percentage >= 80) {
// System.out.println("Student 1 have got B Grade.");
// } else if (student1Percentage >= 70) {
// System.out.println("Student 1 have got C Grade.");
// } else if (student1Percentage >= 60) {
// System.out.println("Student 1 have got D Grade.");
// } else {
// System.out.println("Student 1 have got E Grade.");
// }

// if (student2Percentage >= 90) {
// System.out.println("Student 2 have got A Grade.");
// } else if (student2Percentage >= 80) {
// System.out.println("Student 2 have got B Grade.");
// } else if (student2Percentage >= 70) {
// System.out.println("Student 2 have got C Grade.");
// } else if (student2Percentage >= 60) {
// System.out.println("Student 2 have got D Grade.");
// } else {
// System.out.println("Student 2 have got E Grade.");
// }

// if (student3Percentage >= 90) {
// System.out.println("Student 3 have got A Grade.");
// } else if (student3Percentage >= 80) {
// System.out.println("Student 3 have got B Grade.");
// } else if (student3Percentage >= 70) {
// System.out.println("Student 3 have got C Grade.");
// } else if (student3Percentage >= 60) {
// System.out.println("Student 3 have got D Grade.");
// } else {
// System.out.println("Student 3 have got E Grade.");
// }

// }

// }