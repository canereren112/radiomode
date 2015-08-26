/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.eren.radiomode.web.view;

import java.io.PrintWriter;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import org.springframework.web.servlet.View;

/**
 *
 * @author work
 */
public class AutoCompleteView implements View {

    public static final AutoCompleteView instance = new AutoCompleteView();
    Map map;

    public Map getMap() {
        return map;
    }

    public void setMap(Map map) {
        this.map = map;
    }

    public String getContentType() {
        return "text/html; charset=UTF-8";
    }

    public void render(Map model, HttpServletRequest request, HttpServletResponse response)
            throws Exception {
        response.setCharacterEncoding("utf-8");
        PrintWriter writer = response.getWriter();
        Set set = map.entrySet();
        for(Object object : set) {
            Entry entry = (Entry) object;
            writer.println(entry.getValue() + "|" + entry.getKey());
        }
    }
}
