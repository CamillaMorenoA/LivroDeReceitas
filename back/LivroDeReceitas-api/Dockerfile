# Usar imagem oficial do OpenJDK
FROM openjdk:17-jdk-alpine

# Definir diretório de trabalho dentro do container
WORKDIR /app

# Copiar o arquivo JAR gerado pelo build para dentro do container
COPY target/LivroDeReceitas-api-0.0.1-SNAPSHOT.jar app.jar

# Expõe a porta que a aplicação usa (ajuste conforme sua app)
EXPOSE 8080

# Comando para rodar a aplicação Java
ENTRYPOINT ["java", "-jar", "app.jar"]
