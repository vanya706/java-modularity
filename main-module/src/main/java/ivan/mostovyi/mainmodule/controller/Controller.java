package ivan.mostovyi.mainmodule.controller;

import ivan.mostovyi.librarymodule.CollectionUtils;
import ivan.mostovyi.businesslogicmodule.EmailSender;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.Set;

@RestController
public class Controller {

    @PostMapping
    public void test(@RequestBody Set<String> args) {
        String email = CollectionUtils.getFirstNotNull(args);
        EmailSender.sendEmails(List.of(email));
    }

}
