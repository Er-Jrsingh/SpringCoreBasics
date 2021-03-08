package com.springcore;

import com.springcore.collection.StudentDetailsBean;
import com.springcore.object.StuName;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Students {

    public static void main(String[] args) {

        ApplicationContext context = new ClassPathXmlApplicationContext("config.xml");

        StudentBean beanObject = (StudentBean) context.getBean("stuBean");
        System.out.println(beanObject);

        StudentBean beanObject2 = (StudentBean) context.getBean("stuBean2");
        System.out.println(beanObject2);

        ApplicationContext detailsBeanContext = new ClassPathXmlApplicationContext("collection_config.xml");
        StudentDetailsBean detailsBean = (StudentDetailsBean) detailsBeanContext.getBean("StuDetails");
        System.out.println(detailsBean);

        ApplicationContext stuNameContext = new ClassPathXmlApplicationContext("obj_config.xml");
        StuName stuNameObj = (StuName) stuNameContext.getBean("stuNameObject");
        System.out.println(stuNameObj);

        System.out.println(stuNameObj.getName());
        System.out.println(stuNameObj.getRollObj().getRollNo());

    }

}
