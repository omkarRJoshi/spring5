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

### 1.2 Bean
- we can get rid of the @Component annotation us using @Bean annotaion in the AppConfig.java file
- ex 
```
import org.springframework.stereotype.Component;
@Component("swift")
public class Swift implements Car {

}
```
  we can achieve same this by adding below code in appConfig.java file
```
import org.springframework.context.annotation.Bean;


@Bean("swift")
	public Swift swift() {
		return new Swift();
	}
```

---

## Spring MVC

### taglibs to add at the top of jsp files
```
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
```

### syntax of view for Forms, input, radio buttons, dropdown, text input, checkboxes

userFormView.jsp
```
<body>
	<form:form action="displayUserInfo" modelAttribute="user">
		Name : <form:input path="name" />
		<p />
		Gender : <form:radiobuttons path="gender" items="${genderMap}" />
		<p />
		Country : <form:select path="country" items="${countryMap }">
					
				  </form:select>
		<p />
		Introduction : <form:textarea path="intro" />
		<p/>
		Visited Countries : <form:checkboxes items="${visitedCountriesMap }" path="visitedCountries" />
		<p/>
		<input type="submit" value="Submit" />
	</form:form>

</body>
</html>
```
MainController.java
```
@GetMapping("/")
	public ModelAndView home() {
		ModelAndView modelAndView = new ModelAndView("userFormView");
		User user = new User();
		Map<String, String> genderMap = new HashMap<String, String>();
		genderMap.put("male", "Male");
		genderMap.put("female", "Female");
		
		Map<String, String> countryMap = new HashMap<String, String>();
		countryMap.put("India", "India");
		countryMap.put("China", "China");
		countryMap.put("USA", "USA");
		countryMap.put("UK", "UK");
		
		Map<String, String> visitedCountriesMap = new HashMap<String, String>();
		visitedCountriesMap.put("India", "India");
		visitedCountriesMap.put("China", "China");
		visitedCountriesMap.put("USA", "USA");
		visitedCountriesMap.put("UK", "UK");
		
		modelAndView.addObject("genderMap", genderMap);
		modelAndView.addObject("countryMap", countryMap);
		modelAndView.addObject("visitedCountriesMap", visitedCountriesMap);
		modelAndView.addObject("user", user);
		
		return modelAndView;
	}
	
	@PostMapping("/displayUserInfo")
	public ModelAndView displayUserInfo(@ModelAttribute User user) {
		ModelAndView modelAndView = new ModelAndView("displayUserInfoView");
		modelAndView.addObject("userinfo", user);
		return modelAndView;
	}
```
displayUserInfoView.jsp
```
<body>
Name : ${userinfo.name} <p/>
Gender : ${userinfo.gender} <p/>
Country : ${userinfo.country} <p/>
Introduction : ${userinfo.intro} <p/>
VisitedCountries : 
<ul>
<c:forEach items = "${user.visitedCountries }" var = "country">
	<li>${country }</li>
</c:forEach>
</ul>
</body>
```
User.java
```
public class User {
	private String name;
	private String gender;
	private String country;
	private String intro;
	private String[] visitedCountries;

  //getters and setters for all above variables
}
```