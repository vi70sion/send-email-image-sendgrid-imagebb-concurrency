package org.example.utility;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class ApiKeyService {
    public ApiKeyService() { }

    @Value("${sendgrid.api.key}")
    private String sendGridApiKey;

    public String getSendGridApiKey() {
        return sendGridApiKey;
    }
}
