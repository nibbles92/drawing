package drawingView;

import java.awt.*;
import javax.swing.JPanel;

public class GraphPanel extends JPanel
{
	private int [] graphSource;
	
	public GraphPanel()
	{
		graphSource = new int [] {10, 20, 30, 40, 50, 60, 70};
		setupPanel();
	}
	
	@Override
	protected void paintComponent(Graphics currentGraphics)
	{
		super.paintComponent(currentGraphics);
		
		Graphics2D mainGraphics = (Graphics2D) currentGraphics;
		
		
		for(int index = 0; index < graphSource.length; index++)
			{
				int height = this.getHeight()/graphSource.length;
				int width = graphSource[index];
				int xPosition = 0;
				int yPosition = height * index;
				
				int red = (int)(Math.random() * 256);
				int green = (int)(Math.random() * 256);
				int blue = (int)(Math.random() * 256);
				int alpha = (int)(Math.random() * 25);
				
				mainGraphics.setColor(new Color( red, green, blue));
				
				mainGraphics.fill(new Rectangle(xPosition, yPosition, width, height));
			}
	}

	private void setupPanel()
		{
			this.setBackground(Color.LIGHT_GRAY);
			
		}
}
