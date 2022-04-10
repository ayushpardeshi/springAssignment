package Test;

import entityy.Cat;
import entityy.Color;
import entityy.Config;
import entityy.Dog;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class CatAndDogTest {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext ctx=new AnnotationConfigApplicationContext(Config.class);
        /* CAT AND IT'S COLOR OBJECTS */
        Cat c1= ctx.getBean(Cat.class);
        Color color = new Color();
        color.setBase_color("Black");
        color.setTexture_color("Black");
        c1.setCat_name("Tom");
        c1.setBreed_name("Persian");
        c1.setOwner_name("Ayush");
        c1.setColor(color);
        c1.catDisplay();

        /* DOG AND IT'S COLOR OBJECTS */
        Dog d1=ctx.getBean(Dog.class);
        Color color1 = new Color();
        color1.setBase_color("Brown");
        color1.setTexture_color("Brown");
        d1.setDog_name("dimpoo");
        d1.setBreed_name("pug");
        d1.setOwner_name("Ayush");
        d1.setColor(color1);
        d1.dogDisplay();
    }
}
