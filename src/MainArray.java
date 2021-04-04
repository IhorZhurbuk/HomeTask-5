import java.util.Date;

public class MainArray {
    static Student[] storage;

    public static void main(String[] args) {
        storage = new Student[4];
        storage[0] = new Student(1, "Bobrov", "Artur", "Radionovuch", new Date(1990, 3, 2), "Gryshevskogo 5a", 6667606, "Ekonomicheskii", 3, "EK-32");
        storage[1] = new Student(2, "Baduk", "Vadim", "Artemovuch", new Date(1990, 1, 2), "Vatytina 2", 9277606, "Inzheneriu", 4, "IN-43");
        storage[2] = new Student(3, "Laptev", "Anatoliu", "Viacheslavovuch", new Date(1992, 3, 12), "Livchenka 7", 7277190, "Ekonomicheskii", 2, "EK-22");
        storage[3] = new Student(4, "Kravchenko", "Max", "Andriuovuch", new Date(1988, 12, 31), "Nezalezhnosti 1", 6667190, "Inzheneriu", 1, "IN-11");

        facultyPrint("Ekonomicheskii");
        fakkurs("Ekonomicheskii", 2);
        daterojdenia(1990);
        groupPrint("IN-11");


    }


    public static void facultyPrint(String studentFaculty) {
        for (int i = 0; i < storage.length; i++)
            if (storage[i].getFakultet().equals(studentFaculty)) {
                System.out.println(storage[i].getName() + " " + storage[i].getSurname());
            }
        System.out.println("--------");

    }

    public static void fakkurs(String studentFaculty, int kurs) {
        for (int i = 0; i < storage.length; i++)
            if (storage[i].getFakultet().equals(studentFaculty) & (storage[i].getKurs() == kurs)) {
                System.out.println(storage[i].getName() + " " + storage[i].getSurname());
            }
        System.out.println("--------");
    }

    public static void daterojdenia(int year) {
        for (int i = 0; i < storage.length; i++)
            if (storage[i].getBithrday().getYear() == (year)) {
                System.out.println(storage[i].getName() + " " + storage[i].getSurname());
            }
        System.out.println("--------");
    }

    public static void groupPrint(String listGroup) {
        for (int i = 0; i < storage.length; i++) 
            if (storage[i].getGruppa().equals(listGroup)) {
                System.out.println(storage[i].getName() + " " + storage[i].getSurname());
            }
        System.out.println("--------");
    }
}



