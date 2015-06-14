import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.config.BeanPostProcessor;
import org.springframework.beans.factory.config.CustomEditorConfigurer;
import org.springframework.beans.propertyeditors.ClassEditor;
import org.springframework.context.ApplicationContext;
import org.springframework.transaction.interceptor.TransactionProxyFactoryBean;

import java.beans.PropertyEditor;
import java.beans.PropertyEditorSupport;

/**
 * Created by Vitek on 24.05.2015.
 */
public class MyExperiments
{
    public static void main(String[] args)
    {
        BeanFactory beanFactory;
        ApplicationContext applicationContext;
        TransactionProxyFactoryBean transactionProxyFactoryBean;
        PropertyEditor propertyEditor;
        PropertyEditorSupport propertyEditorSupport;
        ClassEditor classEditor;

        CustomEditorConfigurer customEditorConfigurer;

        BeanPostProcessor beanPostProcessor;



    }
}
