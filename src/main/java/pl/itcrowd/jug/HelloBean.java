package pl.itcrowd.jug;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;
import java.io.Serializable;
import java.util.logging.Logger;

@ManagedBean
@SessionScoped
public class HelloBean implements Serializable {


    private String name;
    private String surname;
    private int dateBirth;

    private static final Logger LOGGER = Logger.getLogger(HelloBean.class.getCanonicalName());

    public String getName() {

        LOGGER.info("HelloBean->getName()");
        return name;
    }

    public void setName(String name) {

        LOGGER.info("HelloBean->setName()");
        this.name = name;
    }

    public String getSurname() {

        LOGGER.info("HelloBean->getSurname()");
        return surname;
    }

    public void setSurname(String surname) {

        LOGGER.info("HelloBean->setSurname()");
        this.surname = surname;
    }

    public int getDateBirth() {
        LOGGER.info("HelloBean->getDateBirth()");
        return dateBirth;
    }

    public void setDateBirth(int dateBirth) {
        LOGGER.info("HelloBean->setDateBirth()");
        this.dateBirth = dateBirth;
    }
}
