package ivan.mostovyi.businesslogicmodule;

import ivan.mostovyi.librarymodule.CollectionUtils;

import java.util.List;

public class EmailSender {

    public static void sendEmails(List<String> emails) {
        // TODO(Mostovyi): 31/07/2022 send emails
        String email = CollectionUtils.getFirstNotNull(emails);
        System.out.println("Emails were send!:" + email);
    }

}
