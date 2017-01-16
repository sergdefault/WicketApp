package com.tsymabaliuk.Hello;

import org.apache.wicket.PageParameters;
import org.apache.wicket.markup.html.WebPage;
import org.apache.wicket.markup.html.basic.Label;
import org.apache.wicket.markup.html.link.Link;
import org.apache.wicket.model.AbstractReadOnlyModel;
import org.apache.wicket.model.IModel;

/**
 * Created by Tsymbaliuk Serhii on 05.01.2017.
 */
public class Hello extends WebPage {
    private static final long serialVersionUID = 1L;

    private int counter = 0;

    public Hello() {
        IModel<Integer> counterModel = new AbstractReadOnlyModel<Integer>() {
            private static final long serialVersionUID = 1L;

            @Override
            public Integer getObject() {
                return counter;
            }
        };
        // test message
        Label label = new Label("counter", counterModel);
        add(label);

        Link<Void> link = new Link<Void>("increment") {
            private static final long serialVersionUID = 1L;

            @Override
            public void onClick() {
                counter++;
            }
        };

        Link<Void> linkDecrement = new Link<Void>("decrement") {
            private static final long serialVersionUID = 1L;

            @Override
            public void onClick() {
                counter--;
            }
        };
        add(linkDecrement);
        add(link);
    }
}
