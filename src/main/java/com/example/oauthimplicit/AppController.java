package com.example.oauthimplicit;


import org.json.JSONObject;
import org.springframework.web.bind.annotation.*;

import java.util.HashMap;
import java.util.Map;


@RestController
public class AppController {

    @RequestMapping(value = "/api/public", method = RequestMethod.GET, produces = "application/json")
    @ResponseBody
    public String publicEndpoint() {
        return new JSONObject()
                .put("message", "Hello from a public endpoint! You don\'t need to be authenticated to see this.")
                .toString();
    }

    @RequestMapping(value = "/api/private", method = RequestMethod.GET, produces = "application/json")
    @ResponseBody
    public String privateEndpoint() {
        return new JSONObject()
                .put("message", "Hello from a private endpoint! You need to be authenticated to see this.")
                .toString();
    }

    @RequestMapping(value = "/api/private-scoped", method = RequestMethod.GET, produces = "application/json")
    @ResponseBody
    public String privateScopedEndpoint() {
        return new JSONObject()
                .put("message", "Hello from a private endpoint! You need to be authenticated and have a scope of read:messages to see this.")
                .toString();
    }

    @RequestMapping(value = "/config", method = RequestMethod.GET, produces = "application/json")
    @ResponseBody
    public String getAppConfigs(){

        return new JSONObject()
                .put("domain", System.getenv("DOMAIN"))
                .put("clientID", System.getenv("CLIENT_ID"))
                .put("audience", System.getenv("AUDIENCE"))
                .put("issuer", System.getenv("ISSUER"))
                .toString();

    }
}
