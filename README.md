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

### 1.1 Autowire
- Whenever we use @Autowired annotation, we are making use of a default constructor
- whenever there is not a requirement to create a object of autowired class in the memory, we can make required a false like `@Autowired(required = false)` 
  - due to this, spring will skip the object creation if we dont use it in the code
- If we use @Autowired on property or constructor, it makes no difference
- but when we use @Autowired on method, then there is difference, we need to explicityly call or we need to annotation on method to run it