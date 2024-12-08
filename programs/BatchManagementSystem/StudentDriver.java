package programs.BatchManagementSystem;

import java.util.Scanner;

public class StudentDriver {
    static Scanner sc = new Scanner(System.in);
    static int n = 3; // Initial array size
    static Student[] batch = new Student[n];
    static byte pointer = 0;
    static int capacity = batch.length;

    public static void main(String[] args) {
        System.out.println("--- WELCOME TO BATCH MANAGEMENT SYSTEM ---\n");

        do {
            if (capacity == 0) {
                System.out.println("BATCH FULL!");
                System.out.print("Do you want to increase the batch size? [y/n]: ");
                char newInput = sc.next().charAt(0);
                sc.nextLine(); 

                if (newInput == 'y') {
                    batch = newArray(batch); //calling the method created to create newArray
                    capacity = batch.length - pointer;
                } else {
                    break;
                }
            }

            System.out.print("Do you want to add a student? [y/n]: ");
            char toContinue = sc.next().charAt(0);
            sc.nextLine(); 

            if (toContinue != 'y') { //toContinue = 'n' or anything else
                break;
            }

            Student student = new Student();

            // Assigning details of student through user input
            System.out.print("Enter name: ");
            student.setName(sc.nextLine());

            System.out.print("Enter age: ");
            while (!sc.hasNextByte()) { //if age not entered properly
                System.out.print("Invalid age. Enter a valid age: "); //re-enter
                sc.next();
            }
            student.setAge(sc.nextByte());

            System.out.print("Enter Mobile Number: ");
            while (!sc.hasNextLong()) { //if mobNumber not entered properly
                System.out.print("Invalid mobile number. Enter a valid number: "); //re-enter
                sc.next();
            }
            student.setMobNumber(sc.nextLong());
            sc.nextLine(); // Clear buffer

            batch[pointer++] = student; //to place student 
            capacity--; //decrease capacity by 1 ->  3->2->1->0
            System.out.println("Student added successfully!\n");
        } while (true);

        // Print the batch information
        System.out.println("\n--- STUDENT BATCH DETAILS ---");
        for (int i = 0; i < batch.length; i++) {
            if (batch[i] == null) {
                continue;
            }
            System.out.println("Student " + (i + 1));
            System.out.println("Name: " + batch[i].getName());
            System.out.println("Age: " + batch[i].getAge());
            System.out.println("Mobile Number: " + batch[i].getmobNumber());
            System.out.println();
        }

        sc.close();
    }

    // Create a new array with double the size of the old array
    public static Student[] newArray(Student[] oldArray) {
        //creating newArr of Student datatype
        Student[] newArr = new Student[oldArray.length * 2];
        for (int i = 0; i < oldArray.length; i++) {
            newArr[i] = oldArray[i]; //to store old Array elements in new Array
        }
        return newArr;
    }
}
