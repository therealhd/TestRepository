package edu.pcc.cis.testrepository;

public class message {
    public message() {
        printMessage();
        findValue(7, 57);
    }
    public void printMessage() {
        System.out.println("Print out a message");
    }

    public int findValue(int a, int b) {
        int sum = a + b;
        return sum;
    }
}



