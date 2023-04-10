package by.it.academy.travelagency.services;

import by.it.academy.travelagency.configs.MailProperties;
import lombok.Data;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

@Data
@Slf4j
@Service
public class MailServiceImpl implements MailService{

   private final MailProperties mailProperties;

    @Override
    public void sendMail() {
        mailProperties.getEmail();
    log.info("send email");
    }
}
