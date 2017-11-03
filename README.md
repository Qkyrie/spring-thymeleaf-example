## Thymeleaf, a worthy alternative
If you were looking for a decent alternative for those old JSPs, look no further. 

Thymeleaf is a Java library. It is an **XML / XHTML / HTML5** template engine (extensible to other formats) that can work both in web and non-web environments. It is better suited for serving XHTML/HTML5 at the view layer of web applications, but it can process any XML file even in offline environments.

#### How does Thymeleaf compare to other web frameworks?

> From their web page FAQs

Thymeleaf makes a strong stress on **natural templating** —allowing templates to be working prototypes and its syntax tries to be cleaner and more in tune with the current trends in web development. Also, from an architectural standpoint, both Velocity and FreeMarker work as sequential text processors —which allows them to process many types of content— whereas Thymeleaf is based on XML parsing techniques —which limits it to XML-based formats. This makes Velocity and FreeMarker much more versatile, but on the other side allows Thymeleaf to take advantage of interesting features specific to XML-based environments, especially the web.

#### About this blog post

In this tutorial, I'll briefly show how we can serve a web page using spring boot and thymeleaf. This blogpost won't go into any depth of how thymeleaf works, or how you can use it. Instead, it will teach you how you can set up your environment with spring boot to serve the pages.

#### Accompanying code
This small tutorial is accompanied by a [Github Repository](https://github.com/Qkyrie/spring-thymeleaf-example). Not all content of the code at the repository will be discussed here, so don't forget to check it out later!

### Just a basic Controller
The controller we'll be using will be kept simple, as this is a tutorial on how to setup a thymeleaf application with spring boot, not an entire blogpost on spring mvc.

    @Controller
    @RequestMapping(value = "/")
    public class IndexController {
        @RequestMapping(method = RequestMethod.GET)
        public String index(ModelMap map) {
            return "main";
        }
    }
    
This will map the root of context to the *index()* method. Because the index returns "main", the template engine will try to resolve the page in your application with the name "main".

### Booting the application

The class which bootstraps the entire application is **ThymeLeafExample**. It will automatically configure everything for you, based on your gradle imports, which is discussed below.

    @Configuration
	@EnableAutoConfiguration
	@ComponentScan
	public class ThymeLeafExample {
		public static void main(String[] args) throws Exception {
        	SpringApplication.run(ThymeLeafExample.class);
    	}
	}

### Gradle import

For the sake of brevity, below you'll see the gradle imports that are necessary to use thymeleaf in a Spring Boot environment.

	compile("org.springframework.boot:spring-boot-starter")
    compile("org.springframework.boot:spring-boot-starter-web")
    compile("org.springframework.boot:spring-boot-starter-thymeleaf")

While starting up, Spring Boot will automatically detect the presence of the starter-web and starter-thymeleaf modules, and therefore making sure the correct interceptors and template engines are started.

### Your resources
Resources are defined - as the name implies - in your resources folder. Thymeleaf will automatically search for pages in your *templates* folder, directly under resources. 
In our controller, we returned "main" as index page. **/resources/templates/main.html** will be automatically resolved.

![](http://www.de-swaef.com/content/images/2014/May/Screenshot_4.png)

### Our Desired Result
If you run the example, as pulled from github using the following command:

	gradle bootRun

and navigate to http://localhost:8080 you should get something along the lines of the following screenshot.

![](http://www.de-swaef.com/content/images/2014/Jul/spring-thymeleaf.png)

### Coming up
In one of my future blogposts, I'll be discussing some more in depth on how we can change some of the default settings for thymeleaf.
