package com.demo.desjardins.labfinance;

import com.demo.desjardins.labfinance.model.Doc;
import org.springframework.data.rest.core.config.RepositoryRestConfiguration;
import org.springframework.data.rest.webmvc.config.RepositoryRestConfigurerAdapter;

public class RestRepositoryConfiguration extends RepositoryRestConfigurerAdapter {

    @Override
    public void configureRepositoryRestConfiguration(RepositoryRestConfiguration config) {
        config.exposeIdsFor(Doc.class);

        super.configureRepositoryRestConfiguration(config);
    }
}
