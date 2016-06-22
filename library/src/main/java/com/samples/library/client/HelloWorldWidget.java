package com.samples.library.client;

import com.google.gwt.dom.client.Document;
import com.google.gwt.user.client.ui.Widget;

import java.util.Date;

/**
 * Created by hhernandez on 21/06/16.
 */
public class HelloWorldWidget extends Widget {
    public HelloWorldWidget() {
        setElement(Document.get().createDivElement());
        getElement().setInnerText("Hello GWT World!" + new Date());
    }
}
