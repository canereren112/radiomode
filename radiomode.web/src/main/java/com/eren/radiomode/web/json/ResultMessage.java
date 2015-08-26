/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.eren.radiomode.web.json;

import com.thoughtworks.xstream.annotations.XStreamAlias;

/**
 *
 * @author work
 */
@XStreamAlias("message")
public class ResultMessage extends Parameter {

    String type = "";
    String code = "noerror";
    String description = "";

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }
}
