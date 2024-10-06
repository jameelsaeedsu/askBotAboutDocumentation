package com.jammedev.vector.database_chatbot.askBotAboutDocumentation.service.impl;

import com.jammedev.vector.database_chatbot.askBotAboutDocumentation.dto.ChatRequest;
import com.jammedev.vector.database_chatbot.askBotAboutDocumentation.dto.ChatResponse;
import com.jammedev.vector.database_chatbot.askBotAboutDocumentation.service.Assistant;
import com.jammedev.vector.database_chatbot.askBotAboutDocumentation.service.GenerativeAIService;
import org.springframework.stereotype.Component;

@Component
public class GenerativeAIServiceImpl implements GenerativeAIService {

    private final Assistant assistant;

    public GenerativeAIServiceImpl(Assistant assistant) {
        this.assistant = assistant;
    }

    @Override
    public String getResponse(ChatRequest request) {

        ChatResponse chatResponse = assistant.ask(request.memoryId(), request.question());

        return chatResponse.response();
    }
}
