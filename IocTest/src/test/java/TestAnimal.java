import com.peng.spring.model.Animal;
import com.peng.spring.model.impl.Dog;
import com.peng.spring.model.impl.Duck;
import junit.framework.TestCase;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;

/**
 * Created by Jack on 2015/12/29.
 */
public class TestAnimal extends TestCase{
    public void test(){
        ApplicationContext ctx = new ClassPathXmlApplicationContext("AnimalBean.xml");
        Animal animal = null;

        animal = (Animal) ctx.getBean("Duck");
        animal.leg();
        animal.wing();
        animal = (Animal) ctx.getBean("Dog");
        animal.leg();
        animal.wing();
    }

}
