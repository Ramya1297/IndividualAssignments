/**
 * 
 */
package Test;



import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;

import com.sj.model.Student;



/**
 * @author Abridge
 *
 */
public class StudentTest {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		XmlBeanFactory beanFactory = new XmlBeanFactory(new ClassPathResource("New.xml"));
		Student myBean=(Student) beanFactory.getBean("StudentProxy");
		myBean.printName();
		System.out.println("5555");
		
		myBean.printCourse();
		System.out.println("#####");
		
		myBean.printRollono();
		System.out.println("*****");
		myBean.printThrowException();

	}

}
