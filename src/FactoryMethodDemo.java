
public class FactoryMethodDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ShapeFactory shapeFactory = new ConcreteShapeFactory();
		
		Shape shape1 = shapeFactory.getShape("Circle");
		shape1.draw();
	}

}
