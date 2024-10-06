package com.jammedev.vector.database_chatbot.askBotAboutDocumentation.service;

import com.jammedev.vector.database_chatbot.askBotAboutDocumentation.dto.ChatResponse;
import dev.langchain4j.service.MemoryId;
import dev.langchain4j.service.SystemMessage;
import dev.langchain4j.service.UserMessage;

public interface Assistant {

    @SystemMessage(
            """
                    You are a internal chat service that answers questions from employees.
                    Answer only if you have been provided with an answer from RAG or tools, if not
                    just tell the user that you do not know the answer.
                    Finish each response with providing the name of the file that you found the information in.
            """
    )
    ChatResponse ask(@MemoryId Integer memoryId, @UserMessage String userMessage);

}
