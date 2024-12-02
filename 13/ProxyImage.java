// заместитель для объекта класса RealImage
class ProxyImage implements Image{
    private String imageName;
    private RealImage realImage;

    public ProxyImage(String imageName) {
        this.imageName = imageName;
    }

    public void display() {
        if (realImage == null) {
            realImage = new RealImage(imageName);
        }
        realImage.display();
    }
}
