public class Rectangle {
    private int lenght;
    private int winth;


    Rectangle(int lenght, int winth) {
        this.lenght = lenght;
        this.winth = winth;
    }

    private int getLenght() {
        return lenght;
    }

    private void setLenght(int lenght) {
        this.lenght = lenght;
    }

    private int getWinth() {
        return winth;
    }

    private void setWinth(int winth) {
        this.winth = winth;
    }
    public int Method(int lenght, int winth){
        this.lenght = lenght;
        this.winth = winth;

        System.out.println(winth * lenght);


        return winth*lenght;
    }
}
