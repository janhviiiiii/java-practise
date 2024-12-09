package BatchManagementSystem;

import java.util.Scanner;

public class SDriver {
    static Scanner userInput = new Scanner(System.in);
    static Student[] batch = new Student[2];
    static byte capacity = (byte) batch.length;
    static byte pointer = 0;

    public static void main(String[] args) {
    do {
        if (capacity == 0) {
        System.out.println("batch is full");
        System.out.print("Do you want to increase capacity of batch? y/n : ");
        char userChoice = userInput.next().charAt(0);
        clearBuffer();

        if (userChoice == 'y') {
        batch = arrayExtender(batch);
        capacity = (byte) (batch.length - pointer);
        } else{
        break;
        }
    }

    if(toContinueAddingStudent())
        break;

    batch[pointer++] = createStudentAndAssignValuesThenReturn();
    capacity--;
    } while (true);

    for (int i = 0; i < batch.length; i++) {
        if (batch[i] != null) {
            System.out.println(batch[i].getName());
        }
    }
}

public static void clearBuffer() {
    userInput.nextLine();
}

public static Student createStudentAndAssignValuesThenReturn() {
    Student student = new Student();
    System.out.print("Enter name : ");
    student.setName(userInput.nextLine());
    return student;
}

public static boolean toContinueAddingStudent() {
    System.out.print("Continue adding students ? y/n : ");
    char userChoice = userInput.next().charAt(0);
    clearBuffer();
    if (userChoice != 'y') {
        return true;
    }
    return false;
}

public static Student[] arrayExtender (Student[] oldArray) {
    Student[] newArray = new Student[oldArray.length * 2];
    for (int i = 0; i < oldArray.length; i++) {
        newArray[i] = oldArray[i];
    }
    return newArray;
    }
}