# Spring 5

#### Basic maven dependecy added as follows
- Spring Core
- Spring Context

## 1. Dependecy inversion
- normal way to create a object by referece of interface
```
InterfaceName obj = new Class();
```
- object creation by using dependency inversion which is provided by Spring
```
// In AppConfig class we define a package, for which we want to use components 
// like - @ComponentScan("com") on above Declaration of AppConfig class
AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);
Interface myCar1 = context.getBean("<annotation_for_class>", Car.class);
```