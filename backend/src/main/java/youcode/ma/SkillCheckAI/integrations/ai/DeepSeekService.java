package youcode.ma.SkillCheckAI.integrations.ai;

import lombok.RequiredArgsConstructor;
import org.springframework.ai.chat.client.ChatClient;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class DeepSeekService {

    private final ChatClient.Builder chatClientBuilder;

    public String demander(String prompt) {
        return chatClientBuilder
                .build()
                .prompt()
                .user(prompt)
                .call()
                .content();
    }
}
