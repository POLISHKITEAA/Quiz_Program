package com.anna.quiz;

public class Question {
    public String[] questions = {
            "Место обитания кота ученого:",
            "Главный специалист в поедании бутербродов:",
            "Какой кот был слепым и всегда носил черные очки?",
            "Эта представительница кошачьих была другом маугли:"
    };

    public String[][] choices = {
            {"Библиотека", "Дуб зеленый", "Лаборатория", "Дом"},
            {"Кот Матроскин", "Котенок Гав", "Леопольд", "Кот Василий"},
            {"Кот в сапагах", "Том", "Кот Котофеевич", "Кот Базилио"},
            {"Тигрица", "Багира", "Львица", "Рысь"}
    };

    public String[] correctAnswer = {
            "Дуб зеленый",
            "Кот Матроскин",
            "Кот Базилио",
            "Багира"
    };

    public String getQuestion(int a){
        return questions[a];
    }

    public String getchoice1(int a){
        return choices[a][0];
    }

    public String getchoice2(int a){
        return choices[a][1];
    }

    public String getchoice3(int a){
        return choices[a][2];
    }

    public String getchoice4(int a){
        return choices[a][3];
    }

    public String getCorrectAnswer(int a){
        return correctAnswer[a];
    }

}