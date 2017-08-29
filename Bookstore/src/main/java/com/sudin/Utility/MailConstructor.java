package com.sudin.Utility;

import com.sudin.Domain.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.env.Environment;
import org.springframework.mail.SimpleMailMessage;
import org.springframework.stereotype.Component;

import java.util.Locale;

/**
 * Created by s-k-ii-p-s on 8/25/17.
 */

@Component
public class MailConstructor {

    @Autowired
    private Environment env;

    public SimpleMailMessage constructResetTokenEmail(
            String contextPath,Locale locale,String token, User user,String password){

        String url=contextPath + "/newUser?token="+token;
        String message="\nPlease click on this link to verify your email and edit your personal information. Your password is: \n"+password;
        SimpleMailMessage email=new SimpleMailMessage();
        email.setTo(user.getEmail());
        email.setSubject("Cp's Bookstore - New User");
        email.setText(url+message);
        email.setFrom(env.getProperty("support.email"));
        return email;
    }

}
