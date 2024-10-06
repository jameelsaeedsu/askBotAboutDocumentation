package com.jammedev.vector.database_chatbot.askBotAboutDocumentation;

import io.qdrant.client.QdrantClient;
import io.qdrant.client.QdrantGrpcClient;
import io.qdrant.client.grpc.Collections;
import jakarta.annotation.PostConstruct;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.concurrent.ExecutionException;

import static java.util.UUID.randomUUID;

@SpringBootApplication
public class AskBotAboutDocumentationApplication {

/*
	@PostConstruct
	public void createCollectionInQdrant() throws ExecutionException, InterruptedException {

		final String collectionName = "langchain4j-" + randomUUID();

		QdrantClient client = new QdrantClient(
				QdrantGrpcClient.newBuilder("localhost", 6334, false).build()
		);

		client.createCollectionAsync(
				collectionName,
				Collections.VectorParams.newBuilder()
						.setDistance(Collections.Distance.Cosine)
						.setSize(4096)
						.build()).get();
	}

 */



	public static void main(String[] args) {
		SpringApplication.run(AskBotAboutDocumentationApplication.class, args);
	}

}
