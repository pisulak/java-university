public class ShapeDecorator implements Shape{
    protected Shape decoratedShape;

    public ShapeDecorator(Shape decoratedShape) {
        this.decoratedShape = decoratedShape;
    }
    public String toSvg(String str){
        return decoratedShape.toSvg(str);
    }
}
