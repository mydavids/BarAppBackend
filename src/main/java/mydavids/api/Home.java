package mydavids.api;

import org.omg.CORBA.Request;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by Yusiry on 8/20/2016.
 */
@RestController
@RequestMapping("/api/**")
public class Home {
    @RequestMapping(value = "home", method = RequestMethod.GET)
    public String Index(){
        return "<h1>Welcome to the BAR System</h1>";
    }
}
