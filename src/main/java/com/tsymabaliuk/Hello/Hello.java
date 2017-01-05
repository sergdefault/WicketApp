package com.tsymabaliuk.Hello;

import org.apache.wicket.PageParameters;
import org.apache.wicket.markup.html.WebPage;
import org.apache.wicket.markup.html.basic.Label;

/**
 * Created by Tsymbaliuk Serhii on 05.01.2017.
 */
public class Hello extends WebPage {
    private static final long serialVersionUID = 1L;

    public Hello(final PageParameters parameters) {
        add(new Label("message", "Hello World, Wicket"));
        add(new Label("list", "Hello World, Wicket"));
    }
}
