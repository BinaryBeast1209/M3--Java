public class Person {
    private String name;
    private int age;

    public Person(String name, int age) {
    this.name = name;
    this.age = age;
    }

    public String getName() {
    return name;
    }

    public int getAge() {
    return age;
    }
}

public class Student extends Person {
    private String major;

    public Student(String name, int age, String major) {
    super(name, age);
    this.major = major;
    }

    public String getMajor() {
    return major;
    }
}

public class Book {
    private String title;
    private String author;
    private int numPages;

    public Book(String t, String a, int np) {
    title = t;
    author = a;
    numPages = np;
    }

    public String getTitle() {
    return title;
    }

    public String getAuthor() {
    return author;
    }

    public int getNumPages() {
    return numPages;
    }
}

public class Main {
    public static void main(String[] args) {
    // Create and test objects
    Student student = new Student("John Doe", 28, "Computer Science");
    Book book = new Book("The Hobbit", "J.R.R. Tolkien", 295);

    // Print values from the object
    System.out.println(student.getName());
    System.out.println(student.getAge());
    System.out.println(student.getMajor());

    // Print values from the object using method reference
    System.out.println("Book's Information:");
    System.out.println("Name: " + book.getTitle());
    System.out.println("Author: " + book.getAuthor());
    System.out.println("Pages: " + book.getNumPages());
    }
}
