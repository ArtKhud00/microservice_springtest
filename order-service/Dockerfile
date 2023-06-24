# Используйте базовый образ Eclipse Temurin 17
FROM eclipse-temurin:17-jdk

# Установите рабочую директорию в контейнере
WORKDIR /app

# Скопируйте JAR-файл сервиса в контейнер
COPY target/*.jar app.jar

# Укажите команду для запуска сервиса в контейнере
CMD ["java", "-jar", "app.jar"]