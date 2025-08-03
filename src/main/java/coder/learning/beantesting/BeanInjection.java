package coder.learning.beantesting;

import org.springframework.stereotype.Component;

// Marking this class for IOC by using @Component annotation
// This allows Spring to manage the lifecycle of this bean
@Component
public class BeanInjection {
    public String getMessage() {
        return "Bean Injection Successful!";
    }
}
