package org.rp.wtd.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by IntelliJ IDEA.
 * User: rp
 * Date: 10.08.19
 * Time: 18:40
 */

@RestController
public class VersionController {

    @RequestMapping(value = "/version", method = RequestMethod.GET)
    public String version() {
        return "1.0";
    }


}
