package com.qkyrie.spring.examples.thymeleaf.mvc;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.boot.CommandLineRunner;
import org.springframework.core.env.Environment;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import java.util.Arrays;
import java.util.stream.Collectors;

/**
 * User: Quinten
 * Date: 25-4-2014
 * Time: 12:52
 *
 * @author Quinten De Swaef
 */
@Controller
@RequestMapping(value = "/")
public class IndexController {
    private Log LOG = LogFactory.getLog(IndexController.class);

    @RequestMapping(method = RequestMethod.GET)
    public String index(ModelMap map) {
        return "main";
    }

}
