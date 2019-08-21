import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;
import com.rt.emp.*;


public class TestDept {
public static void main(String args[]) {
		
		BeanFactory factory=new XmlBeanFactory(new ClassPathResource("bean.xml"));
		Emp e=(Emp) factory.getBean("empBean");
		e.getDeptName();
	}
}
