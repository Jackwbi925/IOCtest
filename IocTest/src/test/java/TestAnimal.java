import com.peng.spring.model.Animal;
import junit.framework.TestCase;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;




public class TestAnimal extends TestCase{
    public final static String Duck  = "duck";
    public final static String Dog = "dog";
    public void test(){
        ApplicationContext ctx = new ClassPathXmlApplicationContext("AnimalBean.xml");
        Animal animal = null;

        animal = (Animal) ctx.getBean(Duck);
        animal.leg();
        animal.wing();
        animal = (Animal) ctx.getBean(Dog);
        animal.leg();
        animal.wing();
    }

}
