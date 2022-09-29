package org.mk.training.micro;


import io.swagger.v3.oas.models.OpenAPI;
import org.mk.training.micro.persistence.PatientEntity;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.event.ContextRefreshedEvent;
import org.springframework.context.event.EventListener;
import org.springframework.data.mapping.context.MappingContext;
import org.springframework.data.mongodb.core.ReactiveMongoOperations;
import org.springframework.data.mongodb.core.index.IndexResolver;
import org.springframework.data.mongodb.core.index.MongoPersistentEntityIndexResolver;
import org.springframework.data.mongodb.core.index.ReactiveIndexOperations;
import org.springframework.data.mongodb.core.mapping.MongoPersistentEntity;
import org.springframework.data.mongodb.core.mapping.MongoPersistentProperty;

@SpringBootApplication
@ComponentScan({"org.mk.training.micro"})
public class PatientServiceApplication {
	private static final Logger LOG = LoggerFactory.getLogger(PatientServiceApplication.class);
	@Autowired
	ReactiveMongoOperations mongoTemplate;

	public PatientServiceApplication() {
	}

	@Bean
	public OpenAPI getOpenApiDocumentation() {
		return new OpenAPI();
	}

	public static void main(String[] args) {
		ConfigurableApplicationContext ctx = SpringApplication.run(PatientServiceApplication.class, args);
		String mongodDbHost = ctx.getEnvironment().getProperty("spring.data.mongodb.host");
		String mongodDbPort = ctx.getEnvironment().getProperty("spring.data.mongodb.port");
		LOG.info("Connected to MongoDb: " + mongodDbHost + ":" + mongodDbPort);
	}

	@EventListener({ContextRefreshedEvent.class})
	public void initIndicesAfterStartup() {
		MappingContext<? extends MongoPersistentEntity<?>, MongoPersistentProperty> mappingContext = this.mongoTemplate.getConverter().getMappingContext();
		IndexResolver resolver = new MongoPersistentEntityIndexResolver(mappingContext);
		ReactiveIndexOperations indexOps = this.mongoTemplate.indexOps(PatientEntity.class);
		resolver.resolveIndexFor(PatientEntity.class).forEach((e) -> {
			String var10000 = (String)indexOps.ensureIndex(e).block();
		});
	}
}

