import java.util.Scanner;
class student {
    int id,marks[] = new int[3];
    String name,dob;
    char g;
    student(int id, String name, char g, String dob, int marks[])
    {
        this.id=id;
        this.name=name;
        this.g=g;
        this.dob=dob;
        for (int i=0;i<3;i++)
            this.marks[i]=marks[i];
    }
    public void display()
    {
        System.out.println("\nDetails of the searched student -");
        System.out.println("\tID : "+id);
        System.out.println("\tName : "+name);
        System.out.println("\tGender(M/F) : "+g);
        System.out.println("\tDOB(DD/MM/YYYY) : "+dob);
        System.out.println("\tMarks in each subject out of 100% -");
        System.out.println("\t\tEnglish : "+marks[0]+"%");
        System.out.println("\t\tMath : "+marks[1]+"%");
        System.out.println("\t\tComputer Science : "+marks[2]+"%");
        System.out.println("\n\n");
    }
}
public class student7d {
    static void searchid (student stu[], int id)
    {
        for (int i=0;i<stu.length;i++)
            if (stu[i].id == id)
                stu[i].display();
            else
                System.out.println("\nNo student is found with "+id+" id");
    }
    static void searchname (student stu[], String name)
    {
        for (int i=0;i<stu.length;i++)
            if (stu[i].name.equals(name))
                stu[i].display();
            else
                System.out.println("\nNo student is found of name "+name);
    }
    public static void main (String args[])
    {
        int id,marks[] = new int[3];
        String name,dob;
        char g;
        Scanner s = new Scanner(System.in);
        System.out.print("Enter total number of students : ");
        int n = s.nextInt();
        student stu[] = new student[n];
        for (int i=0;i<n;i++)
        {
            System.out.println("Enter student no. "+(i+1)+" details -");
            System.out.print("id : ");
            id = s.nextInt();
            System.out.print("full name : ");
            s.nextLine();
            name = s.nextLine();
            System.out.print("gender(M/F) : ");
            g = s.next().charAt(0);
            System.out.print("dob(dd/mm/yyyy) : ");
            dob = s.next();
            System.out.print("Marks details(out of 100) : \n\tEnglish : ");
            marks[0] = s.nextInt();
            System.out.print("\tMaths : ");
            marks[1] = s.nextInt();
            System.out.print("\tComputer Science : ");
            marks[2] = s.nextInt();
            stu[i] = new student(id,name,g,dob,marks);
        }
        System.out.println("\nStudent database stored successfully !!");
        System.out.println("\nSearch Student\nEnter -\n1 for search by ID\n2 for search by name ");
        int ch = s.nextInt();
        switch (ch)
        {
            case 1: System.out.print("Enter the ID : ");
                    int ids = s.nextInt();
                    searchid(stu,ids);
                    break;
            case 2: System.out.print("Enter full name : ");
                    s.nextLine();
                    String names = s.nextLine();
                    searchname(stu,names);
                    break;
            default:System.out.print("Wrong input!!");
        }
    }
}
