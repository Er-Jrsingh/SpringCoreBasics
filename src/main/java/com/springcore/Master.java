package com.springcore;

import com.springcore.dao.StudentDao;
import com.springcore.entities.Student;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.List;

public class Master {

    public static void main(String[] args) {

        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("config.xml");
        StudentDao studentDao = applicationContext.getBean("studentDao", StudentDao.class);

        System.out.println("**************************** Welcome To My App ***************************************");

        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        boolean looper = true;
        while (looper) {

            System.out.println("PRESS 1 for add new student");
            System.out.println("PRESS 2 for showing student Details");
            System.out.println("PRESS 3 for showing all student With Details");
            System.out.println("PRESS 4 for updating student");
            System.out.println("PRESS 5 for delete student");
            System.out.println("PRESS 6 for exit");

            try {
                int input = Integer.parseInt(bufferedReader.readLine());
                switch (input) {

                    case 1: {

                        System.out.println("*******************************************************************************************");

                        System.out.println("Enter Student Id");

                        int stuId = Integer.parseInt(bufferedReader.readLine());

                        System.out.println("Enter Student Name");

                        String stuName = bufferedReader.readLine();

                        System.out.println("Enter Student City");

                        String stuCity = bufferedReader.readLine();

                        Student student = new Student(stuId, stuName, stuCity);

                        int res = studentDao.insert(student);

                        System.out.println(res + " Inserted Successfully");

                        System.out.println("*******************************************************************************************");

                        break;
                    }

                    case 2: {
                        System.out.println("*******************************************************************************************");

                        System.out.println("Enter Student Id");

                        int stuId = Integer.parseInt(bufferedReader.readLine());

                        Student student = studentDao.getStudent(stuId);

                        System.out.println(student.getId() + " " + student.getName() + " " + student.getCity());

                        System.out.println("*******************************************************************************************");
                        break;

                    }

                    case 3: {
                        System.out.println("*******************************************************************************************");

                        List<Student> students = studentDao.getAllStudent();
                        for (Student s : students) {
                            System.out.println(s.getId() + " " + s.getName() + " " + s.getCity());
                        }

                        System.out.println("*******************************************************************************************");

                        break;
                    }

                    case 4: {
                        System.out.println("*******************************************************************************************");

                        System.out.println("Enter Student Id To Update");

                        int stuId = Integer.parseInt(bufferedReader.readLine());

                        System.out.println("Enter Student Name");

                        String stuName = bufferedReader.readLine();

                        System.out.println("Enter Student City");

                        String stuCity = bufferedReader.readLine();

                        Student student = new Student(stuId, stuName, stuCity);

                        studentDao.updateStudent(student);

                        System.out.println("Updated Successfully");

                        System.out.println("*******************************************************************************************");

                        break;

                    }

                    case 5: {
                        System.out.println("*******************************************************************************************");

                        System.out.println("Enter Student Id");

                        int stuId = Integer.parseInt(bufferedReader.readLine());
                        studentDao.deleteStudent(stuId);
                        System.out.println("Deleted Successfully");

                        System.out.println("*******************************************************************************************");

                        break;
                    }

                    case 6: {
                        looper = false;
                        break;
                    }

                    default: {
                        System.out.println("Wrong Choice ! Please Enter From Above");
                    }
                }
            } catch (Exception e) {
                System.out.println("Invalid Input Please Try Another One !");
                System.out.println(e.getMessage());
            }
        }

        System.out.println("Thank You For Using My App !! ");
        System.out.println("See You Soon...! ");

//        Student student = new Student(2, "Jitu Thakur", "Bilaspur");
//        int rs = studentDao.insert(student);
//        System.out.println(rs);

    }
}
