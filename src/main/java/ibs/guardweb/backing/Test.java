/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package ibs.guardweb.backing;

import javax.faces.bean.ManagedBean;
import javax.inject.Named;

/**
 *
 * @author adr_pk
 */
@Named
public class Test {
    private String str = "Hello!!";

    public String getStr() {
        return str;
    }

    public void setStr(String str) {
        this.str = str;
    }
    
}
