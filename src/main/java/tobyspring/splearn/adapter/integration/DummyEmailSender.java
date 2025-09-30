package tobyspring.splearn.adapter.integration;

import org.springframework.context.annotation.Fallback;
import org.springframework.stereotype.Component;
import tobyspring.splearn.application.member.required.EmailSender;
import tobyspring.splearn.domain.shared.Email;

@Component
@Fallback // 스프링 6.2 이상에서 지원하는 어노테이션, 해당 빈이 없을 때 대체 빈으로 사용됨
public class DummyEmailSender implements EmailSender {

    @Override
    public void send(Email email, String subject, String body) {
        System.out.println("DummyEmailSender email = " + email);
    }
}
