package br.edu.ifsul.academico.projetotadshdc.api.User;

public record RegisterDTO(String login, String password, UserRole role) {
}
