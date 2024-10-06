package com.jammedev.vector.database_chatbot.askBotAboutDocumentation.service;

import com.jammedev.vector.database_chatbot.askBotAboutDocumentation.dto.ChatRequest;

public interface GenerativeAIService {

    String getResponse(ChatRequest request);
}
