package com.tsymabaliuk;

import com.tsymabaliuk.Hello.Hello;
import org.apache.wicket.Page;
import org.apache.wicket.protocol.http.WebApplication;

/**
 * Created by Tsymbaliuk Serhii on 05.01.2017.
 */
public class MyApplication extends WebApplication {
    @Override
    public Class<? extends Page> getHomePage() {
        return Hello.class;
    }
}
