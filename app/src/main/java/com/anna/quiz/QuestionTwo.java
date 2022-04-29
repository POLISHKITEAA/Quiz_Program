package com.anna.quiz;

public class QuestionTwo{
    public String[] questions = {
            "В какой стране кошки являются священными животными?",
            "В какой священной книге нет ни одного упоминания кошки?",
            "На гербе какой страны была изображена кошка, как символ независимости?",
            "Как называется группа пород бесшерстных котов?"
    };

    public String[][] choices = {
            {"Россия", "Япония", "Египет", "Италия"},
            {"Коран", "Библия", "Талмуд", "Танах"},
            {"Голландия", "Бразилия", "Шри-Ланка", "Литва"},
            {"Сфинкс", "Русская Гладкошерстная", "Ориентальная кошка", "Сиамская кошка"}
    };

    public String[] correctAnswer = {
            "Египет",
            "Библия",
            "Голландия",
            "Сфинкс"
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

