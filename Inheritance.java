class Student //Parent class
{
    String name; int rollno; char Gender;
    String schoolName;
}

class Exams extends Student //Child class
{
    String subject; int marks;

    public String toString()
    {
        return name + ": " + marks + " in " + subject;
    }
}

class Result 
{
    public static void main(String[] args)
    {
        Exams englishMarks = new Exams();
        englishMarks.name = "Kriti";
        englishMarks.rollno = 35;
        englishMarks.Gender = 'F';
        englishMarks.subject = "English";
        englishMarks.marks = 100;
        englishMarks.schoolName = "AIT";

        System.out.println(englishMarks);
    }
}