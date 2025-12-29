class Student
{
    String name;

    Student(String n)
    {
        name = n;
    }

    public String toString()
    {
        return name;
    }
}

class Stack<E>
{
    private E[] arr;
    private int top = -1;

    @SuppressWarnings("unchecked")
    Stack(int size)
    {
        arr = (E[]) new Object[size];
    }

    void push(E item)
    {
        arr[++top] = item;
    }

    E pop()
    {
        return arr[top--];
    }

    boolean hasElements()
    {
        return top >= 0;
    }
}

public class GenericStackDemo
{
    public static void main(String[] args)
    {
        Stack<Student> s = new Stack<Student>(2);

        s.push(new Student("Ram"));
        s.push(new Student("Sam"));

        while (s.hasElements())
        {
            System.out.println(s.pop());
        }
    }
}