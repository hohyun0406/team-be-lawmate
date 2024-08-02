package site.lawmate.admin.service;

import reactor.core.publisher.Mono;

public interface MailService {

    Mono<Void> sendMail(String to, String subject, String text);

}
