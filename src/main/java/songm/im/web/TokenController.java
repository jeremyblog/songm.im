package songm.im.web;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class TokenController {

    @RequestMapping(value = "/token", method = RequestMethod.POST)
    public String getToken(String uid, String nick, String avatar) {
        
        return "data";
    }
}