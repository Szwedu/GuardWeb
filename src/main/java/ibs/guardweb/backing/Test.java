/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package ibs.guardweb.backing;

import javax.faces.bean.ManagedBean;

/**
 *
 * @author adr_pk
 */
@ManagedBean(name="test")
public class Test {
    private String str = "Hello!!";

    public String getStr() {
        return str;
    }

    public void setStr(String str) {
        this.str = str;
    }
    
}
