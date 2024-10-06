package com.jammedev.vector.database_chatbot.askBotAboutDocumentation.controller;

import com.jammedev.vector.database_chatbot.askBotAboutDocumentation.dto.ChatRequest;
import com.jammedev.vector.database_chatbot.askBotAboutDocumentation.dto.ChatResponse;
import com.jammedev.vector.database_chatbot.askBotAboutDocumentation.service.GenerativeAIService;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")
public class AskBot {

    private final GenerativeAIService generativeAIService;

    public AskBot(GenerativeAIService generativeAIService) {
        this.generativeAIService = generativeAIService;
    }

    @PostMapping("/chat")
    public ChatResponse getChatResponse(@RequestBody ChatRequest request) {
        return new ChatResponse(generativeAIService.getResponse(request));
    }
}
