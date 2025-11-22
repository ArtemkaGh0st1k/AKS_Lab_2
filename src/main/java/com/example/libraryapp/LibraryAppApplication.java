package com.example.libraryapp;  // Пакет вашего проекта (может быть другим, если вы изменили)

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication  // Основная аннотация: включает авто-конфигурацию, сканирование компонентов и т.д.
public class LibraryAppApplication
{  // Имя класса — обычно [Artifact]Application, где Artifact = library-app

    public static void main(String[] args)
    {  // Точка входа
        SpringApplication.run(LibraryAppApplication.class, args);  // Запускает приложение
    }
}