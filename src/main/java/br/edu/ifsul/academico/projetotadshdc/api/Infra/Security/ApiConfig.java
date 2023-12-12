package br.edu.ifsul.academico.projetotadshdc.api.Infra.Security;

import io.swagger.v3.oas.annotations.OpenAPIDefinition;
import io.swagger.v3.oas.annotations.enums.SecuritySchemeIn;
import io.swagger.v3.oas.annotations.enums.SecuritySchemeType;
import io.swagger.v3.oas.annotations.info.Contact;
import io.swagger.v3.oas.annotations.info.Info;
import io.swagger.v3.oas.annotations.info.License;
import io.swagger.v3.oas.annotations.security.SecurityRequirement;
import io.swagger.v3.oas.annotations.security.SecurityScheme;
import io.swagger.v3.oas.annotations.servers.Server;

@OpenAPIDefinition(
      info = @Info(
              contact = @Contact(
                      name = "Lukas Raphael",
                      email = "lukas.rmdl@gmail.com",
                      url = "https://heroi-do-coliseu.vercel.app"
              ),
              description = "Documentação para o projeto Herói do Coliseu na disciplina Tads 2023",
              title = "HDC-TADS specification - Lukas Raphael",
              version = "1.0",
              license = @License(
                      name = "License name",
                      url = "https://some-url.com"
              ),
              termsOfService = "Terms of Service"
      ),
        servers = {
              @Server(
                      description = "local ENV",
                      url = "http://localhost:8080"
              )
        },
        security = {
              @SecurityRequirement(
                      name = "BearerAuth"
              )
        }
)
@SecurityScheme(
        name = "BearerAuth",
        description = "JWT auth description",
        scheme = "bearer",
        type = SecuritySchemeType.HTTP,
        bearerFormat = "JWT",
        in = SecuritySchemeIn.HEADER
)
public class ApiConfig {
}
