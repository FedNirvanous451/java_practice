// реальное изображение
class RealImage implements Image {
    private String imageName;

    public RealImage(String imageName) {
        this.imageName = imageName;
        loadfrom();
    }

    private void loadfrom() {
        System.out.println("Загрузка изображения " + imageName);
    }

    public void display() {
        System.out.println("Отображение фотографии " + imageName);
    }
}
