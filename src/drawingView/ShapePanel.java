package drawingView;

import javax.swing.JPanel;

import java.awt.*;
import java.awt.geom.*;
import java.util.ArrayList;

public class ShapePanel<Circle> extends JPanel
{
	
	private ArrayList<Rectangle> rectangleList;
	private ArrayList<Ellipse2D> ellipseList;
	private ArrayList<Ellipse2D> circleList;
	private ArrayList<Polygon> triangleList;
	private ArrayList<Polygon> polygonList;
	private ArrayList<Rectangle> squareList;
	
	public ShapePanel() 
	{
			rectangleList = new ArrayList<Rectangle>();
			ellipseList = new ArrayList<Ellipse2D>();
			circleList = new ArrayList<Ellipse2D>();
			triangleList = new ArrayList<Polygon>();
			polygonList = new ArrayList<Polygon>();
			squareList = new ArrayList<Rectangle>();
	}
	
		
	public void addRectangle()
	{
		int xPosition = (int) (Math.random() * getWidth());
		int yPosition = (int) (Math.random() * getHeight());
		int width = (int) (Math.random() * 100);
		int height = (int) (Math.random() * 100);
		
		rectangleList.add(new Rectangle(xPosition, yPosition, width, height));
		repaint();
		
	}
		
	public void addEllipse()
	{
		int xPosition = (int)(Math.random() * 1500);
		int yPosition = (int)(Math.random() * 1000);
		int width = (int)(Math.random() * 2000);
		int height = (int)(Math.random() * 1000);
		
		Ellipse2D currentEllipse = new Ellipse2D.Double(xPosition, yPosition, width, height);
		ellipseList.add(currentEllipse);
	}
		
	public void addCircle()
	{
		int xPosition = (int)(Math.random() * getWidth());
		int yPosition = (int)(Math.random() * getHeight());
		int width = (int)(Math.random() * 500);

		
		Ellipse2D currentCircle = new Ellipse2D.Double(xPosition, yPosition, width, width);
		circleList.add(currentCircle);		
	}
		
	public void addSquare()
	{
		int xPosition = (int) (Math.random() * getWidth());
		int yPosition = (int) (Math.random() * getHeight());
		int width = (int) (Math.random() * 100);
		int height = (int) (Math.random() * 100);
		
		Rectangle Square = new Rectangle(xPosition, yPosition, width, width);
		squareList.add(Square);
		repaint();		
	}
	
	public void addTriangle()
	{
		int [] xPoints = new int[3];
		xPoints[0] = (int)(Math.random() * getWidth());
		xPoints[1] = (int)(Math.random() * getWidth());
		xPoints[2] = (int)(Math.random() * getWidth());
		
		int [] yPoints = {(int)(Math.random() * getHeight()), (int)(Math.random() * getHeight()), (int)(Math.random() * getHeight())};
		
		Polygon triangle = new Polygon(xPoints, yPoints, 3);
		triangleList.add(triangle);
	}
	
	public void addPolygon()
	{
		int numberOfSides = (int)(Math.random() * 9) + 3;
		int [] xPoints = new int [numberOfSides];
		int [] yPoints = new int [numberOfSides];
		
		for(int side = 0; side < numberOfSides; side++)
		{
			xPoints[side] = (int)(Math.random() * getWidth());
			yPoints[side] = (int)(Math.random() * getHeight());
		}
		
		Polygon myPolygon = new Polygon(xPoints, yPoints, numberOfSides);
		polygonList.add(myPolygon);
	}
		
	@Override 
	protected void paintComponent(Graphics currentGraphics)
	{
		super.paintComponent(currentGraphics);
		Graphics2D mainGraphics = (Graphics2D) currentGraphics;
		
		for(Rectangle current : squareList)
			{
				int red = (int)(Math.random() * 256);
				int blue = (int)(Math.random() * 256);
				int green = (int)(Math.random() * 256);
				
				mainGraphics.setColor(new Color(red, blue, green));
				
				mainGraphics.draw(current);
			}
		
		for(Ellipse2D current : ellipseList)
			{
				int red = (int)(Math.random() * 256);
				int blue = (int)(Math.random() * 256);
				int green = (int)(Math.random() * 256);
				
				mainGraphics.setColor(new Color(red, blue, green));
				
				mainGraphics.draw(current);
			}
		
		for(Ellipse2D current : circleList)
			{
				int red = (int)(Math.random() * 256);
				int blue = (int)(Math.random() * 256);
				int green = (int)(Math.random() * 256);
				
				mainGraphics.setColor(new Color(red, blue, green));
				
				mainGraphics.draw(current);
			}
		
		for(Rectangle current : rectangleList)
			{
				int red = (int)(Math.random() * 256);
				int blue = (int)(Math.random() * 256);
				int green = (int)(Math.random() * 256);
				
				mainGraphics.setColor(new Color(red, blue, green));
				
				mainGraphics.draw(current);
			}
		
		for(Polygon currentTriangle : triangleList)
			{
				int red = (int)(Math.random() * 256);
				int blue = (int)(Math.random() * 256);
				int green = (int)(Math.random() * 256);
				
				int penSize = (int)(Math.random() * 10) + 3;
				mainGraphics.setColor(new Color(red, blue, green));
				mainGraphics.setStroke(new BasicStroke(penSize));
				
				mainGraphics.draw(currentTriangle);
			}
		
		for(Polygon current : polygonList)
			{
				int red = (int)(Math.random() * 256);
				int blue = (int)(Math.random() * 256);
				int green = (int)(Math.random() * 256);
				
				mainGraphics.setColor(new Color(red, blue, green));
				
				
				mainGraphics.fill(current);
			}
	}
	
	public void clear()
	{
		polygonList.clear();
		triangleList.clear();
		circleList.clear();
		squareList.clear();
		rectangleList.clear();
		ellipseList.clear();
	}
	
	
	
}
