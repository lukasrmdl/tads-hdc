
package br.edu.ifsul.academico.projetotadshdc;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HomeController {

    @GetMapping("/api/")
    public String index() {
        return "index";
    }
}
