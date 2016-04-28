package drawingView;

import java.awt.BasicStroke;
import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Rectangle;
import java.awt.Shape;
import java.awt.event.*;
import java.util.ArrayList;

import javax.swing.*;

import drawingController.DrawingController;

public class DrawingPanel extends JPanel
{
	private DrawingController baseController;
	
	private JButton CircleButton;
	private JButton EllipseButton;
	private JButton RectangleButton;
	private JButton TriangleButton;
	private JButton PolygonButton;
	private JButton SquareButton;
	private JButton ClearButton;
	private ShapePanel shapePanel;
	
	
	private SpringLayout baseLayout;
	
	private ArrayList<Rectangle> rectangleList;
	
	public DrawingPanel(DrawingController baseController)
	{
		this.baseController = baseController;
		baseLayout = new SpringLayout();
		shapePanel = new ShapePanel();
	
		
		rectangleList = new ArrayList<Rectangle>();
		RectangleButton = new JButton("Draw a rectangle");
		EllipseButton = new JButton("Draw a Ellipse");
		CircleButton = new JButton("Draw a circle");
		TriangleButton = new JButton("Draw a triangle");
		PolygonButton = new JButton("Draw a polygon");
		SquareButton = new JButton("Draw a square");
		ClearButton = new JButton("Clear");
		baseLayout.putConstraint(SpringLayout.NORTH, ClearButton, 10, SpringLayout.SOUTH, RectangleButton);
		baseLayout.putConstraint(SpringLayout.EAST, ClearButton, -10, SpringLayout.EAST, RectangleButton);
	

		setupPanel();
		setupLayout();
		setupListerners();
	}

	private void setupPanel()
		{
			this.setLayout(baseLayout);
			this.add(shapePanel);
			this.add(RectangleButton);
			this.add(SquareButton);
			this.add(TriangleButton);
			this.add(PolygonButton);
			this.add(CircleButton);
			this.add(EllipseButton);
			this.add(ClearButton);
		}
	
	private void setupLayout()
		{
			baseLayout.putConstraint(SpringLayout.WEST, RectangleButton, 0, SpringLayout.WEST, this);
			baseLayout.putConstraint(SpringLayout.NORTH, RectangleButton, 0, SpringLayout.NORTH, this);
			baseLayout.putConstraint(SpringLayout.SOUTH, TriangleButton, -166, SpringLayout.SOUTH, this);
			baseLayout.putConstraint(SpringLayout.WEST, PolygonButton, 0, SpringLayout.WEST, this);
			baseLayout.putConstraint(SpringLayout.WEST, TriangleButton, 0, SpringLayout.WEST, this);
			baseLayout.putConstraint(SpringLayout.WEST, CircleButton, 0, SpringLayout.WEST, this);
			baseLayout.putConstraint(SpringLayout.WEST, EllipseButton, 0, SpringLayout.WEST, this);
			baseLayout.putConstraint(SpringLayout.SOUTH, shapePanel, 0, SpringLayout.SOUTH, this);
			baseLayout.putConstraint(SpringLayout.EAST, shapePanel, 0, SpringLayout.EAST, this);
			baseLayout.putConstraint(SpringLayout.NORTH, SquareButton, 6, SpringLayout.SOUTH, PolygonButton);
			baseLayout.putConstraint(SpringLayout.WEST, SquareButton, 0, SpringLayout.WEST, RectangleButton);
			baseLayout.putConstraint(SpringLayout.SOUTH, SquareButton, -96, SpringLayout.SOUTH, this);
			baseLayout.putConstraint(SpringLayout.NORTH, PolygonButton, 6, SpringLayout.SOUTH, TriangleButton);
			baseLayout.putConstraint(SpringLayout.EAST, PolygonButton, 0, SpringLayout.EAST, RectangleButton);
			baseLayout.putConstraint(SpringLayout.SOUTH, EllipseButton, -6, SpringLayout.NORTH, TriangleButton);
			baseLayout.putConstraint(SpringLayout.EAST, TriangleButton, 0, SpringLayout.EAST, RectangleButton);
			baseLayout.putConstraint(SpringLayout.SOUTH, CircleButton, -6, SpringLayout.NORTH, EllipseButton);
			baseLayout.putConstraint(SpringLayout.EAST, CircleButton, -569, SpringLayout.EAST, this);
			baseLayout.putConstraint(SpringLayout.EAST, EllipseButton, 0, SpringLayout.EAST, RectangleButton);
			baseLayout.putConstraint(SpringLayout.NORTH, shapePanel, 0, SpringLayout.NORTH, this);
			baseLayout.putConstraint(SpringLayout.WEST, shapePanel, 150, SpringLayout.WEST, this);
			baseLayout.putConstraint(SpringLayout.EAST, RectangleButton, -569, SpringLayout.EAST, this);
			
		}
	
	private void setupListerners()
		{
			RectangleButton.addActionListener(new ActionListener()
				{
					public void actionPerformed(ActionEvent click)
					{
						shapePanel.addRectangle();
						
					}
				});
			
			PolygonButton.addActionListener(new ActionListener()
				{
						public void actionPerformed(ActionEvent click)
						{
							shapePanel.addPolygon();
							repaint();
						}
				});
			
			TriangleButton.addActionListener(new ActionListener()
				{
						public void actionPerformed(ActionEvent click)
						{
							shapePanel.addTriangle();
							repaint();
						}
				});
			
			SquareButton.addActionListener(new ActionListener() 
			{
				public void actionPerformed(ActionEvent click) 
				{
						shapePanel.addSquare();
						repaint();
				}
			});
			
			EllipseButton.addActionListener(new ActionListener() 
				{
					public void actionPerformed(ActionEvent click) 
					{
							shapePanel.addEllipse();
							repaint();
					}
				});
			
			CircleButton.addActionListener(new ActionListener() 
				{
					public void actionPerformed(ActionEvent click) 
					{
							shapePanel.addCircle();
							repaint();
					}
				});
			
			
		}
}
