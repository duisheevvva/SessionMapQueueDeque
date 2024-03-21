import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class StudentMain {
    public static void main(String[] args) {
        Map<String,Student> students= new HashMap<>();
        students.put("nurkyz@gmail.com",new Student("Nurkyz","nurkyz@gmail.com"));
        students.put("sabina@gmail.com",new Student("Sabina","sabina@gmail.com"));
        students.put("sultan@gmail.com",new Student("Sultan","sultan@gmail.com"));

        System.out.println("write student email : ");
        String emailScan =  new Scanner(System.in).nextLine();
        if (students.containsKey(emailScan)){
            System.out.println("myndai student bazada bar");
        }else {
            System.out.println("write name :");
            String  newName= new Scanner(System.in).nextLine();
            Student student = new Student(emailScan,newName);
            students.put(emailScan,student);
        }
        for (Map.Entry<String ,Student> students1:students.entrySet()) {
            System.out.println(students1.getKey() + " " + students1.getValue());
        }

    }
}
