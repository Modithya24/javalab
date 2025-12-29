import java.io.*;

class InvalidMarksException extends Exception
{
    InvalidMarksException(String msg)
    {
        super(msg);
    }
}

class Student
{
    String name;
    Integer marks;

    Student(String name, Integer marks)
    {
        this.name = name;
        this.marks = marks;
    }
}

public class ExceptionDemo
{
    static void checkMarks(int m) throws InvalidMarksException
    {
        if (m < 0 || m > 100)
            throw new InvalidMarksException("Marks must be 0-100");
    }

    public static void main(String[] args)
    {
        System.out.println("Program Started");

        try
        {
            int a = 10 / 0;
        }
        catch (ArithmeticException e)
        {
            System.out.println("Arithmetic Error: " + e.getMessage());
        }

        try
        {
            Student s = null;
            System.out.println(s.name);
        }
        catch (NullPointerException e)
        {
            System.out.println("Null Data Error: Student record missing");
        }

        try
        {
            throw new IllegalAccessException("Unauthorized Access!");
        }
        catch (IllegalAccessException e)
        {
            System.out.println("Security Error: " + e.getMessage());
        }

        try
        {
            throw new RuntimeException("Unexpected Result Failure!");
        }
        catch (RuntimeException e)
        {
            System.out.println("Runtime Error: " + e.getMessage());
        }

        try
        {
            FileInputStream f = new FileInputStream("abc.txt");
        }
        catch (FileNotFoundException e)
        {
            System.out.println("File Error: " + e.getMessage());
        }

        try
        {
            checkMarks(120);
        }
        catch (InvalidMarksException e)
        {
            System.out.println("Custom Exception: " + e.getMessage());
        }
        finally
        {
            System.out.println("Finally block executed!");
        }

        System.out.println("Program continues fine after handling exceptions");
    }
}