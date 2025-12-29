interface IntStack
{
    void push(int item);
    int pop();
}

class FixedStack implements IntStack
{
    private int stack[];
    private int top;

    FixedStack(int size)
    {
        stack = new int[size];
        top = -1;
    }

    public void push(int item)
    {
        if (top == stack.length - 1)
        {
            System.out.println("FixedStack is full");
        }
        else
        {
            stack[++top] = item;
        }
    }

    public int pop()
    {
        if (top < 0)
        {
            System.out.println("FixedStack is empty");
            return -1;
        }
        else
        {
            return stack[top--];
        }
    }
}

class DynamicStack implements IntStack
{
    private int stack[];
    private int top;

    DynamicStack(int size)
    {
        stack = new int[size];
        top = -1;
    }

    public void push(int item)
    {
        if (top == stack.length - 1)
        {
            int newstack[] = new int[stack.length * 2];
            for (int i = 0; i < stack.length; i++)
                newstack[i] = stack[i];

            stack = newstack;
        }
        stack[++top] = item;
    }

    public int pop()
    {
        if (top < 0)
        {
            System.out.println("Dynamic Stack is empty!");
            return -1;
        }
        else
        {
            return stack[top--];
        }
    }
}

public class StackDemo
{
    public static void main(String[] args)
    {
        IntStack fs = new FixedStack(3);
        IntStack ds = new DynamicStack(2);

        System.out.println("Using FixedStack:");
        fs.push(10);
        fs.push(20);
        fs.push(30);
        System.out.println(fs.pop());
        System.out.println(fs.pop());

        System.out.println("Using DynamicStack:");
        ds.push(2);
        System.out.println(ds.pop());
        System.out.println(ds.pop());
    }
}