package com.anna.quiz;

public class QuestionThree {
    public String[] questions = {
            "К чему примета если кошка намывается у порога?",
            "Какой породы кошка похожа на рысь?",
            "Самая большая порода домашних кошек?",
            "Отпечаток чего у котиков так же уникален как и отпечаток пальца человека?"
    };

    public String[][] choices = {
            {"К гостям", "К беде", "К счастью", "К любви"},
            {"Мэй-кун", "Каракал", "бенгальская кошка", "Сервал"},
            {"Русская голубая", "Мей-кун", "Сибирская", "Норвежская лесная"},
            {"Лапы", "Хвоста", "Носа", "Прикус"}
    };

    public String[] correctAnswer = {
            "К гостям",
            "Каракал",
            "Мей-кун",
            "Носа"
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
