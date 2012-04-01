/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package ibs.guardweb.backing;

import javax.annotation.PostConstruct;
import javax.enterprise.context.RequestScoped;
import javax.inject.Named;

/**
 *
 * @author adr_pk
 */
@Named("namedTest")
@RequestScoped
public class NamedTest {

    private String str = "Hello22!!";
    @PostConstruct
    public void before() {
        System.out.println("coś się wydarzyło");
    }
    public String getStr() {
        return str;
    }

    public void setStr(String str) {
        this.str = str;
    }
}
