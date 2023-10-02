package Labassesment1;

public class Main {
    public static void main(String[] args) {

        University university = new University();


        Computer computer1 = new Computer("C001", "LCD1", 8, 500, true);
        Computer computer2 = new Computer("C002", "LCD2", 16, 1000, false);


        Employee labAttendant1 = new Employee("E001", "John Doe");
        Employee labAttendant2 = new Employee("E002", "Jane Smith");


        Lab lab1 = new Lab("L001", 10);
        Lab lab2 = new Lab("L002", 5);


        lab1.setLabAttendant(labAttendant1);
        lab2.setLabAttendant(labAttendant2);


        lab1.addComputer(computer1);
        lab2.addComputer(computer2);






    }
