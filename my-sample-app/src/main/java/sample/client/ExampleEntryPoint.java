package sample.client;

import com.google.gwt.core.client.EntryPoint;
import com.google.gwt.user.client.ui.RootPanel;

import com.samples.library.client.HelloWorldWidget;

/**
 * Created by hhernandez on 21/06/16.
 */
public class ExampleEntryPoint implements EntryPoint {
    @Override
    public void onModuleLoad() {
        RootPanel.get().add(new HelloWorldWidget());
    }
}
