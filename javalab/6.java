import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class FeedbackForm
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);

        try (FileWriter fw = new FileWriter("feedback.txt", true))
        {
            System.out.print("Enter Student Name: ");
            String name = sc.nextLine();

            System.out.print("Enter Course Name: ");
            String course = sc.nextLine();

            System.out.print("Enter Feedback: ");
            String feedback = sc.nextLine();

            fw.write("Student Name: " + name + "\n");
            fw.write("Course: " + course + "\n");
            fw.write("Feedback: " + feedback + "\n");
            fw.write("----------------------------\n");

            System.out.println("\nFeedback saved successfully in feedback.txt");
        }
        catch (IOException e)
        {
            System.out.println("Error: " + e.getMessage());
        }

        sc.close();
    }
}