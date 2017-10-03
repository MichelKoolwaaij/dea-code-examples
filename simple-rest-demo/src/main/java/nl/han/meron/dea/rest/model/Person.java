package nl.han.meron.dea.rest.model;

import javax.xml.bind.annotation.XmlAttribute;

/**
 * Created by meron on 23/03/2017.
 */
public class Person {

    private String name;

    public String getName() {
        return name;
    }

    @XmlAttribute(name="naam")
    public void setName(String name) {
        this.name = name;
    }
}
