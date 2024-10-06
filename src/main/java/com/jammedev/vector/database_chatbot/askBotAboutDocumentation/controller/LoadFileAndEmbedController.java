package com.jammedev.vector.database_chatbot.askBotAboutDocumentation.controller;

import com.jammedev.vector.database_chatbot.askBotAboutDocumentation.config.EmbeddingConfig;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
@Slf4j
public class LoadFileAndEmbedController {

    private final EmbeddingConfig embeddingConfig;

    @GetMapping("/load/file/embed")
    public void loadSingle() {
        log.info("Loading document");
        embeddingConfig.loadDocument();
        log.info("Loading completed");
    }

}




