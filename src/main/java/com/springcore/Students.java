package com.springcore;
import com.springcore.ambiguity.DataBean;
import com.springcore.objects.StuInfo;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Students {

    public static void main(String[] args) {

        ApplicationContext context = new ClassPathXmlApplicationContext("config.xml");

        StudentBean beanObject = (StudentBean) context.getBean("stuBean");
        System.out.println(beanObject);

        StudentBean beanObject2 = (StudentBean) context.getBean("stuBean2");
        System.out.println(beanObject2);
        
        ApplicationContext ObjContext = new ClassPathXmlApplicationContext("obj_config.xml");

        StuInfo ObjBeanObject = (StuInfo) ObjContext.getBean("stuInfoObject");
        System.out.println(ObjBeanObject);
        
         ApplicationContext ambigContext = new ClassPathXmlApplicationContext("ambiguity_config.xml");

        DataBean dataBeanObject = (DataBean) ambigContext.getBean("dataBean");
        
        dataBeanObject.addition();

     

    }

}
