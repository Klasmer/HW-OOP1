import java.util.Arrays;

public class Main {


    public static void main(String[] args) {
        Gryffindor harryPotter = new Gryffindor("Гарри Поттер", 85, 4, 6, 8, 10);
        Gryffindor hermioneGranger = new Gryffindor("Гермиона Грейнджер", 80, 7, 7, 9, 4);
        Gryffindor ronWeasley = new Gryffindor("Рон Уизли", 75, 5, 4, 6, 4);


        Hufflepuff zachariaSmith = new Hufflepuff("Захария Смит", 84, 4, 5, 8, 3);
        Hufflepuff sedricDiggory = new Hufflepuff("Седрик Диггори", 65, 4, 3, 2, 5);
        Hufflepuff justinFinchFletchley = new Hufflepuff("Джастин Финч-Флетчли", 45, 6, 2, 3, 6);


        Ravenclaw choChang = new Ravenclaw("Чжоу Чанг", 65, 6, 8, 3, 1, 6);
        Ravenclaw padmaPatil = new Ravenclaw("Падма Патил", 76, 7, 8, 3, 5, 7);
        Ravenclaw marcusBelby = new Ravenclaw("Маркус Белби", 77, 8, 3, 5, 8, 4);


        Slytherin dracoMalfoy = new Slytherin("Драко Малфой", 80, 4, 2, 9, 5, 10, 7);
        Slytherin grehemMontegry = new Slytherin("Грэхэм Монтегю", 33, 2, 1, 3, 6, 1, 4);
        Slytherin gregoryGoyle = new Slytherin("Грегори Гойл", 25, 1, 2, 4, 3, 2, 6);


        //Описание Гриффиндорцев
        harryPotter.studentGriffindor();
        hermioneGranger.studentGriffindor();
        ronWeasley.studentGriffindor();

        //Описание Пуффендуйцев
        zachariaSmith.studentHyfflepuff();
        sedricDiggory.studentHyfflepuff();
        justinFinchFletchley.studentHyfflepuff();

        //Описание Когтевранцев
        choChang.studentRavenclaw();
        padmaPatil.studentRavenclaw();
        marcusBelby.studentRavenclaw();

        //Описание Слизеринцев
        dracoMalfoy.studentSlytherin();
        grehemMontegry.studentSlytherin();
        gregoryGoyle.studentSlytherin();

    }
}