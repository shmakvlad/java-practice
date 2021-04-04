package Java;

public enum AnimEnum {
    DOG,
    FROG,
    CAT,
    CROCODILE("крокодил");

    private String translation;

    AnimEnum(){
    }

    AnimEnum(String translation){
        this.translation = translation;
    }

    public void getTranslation(){
        System.out.println(translation);
    }

    public String toString(){
        return "Перевод на русский язык: " + translation;
    }
}
