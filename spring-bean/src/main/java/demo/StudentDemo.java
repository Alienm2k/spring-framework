package demo;
 import org.springframework.beans.factory.BeanFactory;
import demo.Student;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;

public class StudentDemo {
    public static void main(String[] args) {

//        ApplicationContext factory = new FileSystemXmlApplicationContext("beans.xml");
//        Student student = factory.getBean("student",Student.class);

        AnnotationConfigApplicationContext factory = new AnnotationConfigApplicationContext(AppConfig.class);
        Student student = factory.getBean("student", Student.class);

        System.out.println("Name :" + student.getFirstName() +" "+ student.getLastName());
        System.out.println("Code :"+ student.getCode());

        factory.close();

//        ((FileSystemXmlApplicationContext)factory).close();
    }
}
